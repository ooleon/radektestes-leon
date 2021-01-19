package main;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CalcularString{
	public static String ss = "Este é o String por padrao á ser calculado sem length";

	public static void main(String[] args) {
		leerString();
		System.out.println("tamano do String: " + calcular());
	}
	
	public static char[] leerString() {
		Scanner scan = new Scanner(System.in);
        //int i = scan.nextInt();
        //double d = scan.nextDouble();
        System.out.print("Introducir el texto:");
        String s = scan.nextLine();
        if (s.length() >0) ss=s;
        System.out.println("Texto a ser usado:\"" + ss + "\"");
        

		char [] charArray = ss.toCharArray();
		return charArray;
	}
	
	public static int calcular() {
		char [] charArray = ss.toCharArray();
		int lArray = 0;		
		while (true) {
			try {
				char c = charArray[lArray];
				lArray++;
			} catch (Exception e) {
				break;
			}
		}
		System.out.println();
		return lArray;
	}
}

