package com.veiculos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<Veiculo> veiculos = new ArrayList<>();
		
		// Adicionar carros (marca, modelo, ano, valor, portas)
		veiculos.add(new Carro("Renault", "Logan", 5, 30000, 4));
		veiculos.add(new Carro("Ford", "KA", 2, 22000, 4));
		veiculos.add(new Carro("Ford", "Ranger", 3, 80000, 4));		
		// Adicionar motos (marca, modelo, ano, valor, cilindrada
		veiculos.add(new Moto("Yamaha", "R15", 1, 25000, 155));
		veiculos.add(new Moto("BMW", "S1000RE", 7, 110000, 1000));
		veiculos.add(new Moto("Honda", "Hornet", 3, 30000, 600));
		
		// Loop for
		for(int i = 0; i < veiculos.size(); i++) {
			Veiculo atual = veiculos.get(i);
			System.out.println("Veiculo "+(i+1));
			System.out.println("Veiculo: "+atual.getTipo());
			System.out.println("Anos de uso: "+atual.getAno());
			System.out.println("Preço de compra: "+atual.getValor());
			System.out.println("Preço de revenda: "+atual.calcularRevenda());
			System.out.println();
		}
	}
}
