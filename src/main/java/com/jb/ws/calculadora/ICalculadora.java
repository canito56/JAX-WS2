package com.jb.ws.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalculadora {
	
	@WebMethod
	public double operacion(int opcion, double valor1, double valor2);
	
}
