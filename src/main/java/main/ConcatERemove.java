package main;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.apache.commons.lang3.StringUtils;


public class ConcatERemove{
	public static String erroStringInvalido ="O String debe ser preenchido com carecteres validos";
	
	public String s = "blak";
	public String t = "blabla";
	public int k;
	
	int lenghtMaior =0;
	int lenghtMenor =0;

	public static void main(String[] args) {
		ConcatERemove cr = new ConcatERemove();
		cr.lerString();
		System.out.println(cr.concatERemove(cr.s, cr.t, cr.k));
		
	}
	
	private String concatERemove(String s1, String t1, int k1) {
		this.s=s1;
		this.t=t1;
		this.k=k1;
		return calcular();
	}

	public void calcularTamanoString() {
		lenghtMaior = Math.max(s.length(), t.length());
		lenghtMenor = Math.min(s.length(), t.length());
		
	}
	public String calcular() {
		
		int posicionDiferente=0;
		int operacionesParaRemover=0;
		int operacionesParaConcatenar=0;
		int operacionesTotales=0;

        calcularTamanoString();
		posicionDiferente = mPosDiferente();
		
		operacionesParaRemover=operacionesParaRemover(posicionDiferente);
		
		operacionesParaConcatenar=operacionesParaConcatenar(posicionDiferente);
		
		operacionesTotales=operacionesParaRemover + operacionesParaConcatenar;
	
		return operacionesTotales==k? "Sim" : "Nao";
	}

	private int operacionesParaConcatenar(int posicionDiferente) {
		int oPConcatenar=0;
		if(posicionDiferente==-1) {
			if(s.length()>=t.length()) {
				//t esta en s o iguales
				oPConcatenar=0;
			}else {
				//s esta en t
				oPConcatenar=t.length() - s.length();
			}
		}else {
			oPConcatenar=t.length() - posicionDiferente;
		}
		return oPConcatenar;
	}

	public int operacionesParaRemover(int posicionDiferente) {
		int oPRemover=0;
	
		if(posicionDiferente==-1) {
			if(s.length()>=t.length()) {
				//t esta en s
				oPRemover=s.length() - t.length();
			}else {
				//s esta en t
				oPRemover=0;
			}
		}else {
			oPRemover=s.length() - posicionDiferente;
		}
		return oPRemover;
	}

	public int mPosDiferente() {
        int k = 0;
        int posicionDiferente= -1;
        while (k < lenghtMenor) {        	
        	if (s.charAt(k) != t.charAt(k)){
        		posicionDiferente=k;
				break;
        	}
            k++;
        }
        return posicionDiferente;
	}

	public String concatenar(String temp) {
//		temp;
		return temp;
	}

	public String  remover(String temp) {
		return temp;
	}

	
	public void lerString() {
		Scanner scan = new Scanner(System.in);

        this.s = scan.nextLine();
        this.s=StringUtils.lowerCase(this.s);
        if (!(this.s.length() >=1 && this.s.length() <= 100 )) {
        	System.out.println(erroStringInvalido);
        	System.out.println();
        	throw new NoSuchElementException();
        }
        
        this.t = scan.nextLine();
        this.t=StringUtils.lowerCase(this.t);
        if (!(this.t.length() >=1 && this.t.length() <= 100 )) {
        	System.out.println(erroStringInvalido);
        	System.out.println();
        	throw new NoSuchElementException();
        }

        try {        	
        	this.k = scan.nextInt();
        	scan.nextLine();
        	if (this.k <1 || this.k >100) {
        		throw new InputMismatchException();
        		}
        }catch (InputMismatchException e) {
        	throw e;
		}
        catch (Exception e) {
        	System.out.println("Error ingresando k");
        	System.out.println();
        	throw e;
		}
	}
	
}

