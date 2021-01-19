package main;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FooBaa{
	
	public void acendente() {
		
		int n = 100;
		for(int i = 1; i<=n; i++){
			if(i % 3 == 0)System.out.print("Foo");
			if(i%5==0)System.out.print("Baa");
			else if(i%3 != 0)System.out.print(i);
			System.out.println();
		}		
	}
	
	public void desendente() {
	
		int n = 5;
		for(int i = n; i>0; i--){
			if(i % 3 == 0)System.out.print("Foo");
			if(i%5==0)System.out.print("Baa");
			else if(i%3 != 0)System.out.print(i);
			System.out.println();
		}
	}

}

