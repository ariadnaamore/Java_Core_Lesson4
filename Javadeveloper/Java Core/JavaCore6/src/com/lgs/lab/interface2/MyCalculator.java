package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	int a;
	int b;
	double c;

	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public void plus() {
		System.out.println("a+b = " + (this.getA() + this.getB()));

	}

	@Override
	public void minus() {
		System.out.println("a-b = " + (this.getA() - this.getB()));

	}

	@Override
	public void divide() {
		c = a / b;
		System.out.println("a/b = " + c);

	}

	@Override
	public void multiply() {
		System.out.println("a*b = " + (this.getA() * this.getB()));

	}

}
