package Models;

import java.time.LocalDateTime;

public class Estudiante {
    private LocalDateTime anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public LocalDateTime getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(LocalDateTime anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
