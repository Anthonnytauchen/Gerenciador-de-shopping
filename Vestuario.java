package etapa4;
public class Vestuario extends Loja {
  private boolean produtosImportados;

  public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, boolean produtosImportados,int maxproduto) {
      super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
      this.produtosImportados = produtosImportados;
  }

  public boolean getProdutosImportados() {
      return produtosImportados;
  }

  public void setProdutosImportados(boolean produtosImportados) {
      this.produtosImportados = produtosImportados;
  }

  @Override
  public String toString() {
      return super.toString() + ", produtos importados=" + produtosImportados;
  }
}

