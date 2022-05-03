/**
 * 
 */
package com.xinyi.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangxinyi
 *
 */
public class Mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hallo,world");
		System.out.println("Hi!I am" + System.getProperty("java.version") + '\n'+"What's your name?");
		
		Scanner in = new Scanner(System.in);
		
		String anwser = in.nextLine();
		System.out.println(anwser);
		
		in.close();
		
		RandomNumber mersenne = new MersenneTwister();
		
		double random = mersenne.getNext();
		System.out.println(Arrays.toString(random));

	}
	

}
