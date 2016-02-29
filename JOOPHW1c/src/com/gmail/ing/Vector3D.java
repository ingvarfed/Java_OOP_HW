package com.gmail.ing;

public class Vector3D {
	private double x;
	private double y;
	private double z;

	public Vector3D(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public Vector3D add(Vector3D vector) {
		return new Vector3D(this.x + vector.x, this.y + vector.y, this.z + vector.z);
	}

	public double mulScalar(Vector3D vector) {
		return this.x * vector.x + this.y * vector.y + this.z * vector.z;
	}

	public Vector3D mulVector(Vector3D vector) {
		double newX = this.y * vector.z - this.z * vector.y;
		double newY = this.z * vector.x - this.x * vector.z;
		double newZ = this.x * vector.y - this.y * vector.x;
		return new Vector3D(newX, newY, newZ);
	}
}
