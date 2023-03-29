package laboratorio_tres;

public class EmpleadoAsalariado extends Empleado{
  
  private double salarioSemanal;
  
  public EmpleadoAsalariado(String primerApellido, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento, double salarioSemanal) {
    super(primerApellido, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
    if(salarioSemanal < 0.0) {
      throw new IllegalArgumentException("El salario semanal debe ser mayor a 0");
    }
    this.salarioSemanal = salarioSemanal; 
  }

  public double getSalarioSemanal() {
    return salarioSemanal;
  }

  public void setSalarioSemanal(double salarioSemanal) {
    if(salarioSemanal < 0.0) {
      throw new IllegalArgumentException("El salario semanal debe ser mayor a 0");
    }
    this.salarioSemanal = salarioSemanal;
  }

  
  public double obtenerMontoPago() {
    return getSalarioSemanal();
  }

  

  @Override
  public String toString() {
    return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + "]";
  }



}
