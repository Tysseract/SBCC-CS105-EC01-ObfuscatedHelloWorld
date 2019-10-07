/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: Obfuscated Hello World
 *
 * @description I hope this is a confusing and creative enough way of printing out "Hello, World!" sans quotations
 *
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 *
 * @author Mattys C vanZeyl
 * @website https://www.tysseract.net
 */

package edu.sbcc.cs105;

import java.util.Random;

public class ObfuscatedHelloWorld {

	private static String contactAttempt = "Alien Message";
	private static int leftCount1 = 0;

	private static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	private static void waitFor(int howLongToWait) {
		try        
		{
		    Thread.sleep(howLongToWait);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
	
//	public static String printWhat2(int j) {
//
//	}
//
//	public static void printChunk2(i) {
//		String initialSeed = "";
//		do {
//
//		}while()
//	}

//	public static void end2() {
//		for(int i=1; i <= 20; i++) {
//			int howLongToWait = 300; //miliseconds
//
//			printChunk2(i);
//
//			waitFor(howLongToWait);
//
//		}
//	}

	private static String printWhat(int i, int j) {
		String print = "";

		if(i%4 == 0) {
			if(j == 2)      print = "      *       *      ";
			else if(j == 3) print = "*                   *";
			else if(j == 4) print = "    " + contactAttempt + "    ";
			else if(j == 5) print = "                     ";
			else if(j == 6) print = "  *       *       *  ";
		}
		if(i%4 == 1) {
			if(j == 2)      print = "*       *       *    ";
			else if(j == 3) print = "                     ";
			else if(j == 4) print = "    " + contactAttempt + "   *";
			else if(j == 5) print = "                     ";
			else if(j == 6) print = "*       *       *    ";
		}
		if(i%4 == 2) {
			if(j == 2)      print = "  *       *       *  ";
			else if(j == 3) print = "                     ";
			else if(j == 4) print = "    " + contactAttempt + "    ";
			else if(j == 5) print = "*                   *";
			else if(j == 6) print = "      *       *      ";
		}
		if(i%4 == 3) {
			if(j == 2)      print = "    *       *       *";
			else if(j == 3) print = "                     ";
			else if(j == 4) print = "*   " + contactAttempt + "    ";
			else if(j == 5) print = "                     ";
			else if(j == 6) print = "    *       *       *";
		}
		//if(j == 1 || j == 7) print = "";
		return print;
	}

	private static void printChunk(int i) {
		StringBuilder chunk = new StringBuilder();
		for(int j=1; j <= 7; j++) {
			chunk.append(printWhat(i, j));
			chunk.append("\r\n");
		}
		System.out.print(chunk.toString());
	}

	private static void end() {
		int howLongToWaitBetween = 300;//milliseconds
		int howManyTimes = 30;
		for(int i=1; i <= howManyTimes; i++) {
			
			printChunk(i);
			
			waitFor(howLongToWaitBetween);
			
		}
	}

	private static byte seed(int x) {
		double y = -(37 * Math.pow(x,11))/570240 + (18967 * Math.pow(x,10))/3628800 - (19153 * Math.pow(x,9))/103680 + (455699 * Math.pow(x,8))/120960 - (494327 * Math.pow(x,7))/10080 + (73543171 * Math.pow(x,6))/172800 - (258914477 * Math.pow(x,5))/103680 + (223081373 * Math.pow(x,4))/22680 - (655059671 * Math.pow(x,3))/25920 + (1006150093 * Math.pow(x,2))/25200 - (95429329 * x)/2772 + 12125;
		byte z = (byte) y;
		if(x == 13)z = 33;
		return z;
	}

	private static byte Rando(byte lastRando, byte expectedRando) {
		Random rand = new Random();
		byte rando = lastRando;
		
		if(lastRando != expectedRando) rando = (byte) (Math.abs((byte) rand.nextInt(95)) + 31);
		
		return rando;
	}

	private static void GetOut() {
		StringBuilder contactAttemptBuilder = new StringBuilder();
		for(int i=0; i <= 12; i++) {
			contactAttemptBuilder.append((char)seed(i+1));
		}
		contactAttempt = contactAttemptBuilder.toString();
	}

	private static boolean Contact(int attemptIndex) {
		String lastContactAttempt = contactAttempt;
		StringBuilder contactAttemptBuilder = new StringBuilder();

		boolean firstContactMade = false;
		
		for(int i=0; i <= 12; i++) {
			contactAttemptBuilder.append((char)Rando((byte)(int)lastContactAttempt.charAt(i),(byte)seed(i+1)));
		}
		contactAttempt = contactAttemptBuilder.toString();
		
		int contactValue = 0;
		for(int i=0; i < contactAttempt.length(); i++) {
			contactValue = contactValue + (int) contactAttempt.charAt(i);
		}
		
		int sucessNum = 0;
		for(int i=0; i <= 12; i++) {
			if((int)contactAttempt.charAt(i) == (int) seed(i+1)) sucessNum++;
		}
		
		if(attemptIndex >= 1000) GetOut();
		
		if(sucessNum == 12) {
			leftCount1++;
			if(leftCount1 >= 25) {
				GetOut();
			}
		}
		
			
		if(1129 == contactValue) {
			firstContactMade = sucessNum == 13;
		}
		
		//wait
		
		waitFor(50);
		
		//stop waiting
		
		System.out.println(contactAttempt);
		return firstContactMade;
	}

	public static void main(String[] args) {
		
		int i = 0;
		
		double[] fibonacci = new double[1000];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		double goldenRatio = 1.61803;
		
		int primeIndex = 0;
		int[] primes = new int[1000];
		
		double pi = 0;
		double lastPiApprox;
		double currentPiApprox = 0;
		
		while(!Contact(i)) {
			
			fibonacci[i + 2] = fibonacci[i + 1] + fibonacci[i];
			goldenRatio = fibonacci[i + 1] / fibonacci[i];
			
			if(isPrime(i)) {
				primes[primeIndex] = i;
				primeIndex++;
			}
			
			
			lastPiApprox = currentPiApprox;
			
			if(i%2 == 0) {
						double denom = (i * 2) + 1;
						currentPiApprox = currentPiApprox + (4.0 / denom);
					}
			else {
						double denom = (i * 2) + 1;
						currentPiApprox = currentPiApprox - (4.0 / denom);
					}
			pi = (lastPiApprox + currentPiApprox)/2.0;
			
			i++;
		}
		
		/*
		for(byte i=0;i<=126;i++) {
			short alien = i;
			System.out.println(alien + " " + (char)(int)alien);
		}
		*/
		
		end();
		
		System.out.println("itterations: ");
		System.out.println(i);
		
		System.out.println();
		
		System.out.println("last fibonacci: ");
		System.out.println(fibonacci[i]);
		
		System.out.println();
		
		System.out.println("approximate golden ratio: ");
		System.out.println(goldenRatio);
		
		System.out.println();
		
		System.out.println("Leibniz's approximate pi (to " + i + " itterations): ");
		System.out.println(pi);
		System.out.println("?= real pi: " + Math.PI);
		
	}

}
