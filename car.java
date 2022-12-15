package com.java.inheritence;

public class car extends vehicle {
	public car() {
		super();
	}

	public car(int numberOfTyres, int mileage) {
		super(4, 20);
	}

	public static void main(String args[]) {
		vehicle vch = new car(4, 20);
		
	}

}
