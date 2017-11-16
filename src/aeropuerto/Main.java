package aeropuerto;

public class Main {
    public static void main(String[] args) throws Exception {
        InformacionTopografica a = new InformacionTopografica();
        System.out.println(a.getPosicionAeropuerto("Valencia").toString());
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });*/
    }
}
