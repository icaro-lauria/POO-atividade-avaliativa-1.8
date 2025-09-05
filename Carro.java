package com.veiculos;

public class Carro extends Veiculo{

	private int qtdPortas;
	
	public Carro(String marca, String modelo, int ano, double valorBase, int qtdPortas) {
		super(marca, modelo, ano, valorBase);
		this.qtdPortas = qtdPortas;
		this.tipo = "Carro";
	}
	
	public double calcularRevenda() {
		return this.valorBase - ano*0.1*valorBase;
	}

	public int getQtdPortas() {
		return this.qtdPortas;
	}
}
