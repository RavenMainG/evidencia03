package laboratorio_tres;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int mesPagoNomina = LocalDate.now().getMonthValue();
    System.out.println("Mes de pago de nómina: " + mesPagoNomina);
    
    
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan", "Perez", "123456789", new Fecha(01, 02, 2023), 1000);
    EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Pedro", "Gomez", "987654321", new Fecha(01, 02, 2023), 100, 10);
    EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Maria", "Gonzalez", "123456789", new Fecha(01, 02, 2023), 1000, 20);

    empleados.add(empleadoAsalariado);
    empleados.add(empleadoPorHoras);
    empleados.add(empleadoPorComision);

    
    for(Empleado empleado : empleados) {
      System.out.println(empleado);
      System.out.println("fecha de nacimiento: " + empleado.mesNacimiento());
      if(mesPagoNomina == empleado.mesNacimiento()) {
        System.out.println("El empleado cumple años este mes");
        System.out.println("Se le hará un bono de $100");
        // empleado.setSalarioSemanal(empleado.getSalarioSemanal() + 100);
        System.out.println("Monto a pagar: " + (empleado.obtenerMontoPago() + 100));
      
      }else {
        System.out.println("Monto a pagar: " + empleado.obtenerMontoPago());
      }
      System.out.println();
    }

  }
}
