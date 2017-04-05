package com.test;

public class displayClass {

	public static void main(String[] args) {

		String s = "overrideBillingPreference|bypassCaptureConsumerID";

		String str = new String("Java String Methods");


		System.out.println(s.matches("overrideBillingPreference(*)"));

		System.out.println(str.matches("(.*)String(.*)"));


	}
}
