package Questao4;

import java.util.Scanner;

public class Carro {
	
	Scanner entrada=new Scanner(System.in);
	private String  marca;
	private String modelo;
	private String combustivel;
	private String gasolina;
	private String diesel;
	
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
	
	
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	

	public String getGasolina() {
		return gasolina;
	}

	public String getDiesel() {
		return diesel;
	}

	public void setGasolina(String gasolina) {
		this.gasolina = gasolina;
	}

	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}

	void tipoCombustivel() {
		System.out.println("Qual a marca do carro?");
		marca=entrada.next();
		System.out.println("Qual a modelo do carro?");
		modelo=entrada.next();
		System.out.println("Qual o combustível?");
		combustivel=entrada.next();
		if(combustivel=="gasolina") {
		this.gasolina+=1;
		} else {
			this.diesel+=1;
		})
	}

	
	
}
