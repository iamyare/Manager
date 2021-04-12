package Application;

import App1.*;

import java.util.ArrayList;

public class App1 {
    // ArrayList de objetos en Comun. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<Comun> metodos = new ArrayList<Comun>();
    public static void main(String[] args) {




        Cliente c1 = new Cliente(124,"Yamir","iamyare","123","Product","http://gmail.com","Sabanagrande", "14/03/2001");
        Producto p1 = new Producto(1023,"Ketchup","iamyare","123","Product","http://gmail.com", 2,"12/20/20021","10/26/1021");
        Producto p2 = new Producto(1142,"Arroz","iamyare","123","Product","http://gmail.com", 2,"12/20/20021","10/26/1021");
        Producto p3 = new Producto(1633,"Pan","iamyare","123","Product","http://gmail.com", 2,"12/20/20021","10/26/1021");

        metodos.add(c1);
        metodos.add(p1);
        metodos.add(p2);
        metodos.add(p3);

        //Mostrando info
        System.out.println(+c1.getId()+" - "+c1.getName()+" user: "+c1.getDatabaseUser()+" date of birth: "+c1.getDateOfBirth());

        System.out.println("Nombre del producto: "+p1.getName());
        System.out.println("Creaccion: "+p1.getCreation());
        System.out.println("Vencimiento: "+p1.getVencimiento());



        //Crear
        System.out.println("Todos ejecutan el mismo método (Crear)");
        for (Comun metodos : metodos){
            System.out.println(metodos.getId()+" - "+metodos.getName());
            metodos.crear();
            System.out.println("");
        }
        //Obetener
        System.out.println("Todos ejecutan el mismo método (Obtener)");
        for (Comun metodos : metodos){
            System.out.println(metodos.getId()+" - "+metodos.getName());
            metodos.obtener();
            System.out.println("");
        }
        //Actualizar
        System.out.println("Todos ejecutan el mismo método (Actualizar)");
        for (Comun metodos : metodos){
            System.out.println(metodos.getId()+" - "+metodos.getName());
            metodos.actualizar();
            System.out.println("");
        }
        //Eliminar
        System.out.println("Todos ejecutan el mismo método (Eliminar)");
        for (Comun metodos : metodos){
            System.out.println(metodos.getId()+" - "+metodos.getName());
            metodos.eliminar();
            System.out.println("");
        }



    }
}
