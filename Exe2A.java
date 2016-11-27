/* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( Exercicio 2A - Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior valor em
relação ao menor valor.)

*/

import java.util.Scanner;
        
public class Exe2A {
    public static void main(String[] args){
        int dif, num_1, num_2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        num_1 = input.nextInt();
        System.out.println("Informe o segundo numero: ");
        num_2 = input.nextInt();
        
        if (num_1 > num_2){
            System.out.println("A diferenca entre o numero " + num_1 + " e o " + num_2 + " e: " + (num_1 - num_2));
        }
        else if (num_1 < num_2){
             System.out.println("A diferenca entre o numero " + num_2 + " e o " + num_1 + " e: " + (num_2 - num_1));
                    }
        else{
            System.out.println("Nao ha diferenca, pois os numeros sao iguais.");
        }
    }
}