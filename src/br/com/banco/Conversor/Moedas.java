package br.com.banco.Conversor;

public class Moedas {
	private double moeda;
	
	public double RealPdolar(double a) {
		return a / 5;
	}
	public double dolarPReal(double a) {
		return a * 5;
	}
}
