
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriela Montes
 */
public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
         System.out.println("---Menu---");
        System.out.println("Opcion 1: El calamar Pablo ");
        System.out.println("Opcion 2: Torre de control");
        System.out.println("Opcion 3: Salida");
        System.out.println(" ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
         do{
               switch (op){
             case 1:
        entrada = new Scanner(System.in);
         System.out.println("Ha entrado a El calamar Pablo ");
        String seleccion = "";
        Seleccion Alemania= new Seleccion();
        Seleccion CostaRica= new Seleccion();
        Seleccion Espana= new Seleccion();
        Seleccion Japon= new Seleccion();
        Seleccion Belgica= new Seleccion();
        Seleccion Croacia= new Seleccion();
        Seleccion Canada= new Seleccion();
        Seleccion Marruecos= new Seleccion();
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el nombre de la seleccion: ");
            seleccion = entrada.nextLine();

            if (seleccion.equals("Alemania")) {
                Alemania = new Seleccion("Grupo E", "Alemania", "Hansi Flick", 26, "Si", "Tercero");
                Alemania.setGoles(0);
                Alemania.getGoles();
                Alemania.mensaje();

            } else if (seleccion.equals("Costa Rica")) {
                CostaRica = new Seleccion("Grupo E", "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto");
                CostaRica.mensaje();
                CostaRica.setGoles(0);
                CostaRica.getGoles();


            } else if (seleccion.equals("España")) {
                Espana = new Seleccion("Grupo E", "Espana", "Luis Enrique", 26, "Si", "Primero");
                Espana.setGoles(0);
                Espana.getGoles();
                Espana.mensaje();

            } else if (seleccion.equals("Japon")) {
                Japon = new Seleccion("Grupo E", "Japon", "Hajime Moriyasu", 26, "No", "Segundo");
                Japon.mensaje();
                Japon.setGoles(0);
                Japon.getGoles();
                

            } else if (seleccion.equals("Belgica")) {
                Belgica = new Seleccion("Grupo F", "Belgica", "Roberto Martinez", 26, "No", "Primero");
                Belgica.mensaje();
                Belgica.setGoles(0);
                Belgica.getGoles();
               

            } else if (seleccion.equals("Croacia")) {
                Croacia = new Seleccion("Grupo F", "Croacia", "Zlatko Dalic", 26, "No", "Segundo");
                Croacia.mensaje();
                Croacia.setGoles(0);
                Croacia.getGoles();
               

            } else if (seleccion.equals("Canada")) {
                Canada = new Seleccion("Grupo F", "Canada", "John Herdman", 26, "No", "Cuarto");
                Canada.mensaje();
                Canada.setGoles(0);
                Canada.getGoles();
               

            } else if (seleccion.equals("Marruecos")) {
                Marruecos = new Seleccion("Grupo E", "Marruecos", "Walid Regragui", 26, "No", "Tercero");
                Marruecos.mensaje();
                Marruecos.setGoles(0);
                Marruecos.getGoles();
                

            } else {
                System.out.println("ERROR, intenete escribir sin tildes y con la primera en mayuscula");
            }
            //Seleccion Grupo= new Seleccion(grupo, seleccion,director, jugador, mundial, posicion ); 
            //Grupo.mensaje();
        }

        System.out.println("Juego 1 ");
        System.out.println("Juega  Japon contra Costa Rica");
        System.out.println("Japon " + Japon.getGoles() + " Costa Rica " + CostaRica.getGoles());

        if (Japon.getGoles() > CostaRica.getGoles()) {
            System.out.println("Ha ganado Japon");
        } else {
            System.out.println("Ha ganado Costa Rica");
        }
        System.out.println("");
        System.out.println("Juego 2 ");
        System.out.println("Juega  Croacia contra Canada");
        System.out.println("Croacia " + Croacia.getGoles() + " Canada " + Canada.getGoles());

        if (Croacia.getGoles() > Canada.getGoles()) {
            System.out.println("Ha ganado Croacia");
        } else {
            System.out.println("Ha ganado Canada");
        }
         System.out.println("");
            System.out.println("Juego 3 ");
            System.out.println("Juega  Belgica contra Marruecos");
            System.out.println("Belgica " + Belgica.getGoles() + " Marruecos " + Marruecos.getGoles());
        

            if (Belgica.getGoles() > Marruecos.getGoles()) {
                System.out.println("Ha ganado Belgica");
            } else {
                System.out.println("Ha ganado Marruecos");
            }
             System.out.println("");
                System.out.println("Juego 4 ");
                System.out.println("Juega  Espana contra Alemania");
                System.out.println("Espana " + Espana.getGoles() + " Alemania " + Alemania.getGoles());

                if (Espana.getGoles() > Alemania.getGoles()) {
                    System.out.println("Ha ganado Espana");
                } else {
                    System.out.println("Ha ganado Alemania");
                }
                 break;
             case 2:
                 entrada = new Scanner(System.in);
                 System.out.println("Ha a la Torre de Torre de control  ");
                 System.out.println("--Bienvenido al nuevo sistema de torre de control--");
            System.out.println("Ingrese el modelo del avion: ");
            String nombre=entrada.nextLine();
            System.out.println("Ingrese el codigo: ");
            String cod=entrada.nextLine();
            System.out.println("Ingrese el anio de fabricacion: ");
             int anio=entrada.nextInt();
            System.out.println("Ingrese la capacidad maxima de pasajeros: ");
            int cap=entrada.nextInt();
            System.out.println("Ingrese el peso del avion: ");
            int peso=entrada.nextInt();
            System.out.println("Ingrese el nombre de la aereolinea");
            entrada = new Scanner(System.in);
            String nomae=entrada.nextLine();
            avion av1=new avion (nombre, cod, anio, cap, peso, nomae);
            System.out.print("--Se ha agreagdo el avion exitosamente--");
            System.out.println("");
            //segundo avion
            System.out.println("--Bienvenido al nuevo sistema de torre de control--");
            System.out.println("Ingrese el modelo del avion: ");
            String nombre2=entrada.nextLine();
            System.out.println("Ingrese el codigo: ");
            String cod2=entrada.nextLine();
            System.out.println("Ingrese el anio de fabricacion: ");
             int anio2=entrada.nextInt();
            System.out.println("Ingrese la capacidad maxima de pasajeros: ");
            int cap2=entrada.nextInt();
            System.out.println("Ingrese el peso del avion: ");
            int peso2=entrada.nextInt();
            System.out.println("Ingrese el nombre de la aereolinea");
            entrada = new Scanner(System.in);
            String nomae2=entrada.nextLine();
            avion av2=new avion (nombre2, cod2, anio2, cap2, peso2, nomae2);
            System.out.print("--Se ha agreagdo el avion exitosamente--");
            System.out.println("");
        System.out.println("--Bienvenido al nuevo sistema de torre de control--");
            System.out.println("Ingrese el modelo del avion: ");
            String nombre3=entrada.nextLine();
            System.out.println("Ingrese el codigo: ");
            String cod3=entrada.nextLine();
            System.out.println("Ingrese el anio de fabricacion: ");
             int anio3=entrada.nextInt();
            System.out.println("Ingrese la capacidad maxima de pasajeros: ");
            int cap3=entrada.nextInt();
            System.out.println("Ingrese el peso del avion: ");
            int peso3=entrada.nextInt();
            System.out.println("Ingrese el nombre de la aereolinea");
            entrada = new Scanner(System.in);
            String nomae3=entrada.nextLine();
            avion av3=new avion (nombre3, cod3,anio3, cap3, peso3, nomae3);
            System.out.print("--Se ha agreagdo el avion exitosamente--");
            System.out.println("");
            
         System.out.print("Desea cambiarle el estado a un avion [1. Si/2. No]: ");
       int op1 = entrada.nextInt();
        while (op1!=2){
            System.out.println("Aviones disponibles:\n 1. " +nombre+ " \n2.¨" +nombre2+ " \n 3. " +nombre3);
            int opavion=entrada.nextInt();
            if (opavion==1){
                System.out.println("---"+nombre+" ha sido elegido");
           av1.cambioestado();
            } else if (opavion==2){
                System.out.println("---"+nombre2+" ha sido elegido");
            av2.cambioestado();    
            } else if (opavion==3){
                System.out.println("---"+nombre3+" ha sido elegido");
             av3.cambioestado();  
            }else{
                System.out.println("ERROR, NO VALIDO");
            }
            //repeuesta usuario
       System.out.print("Desea cambiarle el estado a un nuevo avion [1. Si/2. No]: ");
       op1 = entrada.nextInt();
        }
        System.out.println("Salida");
        System.out.println("");
                 break;
                         }
        System.out.println("---Menu---");
        System.out.println("Opcion 1: El calamar Pablo ");
        System.out.println("Opcion 2: Torre de control");
        System.out.println("Opcion 3: Salida");
        System.out.println(" ");
        System.out.println("Ingrese su respuesta: ");
        op = entrada.nextInt();   
         }while(op!=3);
            
    }
}
