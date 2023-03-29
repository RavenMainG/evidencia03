package laboratorio_tres;

public class Factura implements PorPagar{
  private final String numeroPieza;
  private final String descripcionPieza;
  private int cantidad;
  private double precioPorArticulo;

  // Constructor de la clase
  public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
    
    if (cantidad < 0) {
      throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
    }
    if (precioPorArticulo < 0.0) {
      throw new IllegalArgumentException("El precio por articulo debe ser mayor a 0");
    }

    this.numeroPieza = numeroPieza;
    this.descripcionPieza = descripcionPieza;
    this.cantidad = cantidad;
    this.precioPorArticulo = precioPorArticulo;
  }

  public String getNumeroPieza() {
    return numeroPieza;
  }

  public String getDescripcionPieza() {
    return descripcionPieza;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    if (cantidad < 0) {
      throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
    }
    this.cantidad = cantidad;
  }

  public double getPrecioPorArticulo() {
    return precioPorArticulo;
  }

  public void setPrecioPorArticulo(double precioPorArticulo) {
    this.precioPorArticulo = precioPorArticulo;
  }



  @Override
  public String toString() {
    return "Factura [cantidad=" + cantidad + ", descripcionPieza=" + descripcionPieza + ", numeroPieza=" + numeroPieza
        + ", precioPorArticulo=" + precioPorArticulo + "]";
  }

  public double obtenerMontoPago() {
    return cantidad * precioPorArticulo;
  }

  



}
