package com.cdm.strategy.imposto.service;

import com.cdm.strategy.imposto.model.Imposto;

public class Calculadora {
  public double calcularImposto(Imposto imposto, double valor){
    return imposto.calcular(valor);
  }

}
