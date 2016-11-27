/*

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es):

* Data: 25/11/2016

* Repositório: (https://github.com/willianfriederich/exerciciosjava/tree/master)

* Descrição: (2E - Ler quatro valores interios e apresentar somente aqueles que forem divisíveis por 2 e 3)

*/

import java.util.Scanner;

public class Exe2E {
    public static void main(String[] args){
        
        int i, aux;
        int num[] = new int[4];

        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < 4; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        num[i] = input.nextInt(); 
        }
        
        System.out.println("Os numeros divisiveis por 2 e 3 são: ");
        
        for(i = 0; i < 4; i++){
        aux = num[i];
        if((aux % 2 == 0) && (aux % 3 == 0)){
            System.out.println(num[i]);
                    
        }    
      } 
    }
}