package com.lgs.lab.interface2;

public class MyCalcApp {

	public static void main(String[] args) {
		MyCalculator calcul1 = new MyCalculator(100, 24);
		calcul1.plus();
		calcul1.minus();
		calcul1.multiply();
		calcul1.divide();
	}

}
