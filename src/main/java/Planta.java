public abstract class Planta {
    protected String nombre;
    protected int mesesEdad;
    protected String estado;
    protected String tipo;
    protected static int contador;
    public Planta(String nombre){
        this.nombre = nombre;
        this.mesesEdad = 0;
        this.estado = "Viva";
        aumentarContador();
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void morir(){
        this.estado = "Muerta";
    }
    private static void aumentarContador(){
        contador++;
    }
    public void cumpleaños(){
        mesesEdad++;
    }

    public abstract String toString();
}