package com.badri.mavendemo;
import java.io.IOException;

public class CalculateInterest 
{
    public static void main( String[] args ) throws IOException
    {
        Simpleandcompoundinterest simpleinterest= new Simpleandcompoundinterest();
    	 simpleinterest.readvalues();
    	 simpleinterest.calculateSimpleInterestandCompoundInterest();
    	 simpleinterest.displayamount();
    	
    }
}

