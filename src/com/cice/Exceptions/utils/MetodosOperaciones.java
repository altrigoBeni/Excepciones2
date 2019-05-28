package com.cice.Exceptions.utils;

import com.cice.Exceptions.util.exceptions.NumeroCeroException;
import com.cice.Exceptions.util.exceptions.NumeroNegativoException;

public class MetodosOperaciones {
	
	public Double division(Double dividendo, Double divisor) throws NumeroCeroException {		
		if(divisor == 0.0) throw new NumeroCeroException("El divisor no puede ser un " + divisor);
		return dividendo/divisor;
	}

	public Double multilpicar(Double multi1, Double multi2) throws NumeroCeroException{
		if(multi1 == 0.0 || multi2 == 0.0) throw new NumeroCeroException("El multiplicador no puede ser 0");
		return multi1 * multi2;
	}
	
	public Double sumar(Double sumando, Double sumador) throws NumeroNegativoException{
		if(sumando <0 || sumador < 0) throw new NumeroNegativoException("El sumando o el sumador no puede ser 0");
		return sumando + sumador;
	}
	
	public Double restar(Double restando, Double restador) throws NumeroNegativoException{
		if(restando <0 || restador < 0) throw new NumeroNegativoException("El restando o el restador no puede ser 0");
		return restando - restador;
	}
	
	
}
