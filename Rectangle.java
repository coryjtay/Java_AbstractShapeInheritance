package edu.orangecoastcollege.cs170.ctaylor82.ic28;

import java.awt.Color;

public class Rectangle extends Shape2D {

	private int mWidth;
	private int mHeight;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return mWidth * mHeight * 1.0;
	}

	public Rectangle(int width, int height, int x, int y, Color color) {
		mWidth = width;
		mHeight = height;
		mX = x;
		mY = y;
		mColor = color;
	}

	public int getWidth() {
		return mWidth;
	}

	public void setWidth(int width) {
		mWidth = width;
	}

	public int getHeight() {
		return mHeight;
	}

	public void setHeight(int height) {
		mHeight = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mHeight;
		result = prime * result + mWidth;
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
		Rectangle other = (Rectangle) obj;
		if (mHeight != other.mHeight)
			return false;
		if (mWidth != other.mWidth)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String output = "";
		// nested for loops to go through rows and cols
		for (int i = 0; i < mHeight; i++) {
			for (int j = 0; j < mWidth; j++) {
				output += "*";
			}
			output += "\n";
		}
		output += "The area of this rectangle is " + calculateArea() + " square units.";
		return output;
	}

}
