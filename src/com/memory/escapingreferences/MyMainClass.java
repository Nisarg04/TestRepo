package com.memory.escapingreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyMainClass {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		 books.add(new Book(1,"Don Quixote","Miguel De Cervantes",3.99));
		 books.add(new Book(2,"Pilgrim's Progress","John Bunyan",4.45));
		 books.add(new Book(3,"Robinson Crusoe","Daniel Defoe",3.99));
		 books.add(new Book(4,"Gulliver's Travels","Jonathan Swift",7.60));
		 books.add(new Book(5,"Tom Jones","Henry Fielding",9.99));
		 books.add(new Book(6,"Clarissa","Samuel Richardson",4.45));
		 books.add(new Book(7,"Dangerous Liaisons","Pierre Choderlos De Laclos",11.50));
		 books.add(new Book(8,"Emma","Jane Austen",3.99));
		 books.add(new Book(9,"Frankenstein","Mary Shelley",7.60));
		 books.add(new Book(10,"The Count of Monte Christo","Alexandre Dumas",3.99));
		 
		 Consumer<Book> action = new Consumer<>() {
			@Override
			public void accept(Book t) {
				System.out.println(t);
			}
		};
		
		Consumer<Book> titleAction = i -> System.out.println(i.getTitle());
		Consumer<Book> priceAction = i -> System.out.println(i.getPrice());
		
		Predicate<Book> test = new Predicate<Book>() {
			@Override
			public boolean test(Book t) {
				return t.getId() < 4;
			}
		};
		
		Predicate<Book> test1 = t -> t.getId() > 4; 
		Predicate<Book> test2 = t -> t.getId() < 8;
		
		/*books.stream()
			 .filter(test1.and(test2))
			 .forEach(titleAction.andThen(priceAction));
		 */
		Function<Book, Double> priceOfBook = new Function<>() {
			@Override
			public Double apply(Book t) {
				return t.getPrice().convert("USD");
			}
		};
		
//		books.stream().forEach(i -> System.out.println(i.getPrice()));
		books.stream().map(priceOfBook).forEach(i -> System.out.println(i));
		
		Book book = null;
		Optional<Book> b = Optional.of(book);
		System.out.println(b.isPresent());
	}

}
