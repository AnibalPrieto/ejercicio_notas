/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionotas;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjercicioNotas {
    static Scanner ent =new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introducir una nota: ");
        int nota = ent.nextInt();
        if (nota>=0 && nota<5){
            System.out.println("Suspenso");
        }else if (nota>=5 && nota<6){
            System.out.println("Aprobado");
        }else if (nota>=6 && nota<7){
            System.out.println("Bien");
        }else if (nota>=7 && nota<9){
            System.out.println("Notable");
        }else if (nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Escriba una nota entre 0 y 10");
        }
    
    }    
}
