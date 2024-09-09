package Models;

//Definir la clase Círculo, que posee como atributo un radio cuyo valor por
//defecto al ser inicializado sin valores es 1.0. Además el tipo Círculo posee
//un atributo color, por defecto rojo, un método para calcular el área y otro
//para imprimir sus características.
public class Circulo {
    private double radio=1.0;
    private String color="Rojo";

    public double getRadio() {
        return radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo setRadio(double radio) {
        this.radio = radio;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Circulo() {
    }

    public Circulo setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public double area(){
        return Math.PI*(this.radio*this.radio);
    }
}
