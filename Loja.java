package etapa4;

public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  private Produto[] EstoqueProduto;
public int length;
  

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.salarioBaseFuncionario = -1;
      this.endereco = endereco;
      this.dataFundacao = dataFundacao;
  }

  public Loja(String nome, int quantidadeFuncionarios,double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.salarioBaseFuncionario = salarioBaseFuncionario;
      this.endereco = endereco;
      this.dataFundacao = dataFundacao;
  }

  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos) {
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.salarioBaseFuncionario = salarioBaseFuncionario;
      this.endereco = endereco;
      this.dataFundacao = dataFundacao;
      EstoqueProduto = new Produto[quantidadeProdutos];

  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,int quantidadeProdutos) {
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.salarioBaseFuncionario = -1;
      this.endereco = endereco;
      this.dataFundacao = dataFundacao;
      EstoqueProduto = new Produto[quantidadeProdutos];

  }

  public String getNome() {
      return this.nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public int getQuantidadeFuncionarios() {
      return this.quantidadeFuncionarios;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
      this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public double getSalarioBaseFuncionario() {
      return this.salarioBaseFuncionario;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
      this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Endereco getEndereco() {
      return endereco;
  }

  public void setEndereco(Endereco endereco) {
      this.endereco = endereco;
  }

  public Data getDataFundacao() {
      return dataFundacao;
  }

  public void setDataFundacao(Data dataFundacao) {
      this.dataFundacao = dataFundacao;
  }

  public double gastosComSalario() {
      if (salarioBaseFuncionario < 0) {
          return -1;
      }
      return salarioBaseFuncionario * quantidadeFuncionarios;
  }

  public Produto[] getEstoqueProdutos(){
      return EstoqueProduto;
  }

  public char tamanhoDaLoja() {
      if (quantidadeFuncionarios < 10) {
          return 'P';
      } else if (quantidadeFuncionarios >=10 && quantidadeFuncionarios <= 30) {
          return 'M';
      } else {
          return 'G';
      }
  }

  public void imprimeProdutos(){
      for(int i = 0; i < EstoqueProduto.length; i ++){
          if (EstoqueProduto[i]!= null){
              System.out.println(EstoqueProduto[i]);
          };
      }
  }

  public boolean insereProduto(Produto produto){
      for(int i = 0; i < EstoqueProduto.length; i ++){
          if (EstoqueProduto[i] == null){
              EstoqueProduto[i] = produto;
              return true;
              
          }
      }
      return false;
  }

  public boolean removeProduto(String nome){
      for(int i = 0; i < EstoqueProduto.length; i ++){
          if (EstoqueProduto[i]!= null){
              if (EstoqueProduto[i].getNome().equalsIgnoreCase(nome)){
                  EstoqueProduto[i] = null;
                  return true;
              };
          };
      } 
      return false;
  }
  @Override
  public String toString() {
      String mensagem = "Nome: " + this.nome + " Quantidade de Funcionarios: " + this.quantidadeFuncionarios + " Salario Base do Funcionario: "
      + this.salarioBaseFuncionario;
      return mensagem;
  }
  public Produto[] getEstoqueProduto() {
      return EstoqueProduto;
  }
  public void setEstoqueProduto(Produto[] estoqueProduto) {
      EstoqueProduto = estoqueProduto;
  }

}
