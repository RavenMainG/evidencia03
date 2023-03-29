package laboratorio_tres;

public class EmpleadoPorPieza extends Empleado{
  
  private double tarifaPieza;
  private int piezasFabricadas;
  
  public EmpleadoPorPieza(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento, double tarifaPieza, int piezasFabricadas) {
    super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
    if(tarifaPieza < 0.0) {
      throw new IllegalArgumentException("La tarifa por pieza debe ser mayor a 0");
    }
    if(piezasFabricadas < 0) {
      throw new IllegalArgumentException("Las piezas fabricadas deben ser mayor a 0");
    }
    this.tarifaPieza = tarifaPieza;
    this.piezasFabricadas = piezasFabricadas;
  }
  
  public double getTarifaPieza() {
    return tarifaPieza;
  }
  
  public void setTarifaPieza(double tarifaPieza) {
    if(tarifaPieza < 0.0) {
      throw new IllegalArgumentException("La tarifa por pieza debe ser mayor a 0");
    }
    this.tarifaPieza = tarifaPieza;
  }
  
  public int getPiezasFabricadas() {
    return piezasFabricadas;
  }
  
  public void setPiezasFabricadas(int piezasFabricadas) {
    if(piezasFabricadas < 0) {
      throw new IllegalArgumentException("Las piezas fabricadas deben ser mayor a 0");
    }
    this.piezasFabricadas = piezasFabricadas;
  }
  
  public double obtenerMontoPago() {
    return getTarifaPieza() * getPiezasFabricadas();
  }
  
  @Override
  public String toString() {
    return "EmpleadoPorHoras [piezasFabricadas=" + piezasFabricadas + ", tarifaPieza=" + tarifaPieza + "]";
  }
}
