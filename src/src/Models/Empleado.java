package Models;

public abstract class Empleado {
    private String name;
    private double salario;

    public Empleado() {
    }

    public Empleado(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calcularPago(){
        return this.getSalario();
    }

    public abstract double calcularPago(int horas);
}
