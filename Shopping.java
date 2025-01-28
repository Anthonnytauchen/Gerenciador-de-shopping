package etapa4;

import javax.naming.spi.DirStateFactory.Result;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }
    

public String getNome() {
    return nome;
  }


  public void setNome(String nome) {
    this.nome = nome;
  }


  public Endereco getEndereco() {
    return endereco;
  }


  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }


  public Loja[] getLojas() {
    return lojas;
  }
  @Override
  public String toString() {
        String resultado = "Shopping: " + nome + "\n";
        resultado += "Endereço: " + endereco + "\n";
        resultado += "Lojas: " + "\n";
        for (Loja loja : lojas) {
            if (loja != null) {
                resultado += loja + "\n";
            }
        }
    return resultado;
    }
    public boolean insereLoja(Loja loja) {
    for (int i = 0; i < lojas.length; i++) {
        if (lojas[i] == null) {
            lojas[i] = loja;
            return true;
        }
    }
    return false;
}
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }


    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;
    
               for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] instanceof Alimentacao && 
            tipoLoja.equalsIgnoreCase("Alimentação")) {
                quantidade++;
            } else if (lojas[i] instanceof Bijuteria && 
            tipoLoja.equalsIgnoreCase("Bijuteria")) {
                quantidade++;
            } else if (lojas[i] instanceof Vestuario && 
            tipoLoja.equalsIgnoreCase("Vestuário")) {
                quantidade++;
            } else if (lojas[i] instanceof Informatica && 
            tipoLoja.equalsIgnoreCase("Informática")) {
                quantidade++;
            } else if (lojas[i] instanceof Cosmetico && 
            tipoLoja.equalsIgnoreCase("Cosmético")) {
                quantidade++;
            }
             }
    
        if (quantidade == 0) {
            return -1;
        }
    
        return quantidade;
    }
    

    //seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        double maiorSeguro = 0;
        Informatica lojaSeguroMaisCaro = null;
        
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                double seguroEletronicos = informatica.getSeguroEletronicos();
                
                if (seguroEletronicos > maiorSeguro) {
                    maiorSeguro = seguroEletronicos;
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }
        
        return lojaSeguroMaisCaro;
    }

}
