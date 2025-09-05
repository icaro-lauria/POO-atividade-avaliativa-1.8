package com.veiculos;

public class Veiculo {
	
	protected String tipo;
	protected String marca, modelo;
	protected int ano; // Ano de uso
	protected double valorBase;
	
	public Veiculo(String marca, String modelo, int ano, double valorBase) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorBase = valorBase;
	}
	
	public double calcularRevenda() {
		return valorBase;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getValor() {
		return this.valorBase;
	}
	public void setValor(double valor) {
		this.valorBase = valor;
	}
}
