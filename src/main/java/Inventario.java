import java.util.ArrayList;

public class Inventario {
    private ArrayList<Planta> plantas;
    public Inventario(){
        plantas = new ArrayList<>();
    }

    public void mostrarlistaPlantas(){
        for(Planta p : plantas){
            System.out.println("Nombre: " + p.getNombre() + " Tipo: " + p.getTipo());
        }
    }
    public void mostrarDatosPlanta(Planta p){
        //System.out.println(p.toString());
        System.out.println((p));
    }
    public void mostrarTodosDatosPlantas(){
        for(Planta p : plantas){
            mostrarDatosPlanta(p);
        }
    }
    public void insertarPlanta(Planta p){
        plantas.add(p);
    }
    public void eliminarPlanta(Planta p){
        plantas.remove(p);
    }
    public void vaciarInventario(){
        plantas.clear();
    }
}