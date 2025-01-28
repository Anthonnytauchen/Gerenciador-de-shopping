package etapa4;

public class Data {
  protected int dia;
  protected int mes;
  protected int ano;
  
  public Data(int dia, int mes, int ano) {
    if (verificaDataValida(dia, mes, ano)) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    } else {
        System.out.println("Data inválida. Definindo data padrão: 1/1/2000");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
    }
  }   
  public int verificaDiasDoMes(int mes, int ano){
    int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (mes == 2 && verificaAnoBissexto())
        return 29;
    return diasPorMes[mes - 1];
  }
  
    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && ano % 100 != 0) {
            return true; 
        } else if (ano % 400 == 0) {
            return true; 
        } else {
            return false; 
        }
    }
  public boolean verificaDataValida(int dia, int mes, int ano) {
    if (mes < 1 || mes > 12 || dia < 1 || dia > verificaDiasDoMes(mes, ano)) {
      return false;
    }
    return true;
  }
  public int getDia() {
    return dia;
  }
  public void setDia(int dia) {
    this.dia = dia;
  }
  public int getMes() {
    return mes;
  }
  public void setMes(int mes) {
    this.mes = mes;
  }
  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  @Override
  public String toString() {
    return "Dia: " + dia + ", Mês: " + mes + ", Ano: " + ano;
  }
}


