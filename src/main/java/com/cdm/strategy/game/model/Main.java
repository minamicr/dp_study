package com.cdm.strategy.game.model;

import com.cdm.strategy.game.model.Model.Movimento.Correr;
import com.cdm.strategy.game.model.Model.Personagem;
import com.cdm.strategy.game.model.Model.Movimento.Pular;

public class Main {

  public static void main(String[] args) {
    Personagem personagem = new Personagem();
    Pular pular = new Pular();
    Correr correr = new Correr();

    System.out.println(personagem.mover(pular));
    System.out.println(personagem.mover(correr));
  }

}
