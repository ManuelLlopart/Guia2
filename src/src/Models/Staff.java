package Models;

public class Staff extends Persona{
    private String turno;
    private double salario;

    public Staff(String nombre, String apellido, String turno, double salario) {
        super(nombre, apellido);
        this.turno = turno;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "turno='" + turno + '\'' +
                ", salario=" + salario +
                '}';
    }
}
