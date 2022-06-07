package edu.orangecoastcollege.cs170.ctaylor82.ic28;

import java.awt.Color;

public class Parallelogram extends Shape2D {

	private int mHeight;
	private int mBase;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return mBase * mHeight;
	}

	public Parallelogram(int height, int base, int x, int y, Color color) {
		mHeight = height;
		mBase = base;
		mX = x;
		mY = y;
		mColor = color;
	}

	public int getHeight() {
		return mHeight;
	}

	public void setHeight(int height) {
		mHeight = height;
	}

	public int getBase() {
		return mBase;
	}

	public void setBase(int base) {
		mBase = base;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mBase;
		result = prime * result + mHeight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parallelogram other = (Parallelogram) obj;
		if (mBase != other.mBase)
			return false;
		if (mHeight != other.mHeight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String output = "";
		String space = "";

		for (int row = 0; row < mHeight; row++) {
			for (int col = 0; col < mBase; col++) {
				output += "*";
			}
			output += "\n";
			space += " ";
			output += space;

		}
		output += "The area of this Parallelogram is " + calculateArea() + " square units.";

		return output;
	}

}
