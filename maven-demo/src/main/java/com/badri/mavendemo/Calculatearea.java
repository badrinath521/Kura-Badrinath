package com.badri.mavendemo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Calculatearea {
	 public static void main( String[] args ) throws IOException
	 {
			Scanner sc = new Scanner(System.in);
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	bw.write(" please select option"+"\n");
	    	bw.flush();
	    	HouseConstruction a=new HouseConstruction();
	    	a.valuesofmaterials();
	 }

}
