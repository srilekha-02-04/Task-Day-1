package com.tnsif.hybridinh;

public class OnlineShoppingSystem {
	class Product{
		String ProductName;
		double price;
		void displayProductDetails() {
			System.out.println("ProductName:"+ProductName);
			
		}
			
		}
	public class Electronics extends Product{
		String brand;
		void displayElectronicsDetails() {
			System.out.println("Brand:"+brand);
		}
	}
	public class Clothing extends Product {
		String size;
		void displayClothingDetails() {
			System.out.println("Size: " + size);
		}
	}
	public class Laptop extends Electronics {
		int ram;
		void displayLaptopDetails() {
			System.out.println("RAM: " + ram);
		}
	}


	}
	


