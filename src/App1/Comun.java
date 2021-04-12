package App1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Comun {
    protected int id;
    protected String name;
    protected String databaseUser;
    protected String databasePass;
    protected String databaseName;
    protected String databaseURL;

    public Comun(int id, String name, String databaseUser, String databasePass, String databaseName, String databaseURL) {
        this.id = id;
        this.name = name;
        this.databaseUser = databaseUser;
        this.databasePass = databasePass;
        this.databaseName = databaseName;
        this.databaseURL = databaseURL;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public String getDatabasePass() {
        return databasePass;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public void crear(){
        System.out.println("Crear");

    }
    public void obtener(){
        System.out.println("Obtener");
    }
    public void actualizar(){
        System.out.println("Actualizar");
    }
    public void eliminar(){
        System.out.println("Eliminar");
    }
    public String dateRadom(){
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(10)+2014, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
    }
}
