package com.cdm.strategy.imposto.model;

public class IOF implements Imposto{
  public double calcular(double valor) {
    return valor * 0.25;
  }
}
