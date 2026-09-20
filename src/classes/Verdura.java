package classes;

public class Verdura extends Alimento {
    private Boolean sonOrganicas;
    private String contenidoNutricional;


    public Verdura() {
    }

    public Verdura(String codigo, double precioBase, Boolean sonOrganicas, String contenidoNutricional) {
        super(codigo, precioBase);
        this.sonOrganicas = sonOrganicas;
        this.contenidoNutricional = contenidoNutricional;
    }

    public Boolean getSonOrganicas() {
        return sonOrganicas;
    }

    public void setSonOrganicas(Boolean sonOrganicas) {
        this.sonOrganicas = sonOrganicas;
    }

    public String getContenidoNutricional() {
        return contenidoNutricional;
    }

    public void setContenidoNutricional(String contenidoNutricional) {
        this.contenidoNutricional = contenidoNutricional;
    }

    @Override
    public String toString() {
        String textoOrganica = sonOrganicas ? "Sí" : "No";
        return super.toString() + "\n" +
                "¿Es orgánica?: " + textoOrganica + "\n" +
                "Contenido nutricional: " + contenidoNutricional;
    }
}
