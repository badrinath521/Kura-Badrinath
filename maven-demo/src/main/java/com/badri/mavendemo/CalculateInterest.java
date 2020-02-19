package com.badri.mavendemo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CalculateInterest 
{
    public static void main( String[] args ) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("1.Simple Interest and compound interest is"+"\n");
    	bw.flush();
        Simpleandcompoundinterest simpleinterest= new Simpleandcompoundinterest();
    	 simpleinterest.readvalues();
    	 simpleinterest.calculateSimpleInterestandCompoundInterest();
    	 simpleinterest.displayamount();
    	bw.flush();
    }
}

