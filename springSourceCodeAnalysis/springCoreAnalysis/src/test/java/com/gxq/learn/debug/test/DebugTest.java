package com.gxq.learn.debug.test;


public class DebugTest {

	public static void main(String[] args) {
		long sum = 0l;
		for(int i=0; i<100000; i++) {
			sum+=i;
		}
		System.out.println(sum);
		//Bag b = new Bag(1);
	}

}
