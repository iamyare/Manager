package App2;

import java.util.Objects;

public class Rule{
    private String name;
    private int posicionInicio;
    private int posicionFinal;
    private String description;


    public Rule(String name, int posicionInicio, int posicionFinal, String description) {
        this.name = name;
        this.posicionInicio = posicionInicio;
        this.posicionFinal = posicionFinal;
        this.description = description;
    }


    public int getPosicionInicio() {
        return posicionInicio;
    }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setTrama(StringManagement stringManagement) {
        this.description = stringManagement.getTrama();
    }

    public boolean equals(Rule r){
        if (r.getName().equals(this.name) || r.getDescription().equals(this.description) || excepcion(r)){
            return true;
        }else{
            return false;
        }
    }
    public boolean excepcion(Rule r){
        if((r.getPosicionFinal()<this.posicionInicio || r.getPosicionInicio()>this.posicionFinal)){
            return false;//No se encuentra en el intervalo
        }else{
            return true;//Se encuentra en el intervalo
        }
    }









}
