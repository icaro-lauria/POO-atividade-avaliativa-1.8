package com.veiculos;

public class Moto extends Veiculo{

	int cilindrada;
	
	public Moto(String marca, String modelo, int ano, double valorBase, int cilindrada) {
		super(marca, modelo, ano, valorBase);
		this.cilindrada = cilindrada;
		this.tipo = "Moto";
	}
	
	public double calcularRevenda() {
		return this.valorBase - ano*0.05*valorBase;
	}
	
	public int getCilindrada() {
		return this.cilindrada;
	}
}
