package entities;

import entities.enums.Color;

public class Triangle extends Shape{

	private Double base;
	private Double height;
	
	public Triangle() {
		super();
	}

	public Triangle(Color color, Double base, Double height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}

}
