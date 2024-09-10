package Models;

import java.time.LocalDateTime;

public class Estudiante extends Persona {
    private LocalDateTime anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(LocalDateTime anioIngreso, double cuotaMensual, String carrera) {
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String carrera, double cuotaMensual) {
        super(nombre);
        this.carrera = carrera;
        this.cuotaMensual = cuotaMensual;
    }

    public Estudiante(String nombre, String apellido, String carrera) {
        super(nombre, apellido);
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

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

    @Override
    public String toString() {
        return "Estudiante{" +
                "anioIngreso=" + anioIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
