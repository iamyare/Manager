package App3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tarjeta {
    private String name;
    private String tarjeta;
    private String caducidad;
    private short tar = 1;

    public Tarjeta(String name, String tarjeta, String caducidad) {
        this.name = name;
        this.setTarjeta(tarjeta);
        this.caducidad = setCaducidad();
    }

    public void setTarjeta(String tarjeta) {
        int limit = 16; //Limite de la tarjeta
        if (tarjeta.length() == limit){
            this.tarjeta = tarjeta;
        }else{
            tarjeta = "Desconocida";
            tar = 0;
            System.out.println("WARNING "+this.name+" Esta tarjeta no es soportada");
        }


    }

    public String setCaducidad(){
        Calendar unaFecha;
        int numero = 0;
        Random aleatorio;
        aleatorio = new Random();
        unaFecha = Calendar.getInstance();
        unaFecha.set (aleatorio.nextInt(4)+2021, aleatorio.nextInt(12)+1, aleatorio.nextInt(30)+1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy");
        return sdf.format(unaFecha.getTime());
    }
    public void PrintDatos(){
        if(tar == 1){
            System.out.println("------------------------");
            System.out.println("Name:\t\t"+this.name);
            System.out.println("Tarjeta:\t"+this.tarjeta);
            comprobar();
            System.out.println("Valida hasta:\t"+this.caducidad);
        }


    }
    public void comprobar(){
        tarjeta = this.tarjeta;

        Pattern pat = Pattern.compile("\\d{6}\\*{6}\\d{4}");
        Matcher mat = pat.matcher(tarjeta);
        if (mat.matches()) {
            System.out.println("La tarjeta esta enmascarada.");
        } else {
            System.out.println("La tarjeta no esta enmascarada.");
        }
    }
}
