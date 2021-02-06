package main;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConcatERemoveTests {
	private ConcatERemove cr;
	
	public String s;
	public String t;
	public int k;
	
	@BeforeEach
	public void contextLoads() {
		
	}
	@AfterEach
	public void contextExit() {
		System.out.println();
	}
	
	@Test
	public void mPosDiferente1() {
		cr = new ConcatERemove();
		System.out.println("inicio Test mPosDiferente1");
		String s = "blablablabla";
		String t = "blablabcde";
		int k=8;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println("mPosDiferente: " + cr.mPosDiferente());
	}

	@Test
	public void mPosDiferente2() {
		cr = new ConcatERemove();
		System.out.println("inicio Test mPosDiferente2");
		String s = "blablabcde";
		String t = "b";
		int k=8;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println("mPosDiferente: " + cr.mPosDiferente());
	}

	@Test
	public void mPosDiferente3() {
		cr = new ConcatERemove();
		System.out.println("inicio Test mPosDiferente3");
		String s = "b";
		String t = "blablabcde";
		int k=8;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println("mPosDiferente: " + cr.mPosDiferente());
		
	}

	@Test
	public void mPosDiferente4() {
		cr = new ConcatERemove();
		System.out.println("inicio Test mPosDiferente4");
		String s = "s";
		String t = "blablabcde";
		int k=8;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println("mPosDiferente: " + cr.mPosDiferente());		
	}

	@Test
	public void mPosDiferente5() {
		cr = new ConcatERemove();
		System.out.println("inicio Test mPosDiferente5");
		String s = "blablabcde";
		String t = "s";
		int k=8;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println("mPosDiferente: " + cr.mPosDiferente());		
	}

	@Test
	public void calcular1() {
		cr = new ConcatERemove();
		System.out.println("inicio Test calcular1");
		String s = "blablablabla";
		String t = "blablabcde";
		int k=8;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println(cr.calcular());
	}

	@Test
	public void calcular2() {
		cr = new ConcatERemove();
		System.out.println("inicio Test calcular2");
		String s = "";
		String t = "blablabcde";
		int k=10;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println(cr.calcular());
	}

	@Test
	public void calcular3() {
		cr = new ConcatERemove();
		System.out.println("inicio Test calcular3");
		String s = "blc";
		String t = "blxyz";
		int k=4;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println(cr.calcular());
		
	}

	@Test
	public void calcular4() {
		cr = new ConcatERemove();
		System.out.println("inicio Test calcular4");
		String s = "blablablabla";
		String t = "blc";
		int k=11;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println(cr.calcular());
	}

	@Test
	public void calcular_igual() {
		cr = new ConcatERemove();
		System.out.println("inicio Test calcular_igual");
		String s = "bla";
		String t = "bla";
		int k=0;
		cr.s=s; //blablablabla
		cr.t=t; //blablabcde
		cr.k=k;
		System.out.println(cr.calcular());
	}

	
}

