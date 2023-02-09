package org.lessons.java;

public class Calculator {
	
	private float num1;
	private float num2;
	public Calculator() {
		super();
		
	}
	public float getNum1() {
		return num1;
	}
	public float getNum2() {
		return num2;
	}
	
	public float add( float num1,  float num2) {
		float sum = num1 + num2;
		return sum;
	}
	
	
	public float substract(float num1,  float num2) throws Exception {
		float resultSubstract = num1 - num2;
		
		if(num1<num2) {
			throw new Exception("il primo numero non può essere inferiore al secondo");
		}else {
			return resultSubstract;
		}
		
		
	}
	
	public float divide(float num1,  float num2) throws Exception {
		float resultDivide = num1 / num2;
		
		if(num1<num2) {
			throw new Exception("il primo numero non può essere inferiore al secondo");
		}else {
			return resultDivide;
		}
	}
	
	
	public float multiply(float num1,  float num2) throws Exception {
		float resultMultiply = num1 * num2;
		if(num1 > 0 && num2 > 0) {
			return resultMultiply;
		}else {
			throw new Exception("i numeri non può essere inferiore a 0");
		}
		
	}
}
