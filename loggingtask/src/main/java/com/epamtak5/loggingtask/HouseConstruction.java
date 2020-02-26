package com.epamtak5.loggingtask;

import java.io.IOException;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstruction 
{
	private static Logger LOGGER=LogManager.getLogger(Simpleandcompoundinterest.class);
   
	void valuesofmaterials() throws IOException
	{
    	Scanner sc = new Scanner(System.in);
  
    	LOGGER.debug("Choose Materials to Construct a House : "+"\n");
    	LOGGER.info("1.1200/- for Standard Materials"+"\n");
    	LOGGER.debug("2.1500/- for Above Standard Materials"+"\n");
    	LOGGER.error("3.1800/- for High Standard Materials"+"\n");
    	LOGGER.debug("4.2500/- for High Standard and Fully Automated"+"\n");
    	
    	int choice = sc.nextInt();
    	if(choice>=1&&choice<=4){
    		LOGGER.debug("Enter Area for Construction : ");
    		
    		int area = sc.nextInt();
    		LOGGER.info("Cost for Construction is : "+calculateCost(area,choice)+"\n");
    		
    	}
    	else{
    		LOGGER.debug("Enter Valid Choice...!"+"\n");
    		
    	}
    }

	private static float  calculateCost(int area, int choice) {
		// TODO Auto-generated method stub
		float cost = 0;
		switch(choice){
		case 1 : cost = area * 1200;
			break;
		case 2 : cost = area * 1500;
			break;
		case 3 : cost = area * 1800;
			break;
		case 4 : cost = area * 2500;
			break;
		}
		return cost;
	}
}

