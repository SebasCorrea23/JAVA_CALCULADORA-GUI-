public class Main {
    public static void main(String[] args) {
        Metodos miVentana = new Metodos();
        Visual operaciones = new Visual();
        miVentana.asignarOperaciones(operaciones);
        miVentana.setVisible(true);
    }
}
