package com.cdm.strategy.imposto;

import com.cdm.strategy.imposto.service.Calculadora;
import com.cdm.strategy.imposto.model.ICMS;
import com.cdm.strategy.imposto.model.IOF;

public class Main {

  public static void main(String[] args) {
    double valor = 100.0;

    Calculadora calculadora = new Calculadora();

    ICMS icms = new ICMS();
    IOF iof = new IOF();

    System.out.println("ICMS " + calculadora.calcularImposto(icms, valor));
    System.out.println("IOF " + calculadora.calcularImposto(iof, valor));

  }

}
