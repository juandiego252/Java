package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto(); // Instanciar auto1
		Auto auto2 = new Auto(); // Instanciar auto2

		auto1.marca = "Chevrolet";
		auto1.anio = 2019;
		auto1.precio = 23.943;

		auto2.marca = "Toyota";
		auto2.anio = 2022;
		auto2.precio = 32.987;

		System.out.println("----------------");
		System.out.println("Marca del auto 1:" + " " + auto1.marca);
		System.out.println("Anio del auto 1:" + " " + auto1.anio);
		System.out.println("Precio del auto 1:" + " " + auto1.precio);

		System.out.println("----------------");
		System.out.println("Marca del auto 2:" + " " + auto2.marca);
		System.out.println("Anio del auto 2:" + " " + auto2.anio);
		System.out.println("Precio del auto 2:" + " " + auto2.precio);
		

	}

}
