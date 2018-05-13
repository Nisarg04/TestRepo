package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

class Test extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Map<Key, Integer> map = new LinkedHashMap<>();
		Key k1 = new Key("Vishal",1);
		Key k2 = new Key("Vishal",2);
		Key k3 = new Key("Ramesh",3);
		Key k4 = new Key("Suresh",4);
		Key k5 = new Key("Wuresh",5);

		map.put(k1,25);
		map.put(k3,23);
		map.put(k2,24);
		map.put(k4,35);
		map.put(k5,76);
		
		System.out.println(k1.key + " " + (k1.hashCode() & 15));
		System.out.println(k2.key + " " + (k2.hashCode() & 15));
		System.out.println(k3.key + " " + (k3.hashCode() & 15));
		System.out.println(k4.key + " " + (k4.hashCode() & 15));
		System.out.println(k5.key + " " + (k5.hashCode() & 15));
		System.out.println(map);
		
		
	}	
}

class Key
{
	String key;
	int d;
	Key(String key, int d)
	{
		this.key = key;
		this.d = d;
	}

	@Override
	public int hashCode() {
		return (int)key.charAt(0);
	}

	@Override
	public String toString() {
		return key+":"+d ;
	}

	@Override
	public boolean equals(Object obj) {
		Key other = (Key) obj;
		
		return this.key.equals(other.key);
	}

	
}