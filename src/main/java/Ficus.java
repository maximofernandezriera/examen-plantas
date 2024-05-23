public class Ficus extends Planta {
    private String origen;
    private String tamaño;
    public Ficus(String nombre, String origen, String tamaño){
        super(nombre);
        this.tipo = "Ficus";
        this.origen = origen;
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Ficus{" +
                "origen='" + origen + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mesesEdad=" + mesesEdad +
                ", estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
