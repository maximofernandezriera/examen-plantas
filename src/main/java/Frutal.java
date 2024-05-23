public abstract class Frutal extends Planta{
    protected String tieneFruto;
    protected String colorHoja;
    public Frutal(String nombre, String colorHoja){
        super(nombre);
        this.tieneFruto = "No";
        this.colorHoja = colorHoja;
    }
    public void tenerFruto(){
        this.tieneFruto = "Si";
    }
    public abstract void darFruto();
}
