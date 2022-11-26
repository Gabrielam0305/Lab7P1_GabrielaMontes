
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriela Montes
 */
public class Seleccion {
        public String nomgrupo;
    public String nomseleccion;
    public String nomdirector;
    public int jugador;
    public String mundial;
    public String posicion; 
    private int goles=0;
    
    public Seleccion(){
        
    }

    public Seleccion(String nomgrupo, String nomseleccion, String nomdirector, int jugador, String mundial, String posicion) {
        this.nomgrupo = nomgrupo;
        this.nomseleccion = nomseleccion;
        this.nomdirector = nomdirector;
        this.jugador = jugador;
        this.mundial = mundial;
        this.posicion = posicion;
    }
    
    public void mensaje (){
        System.out.println(this.nomseleccion+" pertenece al " +this.nomgrupo+ ".");
        System.out.println("Su director tecnico es "+this.nomdirector);
        System.out.println("Tiene " +this.jugador+" jugadores convocados.");
        System.out.println(this.mundial+" ha gandado un mundial.");
        System.out.println("Esta en la " +this.posicion+ " posicion del grupo.");
        System.out.println("-----Se ha creado exitosamente la seleccion de " +this.nomseleccion+"-----");
        System.out.println(" ");
    }
   
 //clase   

    public void setGoles(int goles) {
        goles=new Random().nextInt((5-0)+1)+0;
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }
    
}


