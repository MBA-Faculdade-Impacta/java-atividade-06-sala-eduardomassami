package br.com.impacta.models;

import java.util.ArrayList;

public class Produto {
  public int codigo;
  public String descricao;
  public double valor;

  public static Produto buscarProdutoPeloId(ArrayList<Produto> listaDeProdutos, int codProduto) {
    for (int i=0; i<listaDeProdutos.size(); i++) {
      if (codProduto == listaDeProdutos.get(i).codigo) {
        return listaDeProdutos.get(i);
      }
    }
    return null;
  }
}