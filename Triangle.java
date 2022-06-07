package edu.orangecoastcollege.cs170.ctaylor82.ic28;

import java.awt.Color;

public class Triangle extends Shape2D {

	private int mHeight;
	private int mBase;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * mBase * mHeight;
	}

	public Triangle(int height, int base, int x, int y, Color color) {
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

	public void setWidth(int base) {
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
		Triangle other = (Triangle) obj;
		if (mBase != other.mBase)
			return false;
		if (mHeight != other.mHeight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String output = "";

		for (int i = 0; i < mHeight; i++) {
			for (int j = 0; j < i; j++) {
				output += "*";
			}
			output += "\n";
		}
		output += "The area of this triangle is " + calculateArea() + " square units.";
		return output;
	}

}
