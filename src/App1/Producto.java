package App1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Producto extends Comun {
    private int cantidad;
    private String creation;
    private String vencimiento;

    public Producto(int id, String name, String databaseUser, String databasePass, String databaseName, String databaseURL, int cantidad, String creation, String vencimiento) {
        super(id, name, databaseUser, databasePass, databaseName, databaseURL);
        this.cantidad = cantidad;
        this.creation = dateRadom_creation();
        this.vencimiento = dateRadom_caducation();
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCreation() {
        return creation;
    }

    public String getVencimiento() {
        return vencimiento;
    }
    public String dateRadom_creation(){
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(2)+2020, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
    }
    public String dateRadom_caducation(){
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(4)+2019, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
    }
}
