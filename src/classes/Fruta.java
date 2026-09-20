package classes;

public class Fruta extends Alimento{
    private String paisDeOrigen;
    private String temporadaDeCultivo;


    public Fruta() {
    }

    public Fruta(String codigo, double precioBase, String paisDeOrigen, String temporadaDeCultivo) {
        super(codigo, precioBase);
        this.paisDeOrigen = paisDeOrigen;
        this.temporadaDeCultivo = temporadaDeCultivo;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getTemporadaDeCultivo() {
        return temporadaDeCultivo;
    }

    public void setTemporadaDeCultivo(String temporadaDeCultivo) {
        this.temporadaDeCultivo = temporadaDeCultivo;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "País de origen: " + paisDeOrigen + "\n" +
                "Temporada de cultivo: " + temporadaDeCultivo;
    }
}
