package edu.sbcc.cs105;

import java.util.Random;
import java.util.concurrent.TimeUnit;

//72 101 108 108 111 44 32 87 111 114 108 100 33
public class ObfuscatedHelloWorld {
	
	public static String contactAttempt = null;
	
	public static void end() {
		for(int i=1; i <= 100; i++) {
			System.out.println("");
			System.out.println("      *       *      ");
			System.out.println("*                   *");
			System.out.println("    " + contactAttempt + "    ");
			System.out.println("                     ");
			System.out.println("  *       *       *  ");
			System.out.println("");
			
			try        
			{
			    Thread.sleep(300);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			
			System.out.println("");
			System.out.println("*       *       *    ");
			System.out.println("                     ");
			System.out.println("    " + contactAttempt + "   *");
			System.out.println("                     ");
			System.out.println("*       *       *    ");
			System.out.println("");
			
			try        
			{
			    Thread.sleep(300);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			
			System.out.println("");
			System.out.println("  *       *       *  ");
			System.out.println("                     ");
			System.out.println("    " + contactAttempt + "    ");
			System.out.println("*                   *");
			System.out.println("      *       *      ");
			System.out.println("");
			
			try        
			{
			    Thread.sleep(300);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			
			System.out.println("");
			System.out.println("    *       *       *");
			System.out.println("                     ");
			System.out.println("*   " + contactAttempt + "    ");
			System.out.println("                     ");
			System.out.println("    *       *       *");
			System.out.println("");
			
			try        
			{
			    Thread.sleep(300);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
			
			}
	}
	
	public static byte seed(int x) {
		double y = -(37 * Math.pow(x,11))/570240 + (18967 * Math.pow(x,10))/3628800 - (19153 * Math.pow(x,9))/103680 + (455699 * Math.pow(x,8))/120960 - (494327 * Math.pow(x,7))/10080 + (73543171 * Math.pow(x,6))/172800 - (258914477 * Math.pow(x,5))/103680 + (223081373 * Math.pow(x,4))/22680 - (655059671 * Math.pow(x,3))/25920 + (1006150093 * Math.pow(x,2))/25200 - (95429329 * x)/2772 + 12125;
		byte z = (byte) y;
		if(x == 13)z = 33;
		return z;
	}
	
	public static byte Rando(byte lastRando, byte expectedRando) {
		Random rand = new Random();
		byte rando = lastRando;
		
		if(lastRando != expectedRando) rando = (byte) Math.abs((byte) rand.nextInt());
		
		return rando;
	}
	
	public static boolean Contact(String lastContactAttempt, byte seed) {
		contactAttempt = null;
		boolean firstContactMade = false;
		
		for(int i=0; i <= 12; i++) {
		contactAttempt = contactAttempt + (char)Rando((byte)(int)lastContactAttempt.charAt(i),seed(i+1));
		}
		
		int contactValue = 0;
		for(int i=0; i < contactAttempt.length(); i++) {
			contactValue = contactValue + (int) contactAttempt.charAt(i);
		}
		
		int successNum = 0;
		if(1096 == contactValue) {
			for(int i=0; i <= 12; i++) {
				if((int)contactAttempt.charAt(i) == (int) seed(i+1));
			}
		}
		
		firstContactMade = successNum == 13;
		System.out.println(contactAttempt);
		return firstContactMade;
	}
	
	public static void main(String[] args) {
		
		/*
		byte seed = 0;
		int i = 0;
		while(!Contact(seed)) {
			i++;
			
		}
		
		* * * * * * * * * * *
		*                   *
		*   Hello, World!   *
		*                   *
		* * * * * * * * * * *
		
		*   *   *   *   *   *
		                     
		*   Hello, World!   *
		                     
		*   *   *   *   *   *

		  *   *   *   *   *  
		*                   *
		    Hello, World!    
		*                   *
		  *   *   *   *   *  
		  
		 
		* *     *     *     *
		                     
		    Hello, World!    
		*                   *
		    *     *     *    
		
		* * * * * * * * * * *
		*                   *
		*   Hello, World!   *
		*                   *
		* * * * * * * * * * *
		
		* * * * * * * * * * *
		*                   *
		*   Hello, World!   *
		*                   *
		* * * * * * * * * * *
		
		
		//for(byte i=0;i<=126;i++) {
			//short alien = i;
			//System.out.println(alien + " " + (char)(int)alien);
		//}
		
		//String hello = "Hello, World";
		//int helloNum = 0;
		//for(int i=0; i < hello.length(); i++) {
		//	helloNum = helloNum + hello.charAt(i);
		//}
		System.out.println(helloNum);
		*/
		
		
		end();
		
	}

}
