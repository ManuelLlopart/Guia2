package Models;

import java.util.UUID;

public class Cliente {
//    Para esto es necesario modelar la clase Cliente, que posee un
//    atributo id como identificador del cliente, el mismo debe ser un valor
//    compuesto por letras y números aleatorios que se generan
//    automáticamente al crear un Cliente. El Cliente también posee un nombre,
//    un email y un porcentaje de descuento.
    private String id;
    private String name;
    private String email;
    private double desc;

    public Cliente(String name, String email, double desc) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public Cliente setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cliente setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cliente setEmail(String email) {
        this.email = email;
        return this;
    }

    public double getDesc() {
        return desc;
    }

    public Cliente setDesc(double desc) {
        this.desc = desc;
        return this;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", desc=" + desc +
                '}';
    }
}
