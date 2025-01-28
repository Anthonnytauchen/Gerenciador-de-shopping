package etapa4;

import java.time.LocalDate;

public class Produto {
  private String nome;
  private int preco;
  private Data dataValidade;

    

  public Produto(String nome, double preco2, Data dataValidade) {
    this.nome = nome;
    this.preco = (int) preco2;
    this.dataValidade = dataValidade;
  }
  
    public Produto(String nomeProduto, LocalDate dataValidade,Data dataAtual) {
      this.nome = nomeProduto;
      this.preco = 0;
  
    }
      public Data getDataValidade() {
      return dataValidade;
        }
      
    public void setDataValidade(Data dataValidade){
       this.dataValidade=dataValidade;
      }  
  
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public int getPreco() {
      return preco;
    }
    public void setPreco(int preco) {
      this.preco = preco;
    }
    @Override
    public String toString() {
      return "nome do produto=" + nome + ", preço do produto =" + preco + "Data de validade do produto:"+dataValidade;
    }
    public boolean estaVencido(Data d1){
      if((d1.getAno() <= this.getDataValidade().getAno()) && (d1.getMes() <= this.getDataValidade().getMes()) && (d1.getDia() <= this.getDataValidade().getDia())){
          return false;
      }
      return true;
  }

}