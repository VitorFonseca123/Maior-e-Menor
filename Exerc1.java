/*
1.	Dado um conjunto de valores inteiros e positivos, apresente o maior e o 
menor valor do conjunto. O final do conjunto de valores fornecidos pelo usuário é conhecido 
através do valor -5, que não deve ser considerado.
 */
package exerc1;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Exerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int n = 0 ; 
       int maior = 0;
       int menor = 0;
       int inutil =0;
       while(n!=-5){
           n=a.nextInt();
           if(n>0 && inutil == 0){
               maior = n;
               menor = n;
               inutil++;
               
           }else if(n > maior && n>0){
               maior = n;
               
           }else if(n<menor && n>0){
               menor = n;
           }
                                                                              
               
           }
             System.out.println("O número maior é:"+maior +" O numero menor é:"+menor);      
           }
       }
    