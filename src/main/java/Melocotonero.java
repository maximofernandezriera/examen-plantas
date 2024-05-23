public class Melocotonero extends Frutal{
    private String variedad;
    private String tienePlaga;
    public Melocotonero(String nombre, String colorHoja, String variedad){
        super(nombre, colorHoja);
        this.tipo = "Melocotonero";
        this.variedad = variedad;
        this.tienePlaga = "No";
    }

    @Override
    public String toString() {
        return "Melocotonero{" +
                "variedad='" + variedad + '\'' +
                ", tienePlaga='" + tienePlaga + '\'' +
                ", tieneFruto='" + tieneFruto + '\'' +
                ", colorHoja='" + colorHoja + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mesesEdad=" + mesesEdad +
                ", estado='" + estado + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void darFruto() {
        if(tieneFruto.equals("Si")){
            System.out.println(tipo + " ha dado fruto");
            tieneFruto = "No";
        }
    }


}