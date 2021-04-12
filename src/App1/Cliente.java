package App1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Cliente extends Comun{

    private String direction;
    private String dateOfBirth; //Tipo date, corregir

    public Cliente(int id, String name, String databaseUser, String databasePass, String databaseName, String databaseURL, String direction, String dateOfBirth) {
        super(id, name, databaseUser, databasePass, databaseName, databaseURL);
        this.direction = direction;
        this.dateOfBirth = dateRadom_birth();
    }

    public String getDirection() {
        return direction;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String dateRadom_birth(){
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(12)+1990, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
    }
}
