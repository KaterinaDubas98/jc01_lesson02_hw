package com.edu.home02.start;

public class task04 {

	public static void main(String[] args) {
		int n; 
		int m;
		int volAllSmallCan;
		double volOneSmallCan;
		double volOneBigCan;
		double volAllBigCan;
		
		n = 10;
		m = 11;
		volAllSmallCan = 80;
		volOneSmallCan = volAllSmallCan/n;
		volOneBigCan = volOneSmallCan + 12;
		volAllBigCan = volOneBigCan * m;
		
		System.out.println ("имеющееся колличество малых бидонов = " + n);
		System.out.println ("имеющееся колличество больших бидонов = " + m);
		System.out.println ("объём малого бидона = " + volOneSmallCan + " а большого = " + volOneBigCan);
		System.out.println ("объём молока во всех больших бидонах = " + volAllBigCan);
		
		
	
		

		

	}

}
