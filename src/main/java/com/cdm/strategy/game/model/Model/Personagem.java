package com.cdm.strategy.game.model.Model;

import com.cdm.strategy.game.model.Model.Movimento.Movimento;

public class Personagem {
  public String mover(Movimento movimento){
    return movimento.executar();
  }

}
