package Models;
//Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
//ende se convierte en subclase de Círculo. El Cilindro a diferencia del
//Círculo posee un atributo altura, que también se inicializa en 1.0 cuando no
//le pasamos un valor a su constructor. Y un método para calcular el
//volumen
public class Cilindro extends Circulo{
    private double altura=1.0;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro() {
    }

    public double getAltura() {
        return altura;
    }

    public Cilindro setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public double volumen(){
        return super.area()*this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
//    Sobreescribir el método calcular area declarado en Círculo, para
//    que nos permita calcular el área del cilindro.
    @Override
    public double area() {

        return 2*Math.PI*this.getRadio()*this.altura+2*super.area();
    }
}
