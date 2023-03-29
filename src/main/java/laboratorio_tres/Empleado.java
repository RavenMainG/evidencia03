package laboratorio_tres;

public abstract class Empleado implements PorPagar{
  private String primerNombre;
  private String apellidoPaterno;
  private String numeroSeguroSocial;
  private Fecha fechaNacimiento;

  public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento) {
    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial;
    this.fechaNacimiento = fechaNacimiento;
  }

  public int mesNacimiento() {
    
    return fechaNacimiento.getMes();
  }

  public String getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getNumeroSeguroSocial() {
    return numeroSeguroSocial;
  }

  public void setNumeroSeguroSocial(String numeroSeguroSocial) {
    this.numeroSeguroSocial = numeroSeguroSocial;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento.toString();
  }

  public void setFechaNacimiento(Fecha fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  
  @Override
  public String toString() {
    return "Empleado [apellidoPaterno=" + apellidoPaterno + ", numeroSeguroSocial=" + numeroSeguroSocial
        + ", primerNombre=" + primerNombre + "]";
  }

}
