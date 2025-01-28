package etapa4;
public class Informatica extends Loja {
  private double seguroEletronicos;

  public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double seguroEletronicos, int maxProduto) {
      super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
      this.seguroEletronicos = seguroEletronicos;
  }

  public double getSeguroEletronicos() {
      return seguroEletronicos;
  }

  public void setSeguroEletronicos(double seguroEletronicos) {
      this.seguroEletronicos = seguroEletronicos;
  }

  @Override
  public String toString() {
      return super.toString() + ", seguro eletrônicos=" + seguroEletronicos;
  }
}
