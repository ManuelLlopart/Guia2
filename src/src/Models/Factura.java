package Models;

import java.time.LocalDateTime;
import java.util.UUID;

//Por otro lado vamos a tener el objeto Factura que representa una venta
//        del local, cada Factura posee un identificador de las mismas
//características usadas en Cliente. A su vez cada factura posee un monto
//total, una fecha y el Cliente que generó la compra. Para la fecha de la
//venta se le va a asignar la fecha y hora al momento de creación del objeto
//Factura. El tipo Factura debe contar con un método que calcule el monto
//final luego de aplicarle el descuento que posee el cliente.
public class Factura {
    private String id;
    private double monto;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(double monto, Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.monto = monto;
        this.cliente = cliente;
        this.fecha = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public Factura setMonto(double monto) {
        this.monto = monto;
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Factura setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public double descuento(){
        this.monto -= monto*(cliente.getDesc()/100);
        return this.monto;
    }
}
