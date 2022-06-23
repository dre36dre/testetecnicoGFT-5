package Questao4;

import java.util.Scanner;

public class Carro {
	
	Scanner entrada=new Scanner(System.in);
	private String  marca;
	private String modelo;
	
	public Carro() {
		super();
	}

	public Carro(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	void tipoCombustivel() {
		System.out.println("Qual a marca do carro?");
		marca=entrada.next();
		System.out.println("Qual a modelo do carro?");
		modelo=entrada.next();
	}
	
	
}
