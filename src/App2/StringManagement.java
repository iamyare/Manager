package App2;


import java.util.*;


public class StringManagement {
    private String trama;
    private int limit = 15; //Limite de caracteres
   // private Set<Rule> rules = new HashSet<Rule>();
    private List<Rule> rules;

    public StringManagement(String trama) {
        this.setTrama(trama);
        this.rules = new ArrayList<Rule>();

    }

    public void setTrama(String trama) {
        if (trama.length() > limit) {
            System.out.println("WARNING LA TRAMA *"+trama+
                    "*\nHa sobre pasado el limite de " + this.limit + " caractes por " + (trama.length() - limit) + " caracteres.");
            this.trama = "";
        }else{
            this.trama = trama;
        }

    }

    public void PrintRules() {
        System.out.println("R U L E S\n");
        for (Rule r : rules) {
            System.out.println(r.getName()+" - "+r.getDescription());
        }


    }

    public void add(Rule R) {
        this.rules.add(R);
    }
    public void remove(Rule R){this.rules.remove(R);}




    public void get_parte(String busqueda) {
        short j=0;
        System.out.println("Datos compatible con:\t'"+busqueda+"'");
        for (Rule r: this.rules){
            if (r.getName().compareToIgnoreCase(busqueda)==0){
                System.out.println("\t\t\t\t\t\t"+r.getDescription());
                System.out.println("");
                j=1;
            }
        }
        if (j==0){
            System.out.println("No se encontraron coincidencias\n");
        }

    }

    public String getTrama() {
        return trama;
    }

    }
