package com.journaldev.concurrency;
import java.util.*;
import java.util.concurrent.*;

public class Stats {
	
	static class Stocks {
		private double price;
		private String symbol;
		
		public Stocks(double price, String symbol) {
			this.price = price;
			this.symbol = symbol;
		}
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
	}
	
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {

		private List<Stocks> allSymbols = new ArrayList<>();
		
		@Override
		public void putNewPrice(String symbol, double price) {
			synchronized(this) {
				Stocks temp = new Stocks(price, symbol);
				allSymbols.add(temp);
			}
		}

		@Override
		public double getAveragePrice(String symbol) {
			synchronized(this) {
				double sum = allSymbols.stream()
								.filter(i -> symbol.equals(i.getSymbol()))
								.mapToDouble(i -> i.getPrice())
								.sum();
				int count = (int)allSymbols.stream()
								.filter(i -> symbol.equals(i.getSymbol()))
								.count();
				
				return sum/count;
			}
		}

		@Override
		public int getTickCount(String symbol) {
			synchronized (this) {
				return (int) allSymbols.stream()
							.filter(i -> symbol.equals(i.getSymbol()))
							.count();
			}
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {
///1,ibm 22.22,aapl 33.33,ibm 44.44,aapl 55.55,ib 66.66
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}