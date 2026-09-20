package classes;

import classes.interfaces.Descuento;

public abstract class Alimento implements Descuento {
    protected String codigo;
    protected double precioBase;

    public Alimento() {
    }

    public Alimento(String codigo, double precioBase) {
        this.codigo = codigo;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal(double precioBase){
        return precioBase - (precioBase * DESCUENTO);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\n" +
                "Precio base: " + precioBase;
    }
}
