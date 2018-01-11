package com.app.client;

import javax.xml.ws.Service;

import com.app.provier.Calculation;
import com.app.provier.CalculationService;

public class CalculationClient 
{
	public static void main(String[] args) 
	{
		// create object for service class
		CalculationService calc=new CalculationService();
		// create object for port type with reference of service 
		Calculation c=calc.getCalculationPort();
	    int res=c.doSum(7, 8);
	    System.out.println("reslut"+res);
	}
	

	

}
