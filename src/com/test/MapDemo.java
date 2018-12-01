package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

class MapDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Map<SampleKey, Integer> map = new LinkedHashMap<>();
		SampleKey k1 = new SampleKey("Vishal",1);
		SampleKey k2 = new SampleKey("Vishal",2);
		SampleKey k3 = new SampleKey("Ramesh",3);
		SampleKey k4 = new SampleKey("Suresh",4);
		SampleKey k5 = new SampleKey("Wuresh",5);
		SampleKey k6= new SampleKey("Lucky",5);
		SampleKey k7 = new SampleKey("Nisarg",9);
		
		map.put(k1,25);
		map.put(k3,23);
		map.put(k2,24);
		map.put(k4,35);
		map.put(k5,76);
		map.put(k6,76);
		map.put(k7,87);
		
		System.out.println(k1.key + " " + (k1.hashCode() & 15));
		System.out.println(k2.key + " " + (k2.hashCode() & 15));
		System.out.println(k3.key + " " + (k3.hashCode() & 15));
		System.out.println(k4.key + " " + (k4.hashCode() & 15));
		System.out.println(k5.key + " " + (k5.hashCode() & 15));
		System.out.println(k6.key + " " + (k6.hashCode() & 15));
		System.out.println(k7.key + " " + (k7.hashCode() & 15));
		
		System.out.println(map);
		
		
	}	
}

class SampleKey
{
	String key;
	int d;
	SampleKey(String key, int d)
	{
		this.key = key;
		this.d = d;
	}

	@Override
	public int hashCode() {
		return (int)key.charAt(0) * 13;
	}

	@Override
	public String toString() {
		return key+":"+d ;
	}

	@Override
	public boolean equals(Object obj) {
		SampleKey other = (SampleKey) obj;
		
		return this.key.equals(other.key);
	}

	
}