package com.jb.ws.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jb.ws.calculadora.ICalculadora")
public class CalculadoraImpl implements ICalculadora {

	public double operacion(int opcion, double valor1, double valor2) {
		double resultado = 0;
		
		switch (opcion) {
		case 1:
			resultado = valor1 + valor2;
			break;
		case 2:
			resultado = valor1 - valor2;
			break;
		case 3:
			resultado = valor1 * valor2;
			break;
		case 4:
			resultado = valor1 / valor2;
			break;
		default:
			System.out.println("Opcion Invalida");
			resultado = -999999999.9;
			break;
		}
		
		return resultado;
	}	

}
