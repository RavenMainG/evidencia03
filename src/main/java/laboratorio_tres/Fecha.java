package laboratorio_tres;

public class Fecha {
  
  private int dia;
  private int mes;
  private int anio;

  private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  public Fecha(int dia, int mes, int anio) {
    if(mes <= 0 || mes > 12) {
      throw new IllegalArgumentException("Mes fuera de rango");
    }
    if(dia <= 0 || dia > diasPorMes[mes] || (mes == 2 && dia == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))) {
      throw new IllegalArgumentException("Dia fuera de rango");
    }
    if(mes == 2 && dia == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
      throw new IllegalArgumentException("Anio fuera de rango");
    }
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
  }
  
  public int getDia() {
    return dia;
  }
  
  public void setDia(int dia) {
    if(dia < 1 || dia > 31) {
      throw new IllegalArgumentException("El dia debe ser mayor a 0 y menor a 31");
    }
    this.dia = dia;
  }
  
  public int getMes() {
    return mes;
  }
  
  public void setMes(int mes) {
    if(mes < 1 || mes > 12) {
      throw new IllegalArgumentException("El mes debe ser mayor a 0 y menor a 12");
    }
    this.mes = mes;
  }
  
  public int getAnio() {
    return anio;
  }
  
  public void setAnio(int anio) {
    if(anio < 1) {
      throw new IllegalArgumentException("El anio debe ser mayor a 0");
    }
    this.anio = anio;
  }
  
  @Override
  public String toString() {
    return "Fecha [anio=" + anio + ", dia=" + dia + ", mes=" + mes + "]";
  }

}
