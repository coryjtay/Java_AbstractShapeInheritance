package edu.orangecoastcollege.cs170.ctaylor82.ic28;

import java.awt.Color;

public abstract class Shape2D {

	protected int mX;
	protected int mY;
	protected Color mColor;

	public int getX() {
		return mX;
	}

	public void setX(int x) {
		mX = x;
	}

	public int getY() {
		return mY;
	}

	public void setY(int y) {
		mY = y;
	}

	public Color getColor() {
		return mColor;
	}

	public void setColor(Color color) {
		mColor = color;
	}

	public abstract double calculateArea();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mColor == null) ? 0 : mColor.hashCode());
		result = prime * result + mX;
		result = prime * result + mY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape2D other = (Shape2D) obj;
		if (mColor == null) {
			if (other.mColor != null)
				return false;
		} else if (!mColor.equals(other.mColor))
			return false;
		if (mX != other.mX)
			return false;
		if (mY != other.mY)
			return false;
		return true;
	}

}
