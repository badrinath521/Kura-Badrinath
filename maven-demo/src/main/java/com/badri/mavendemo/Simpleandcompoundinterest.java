package com.badri.mavendemo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class Simpleandcompoundinterest
{
 double principleamount, rateofinterest, no_of_years, simpleinterest,compoundinterest;
 void readvalues() throws IOException
 {
    Scanner sc=new Scanner (System. in);
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("Enter the principleamount:");
    bw.flush();
    principleamount=sc.nextDouble();
    bw.write("Enter the rate of interest:");
    bw.flush();
    rateofinterest=sc.nextDouble();
    bw.write("Enter the no of years");
    bw.flush();
    no_of_years=sc.nextDouble();
 }
 void calculateSimpleInterestandCompoundInterest()
 {
    simpleinterest=(principleamount * rateofinterest*no_of_years)/100;
    compoundinterest=principleamount * Math.pow(1.0+rateofinterest/100.0,no_of_years) - principleamount;
 }
 void displayamount() throws IOException
 {
	 BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     bw.write("Simple Interest="+simpleinterest);
     bw.flush();
     bw.write("Compound Interest="+compoundinterest);
     bw.flush();
 }
}

