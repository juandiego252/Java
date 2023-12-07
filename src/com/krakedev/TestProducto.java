package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto productoA;
		Producto productoB; 
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		productoA.nombre = "Clotrimazol";
		productoA.descripcion = "Medicamento antifungico";
		productoA.precio = 19.99;
		productoA.stockActual = 30;
		
		productoB.nombre = "Apirina";
		productoB.descripcion = "Medicamento antiinflamatorio";
		productoB.precio = 6.55;
		productoB.stockActual = 120;
		
		productoC.nombre = "Ibuprofeno";
		productoC.descripcion = "Medicamento antiinflamatorio";
		productoC.precio = 8.75;
		productoC.stockActual = 86;
		
		
		System.out.println("---------------");
		System.out.println("Nombre:" + productoA.nombre);
		System.out.println("Descripcion:" + productoA.descripcion);
		System.out.println("Precio $:" + productoA.precio);
		System.out.println("Stock Actual:" + productoA.stockActual);
		
		System.out.println("---------------");

		System.out.println("Nombre:" + productoB.nombre);
		System.out.println("Descripcion:" + productoB.descripcion);
		System.out.println("Precio $:" + productoB.precio);
		System.out.println("Stock Actual:" + productoB.stockActual);
		
		System.out.println("---------------");
		System.out.println("Nombre:" + productoC.nombre);
		System.out.println("Descripcion:" + productoC.descripcion);
		System.out.println("Precio $:" + productoC.precio);
		System.out.println("Stock Actual:" + productoC.stockActual);
		
		

	}

}
