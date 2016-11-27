/*

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es):

* Data: 25/11/2016

* Repositório: (https://github.com/willianfriederich/exerciciosjava/tree/master)

* Descrição: (2F - Ler quatro valores inteiros e apresentar somente aqueles que forem divisíveis por 2 ou 3.)

*/

import java.util.Scanner;

public class Exe2F {
    public static void main(String[] args){
        
        int i, aux;
        int num[] = new int[4];

        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < 4; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        num[i] = input.nextInt(); 
        }
        
        for(i = 0; i < 4; i++){
        aux = num[i];
        
        if((aux % 2 == 0) && (aux % 3 == 0)){
            System.out.println("Numeros divisiveis por 2 e 3: " + num[i]);
        }
        else if((aux % 2) == 0){
            System.out.println("Numero divisivel por 2: " + num[i]);
          }
          else if((aux % 3) == 0){
            System.out.println("Numero divisivel por 3: " + num[i]);
            }                
        }    
    } 
}