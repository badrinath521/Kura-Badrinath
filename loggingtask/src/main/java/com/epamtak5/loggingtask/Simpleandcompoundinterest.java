package com.epamtak5.loggingtask;

import java.io.IOException;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Simpleandcompoundinterest
{
	private static Logger LOGGER=LogManager.getLogger(Simpleandcompoundinterest.class);
 double principleamount, rateofinterest, no_of_years, simpleinterest,compoundinterest;
 void readvalues() throws IOException
 {
    Scanner sc=new Scanner (System. in);
  
    LOGGER.debug("enter the principle amount");
    principleamount=sc.nextDouble();
    
    LOGGER.info("enter the principle amount");
    rateofinterest=sc.nextDouble();
    
    LOGGER.debug("enter the no of years");
    no_of_years=sc.nextDouble();
 }
 void calculateSimpleInterestandCompoundInterest()
 {
    simpleinterest=(principleamount * rateofinterest*no_of_years)/100;
    compoundinterest=principleamount * Math.pow(1.0+rateofinterest/100.0,no_of_years) - principleamount;
 }
 void displayamount() throws IOException
 {
	
	 LOGGER.info("Simple Interest="+simpleinterest);
	 LOGGER.debug("Compound Interest="+compoundinterest);
 }
}
