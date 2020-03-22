package com.aditya;

import java.util.*;
import java.io.*;
import java.lang.*;
public class App
{   
	public static void main(String[] args)
    	{
       		App ob=new App();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		System.out.println("New String="+ob.Remove(sc.next()));
	}
	public String Remove(String S)
	{
		S=S.toUpperCase();int ln=S.length();
		if(!S.equals("")){
			if(S.charAt(0)=='A')
				S=S.substring(1);
			if(S.length()>0)
				if(S.charAt(0)=='A')
					S=S.substring(1);
				else
					if((S.charAt(1)=='A') && (ln==S.length()))
						S=S.charAt(0)+S.substring(2);
					else
						S=S;
		}
		return(S);
	}
}
			
		 