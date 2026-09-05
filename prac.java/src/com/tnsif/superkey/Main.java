package com.tnsif.superkey;

public class Main extends Superdemo{
	int number=200;
	Main(){
		super();//calls parent constructor
		System.out.println("Child Constructor");
	}
	void show() {
		System.out.println("Child Variable:"+number);
		System.out.println("Parent Variable;"+super.number);
		super.display();//calls parent method
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.show();
		

	}

}
