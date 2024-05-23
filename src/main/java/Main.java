public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Planta p1 = new Melocotonero("Melocoton melocotonus", "Verde", "Mallorquina");
        Planta p2 = new Albaricoquero("Albaricoque salvaje", "Marron", "Marron");
        Planta p3 = new Ficus("Ficus Ibericus", "Mallorca", "Grande");
        Planta p4 = new Laurel("Laurel Ibicus", "Marron");

        inventario.insertarPlanta(p1);
        inventario.insertarPlanta(p2);
        inventario.insertarPlanta(p3);
        inventario.insertarPlanta(p4);

        inventario.eliminarPlanta(p2);
        inventario.mostrarDatosPlanta(p3);
        inventario.mostrarlistaPlantas();
        inventario.mostrarTodosDatosPlantas();
        inventario.vaciarInventario();
        inventario.mostrarTodosDatosPlantas();
    }
}