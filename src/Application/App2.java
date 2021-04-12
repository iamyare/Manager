package Application;
import App2.*;
public class App2 {
    public static void main(String[] args) {


        Rule r1 = new Rule("ClienteNombre", 0,5,"Nombre cliente");
        Rule r2 = new Rule("Identidad", 6,7,"Identidad");
        Rule r3 = new Rule("ClienteNombre3", 6,10,"Nombre cliente");//Esta regla no se agregara porque esta en medio de otra
        Rule r4 = new Rule("ClienteNombre3", 11,15,"Identidad");//Esta regla no se agregara porque el name es igual que r3


        StringManagement StringManagement = new StringManagement("ASISTENTE");
        StringManagement SM1 = new StringManagement("Yamir Rodas");
        StringManagement SM2 = new StringManagement("0801199901234");
        StringManagement SM3 = new StringManagement("Ana Ruiz");
        StringManagement SM4 = new StringManagement("Juan Pablo Rodas");
        //Agregando Trama a cada Dato
        r1.setTrama(SM1);r2.setTrama(SM2);r3.setTrama(SM3);r4.setTrama(SM4);

        StringManagement.add(r1);    StringManagement.add(r2);    StringManagement.add(r3);   StringManagement.add(r4);

        //Busqueda por parametro de rule
        System.out.println("\nB U S Q U E D A\n");
        StringManagement.get_parte("ClienteNombre");StringManagement.get_parte("Identidad");
        StringManagement.get_parte("ClienteNombre3");StringManagement.get_parte("ClienteNombre4");//Este no encontrara coincidencias


        if(r1.equals(r2)){
            StringManagement.remove(r2);
            System.out.println("WARNING: "+r2.getName()+" Esta regla no es permitida ya que hay una parecida a esta.\n"); }
        if(r2.equals(r3)){
            StringManagement.remove(r3);
            System.out.println("WARNING: "+r3.getName()+" Esta regla no es permitida ya que hay una parecida a esta.\n"); }
        if(r3.equals(r4)){
            StringManagement.remove(r4);
            System.out.println("WARNING: "+r3.getName()+" Esta regla no es permitida ya que hay una parecida a esta.\n"); }


        StringManagement.PrintRules();





    }
}
