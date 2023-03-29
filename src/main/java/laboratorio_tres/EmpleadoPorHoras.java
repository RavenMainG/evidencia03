package laboratorio_tres;

public class EmpleadoPorHoras extends Empleado{
  
  public double ventasBrutas;
  public double tarifaComision;

  public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento, double ventasBrutas, double tarifaComision) {
    super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
    if(ventasBrutas < 0.0) {
      throw new IllegalArgumentException("Las ventas brutas deben ser mayor a 0");
    }
    if(tarifaComision < 0.0) {
      throw new IllegalArgumentException("La tarifa de comision debe ser mayor a 0 y menor a 1");
    }
    this.ventasBrutas = ventasBrutas;
    this.tarifaComision = tarifaComision;
  }

  public double getVentasBrutas() {
    return ventasBrutas;
  }

  public void setVentasBrutas(double ventasBrutas) {
    if(ventasBrutas < 0.0) {
      throw new IllegalArgumentException("Las ventas brutas deben ser mayor a 0");
    }
    this.ventasBrutas = ventasBrutas;
  }

  public double getTarifaComision() {
    return tarifaComision;
  }

  public void setTarifaComision(double tarifaComision) {
    if(tarifaComision <= 0.0 || tarifaComision >= 1.0) {
      throw new IllegalArgumentException("La tarifa de comision debe ser mayor a 0 y menor a 1");
    }
    this.tarifaComision = tarifaComision;
  }

  public double obtenerMontoPago() {
    return getVentasBrutas() * getTarifaComision();
  }

  @Override
  public String toString() {
    return "EmpleadoPorHoras [tarifaComision=" + tarifaComision + ", ventasBrutas=" + ventasBrutas + "]";
  }
}
