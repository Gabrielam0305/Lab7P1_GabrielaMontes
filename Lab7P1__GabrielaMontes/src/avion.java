
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriela Montes
 */
public class avion {
        public String nombreavion;
        public String codigo;
        public int year;
        public int capmax;
        public int  weight;  
        public String aereolinea;
        private int estado=0;

    public avion(String nombreavion, String codigo, int year, int capmax, int weight, String aereolinea) {
        this.nombreavion = nombreavion;
        this.codigo = codigo;
        this.year = year;
        this.capmax = capmax;
        this.weight = weight;
        this.aereolinea = aereolinea;
    }

    
    
   public void estado(){
       
   }
   public void cambioestado(){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Desea cambiarle el estado a un avion [1. Si/2. No]: ");
       int op = entrada.nextInt();
       while (op!=2) {
            System.out.println("Estados disponibles:\n 1.Despegado \n 2. Aterrizado \n 3. Estacionado");
            estado=entrada.nextInt();
            if (estado==1){
            System.out.println(this.nombreavion+" ahora esta Despegando ");
            } else if (estado==2){
            System.out.println(this.nombreavion+" ahora esta Aterizando ");    
            } else if (estado==3){
             System.out.println(this.nombreavion+" ahora esta Estacionado ");   
            }else{
                System.out.println("ERROR, NO VALIDO");
            }
            //repeuesta usuario
       System.out.print("Desea cambiarle el estado a un avion [1. Si/2. No]: ");
       op = entrada.nextInt();
        }
   }
}
