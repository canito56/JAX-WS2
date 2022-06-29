package com.jb.ws.calculadora;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/Calculadora", new CalculadoraImpl());
	}

}
