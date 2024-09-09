package Models;

public abstract class EmpleadoTiempoComp extends Empleado{
        @Override
        public double calcularPago(){
            return super.getSalario()*208;
        }
}
