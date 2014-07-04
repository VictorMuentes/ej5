/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej5;

import java.util.Scanner;


/**
 *
 * @author V1C70R MU3N735
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int dimension=entrada.nextInt();
        int[] array=new int[dimension];
        int c=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el valor número "+(i+1)+" del vector");
            int valor=entrada.nextInt();

            array[i]=valor;
        }
         int i, j, vectorAux;
         for(i=0;i<array.length-1;i++)
              for(j=0;j<array.length-i-1;j++)
                   if(array[j+1]<array[j]){
                      vectorAux=array[j+1];
                      array[j+1]=array[j];
                      array[j]=vectorAux;
                   } 
         System.out.println("Vector con numeros ingresados \n");
         for ( i = 0; i < array.length; i++) {
            System.out.print( array[i]) ; 
        }
         System.out.println(" \n El vector sin numeros repetidos \n" );
         int a1;
         for ( i = 0; i < array.length; i++) {
             if (i==0) {
             System.out.print(array[i]);
             }
             else
             {
                 a1=i-1;
                 vectorAux=array[i];
             if (vectorAux==array[a1]) {
                 
             }else{
                 System.out.print(array[i]);
             }
             }
             
              
            
        }
    }
    }
    

