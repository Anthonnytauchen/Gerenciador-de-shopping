package etapa4;

public class Endereco {
  private String nomeDaRua;
  private String cidade;
  private String estado;
  private String pais; 
  private String cep;  
  private String numero; 
  private String Complemento;

  public Endereco(String nomeDaRua, String cidade, String estado, String pais,String  cep, String  numero, String complemento) {
    this.nomeDaRua = nomeDaRua;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
    this.cep = cep;
    this.numero = numero;
    this.Complemento = complemento;
  }

  public String getNomeDaRua() {
    return nomeDaRua;
  }

  public void setNomeDaRua(String nomeDaRua) {
    this.nomeDaRua = nomeDaRua;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String  getCep() {
    return cep;
  }

  public void setCep(String  cep) {
    this.cep = cep;
  }

  public String  getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return Complemento;
  }

  public void setComplemento(String complemento) {
    Complemento = complemento;
  }

  @Override
  public String toString() {
    return "Endereço [nomeDaRua=" + nomeDaRua + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais
        + ", cep=" + cep + ", numero=" + numero + ", Complemento=" + Complemento + "]";
  }

}
