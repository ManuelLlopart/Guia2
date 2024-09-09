package Models;

public class EmpleadoPorHora extends Empleado{

    @Override
    public double calcularPago(int horas) {
        return this.getSalario()*horas;
    }
}
