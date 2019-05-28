package com.cice.Exceptions.controller;

import com.cice.Exceptions.util.exceptions.MatExceptions;
import com.cice.Exceptions.utils.MetodosOperaciones;

public class Controlador {
	
	private MetodosOperaciones operaciones = new MetodosOperaciones();
	public static final String DIVISION = "division";
	public static final String MULTIPLICACION = "multiplicacion";
	public static final String SUMAR = "suma";
	public static final String RESTAR = "restar";
	
	
	
	public void operaciones(String tipoDeoperacion,Double operadno1, Double operando2) throws MatExceptions{
		
		Double resultado = null;
		
		switch (tipoDeoperacion) {
		case DIVISION:			
			resultado = operaciones.division(operadno1, operando2);			
			break;
		case  MULTIPLICACION:
			resultado = operaciones.multilpicar(operadno1, operando2);			
			break;
		case SUMAR:
			resultado = operaciones.sumar(operadno1, operando2);
		break;
		case RESTAR:
			resultado = operaciones.restar(operadno1, operando2);
			break;
		default:
			throw new MatExceptions("Tipo de operacion no permitida");
		}
		
		System.out.println("El resultado de la " + tipoDeoperacion + " es: " + resultado);
		
	}
	
}
