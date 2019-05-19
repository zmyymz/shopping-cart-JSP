package entity;

import sun.nio.cs.ext.DoubleByteEncoder;

public class Product {
	private int id;
	private String name;
	private double price;
	private String desc;
	private String img;
	private int num;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

}

