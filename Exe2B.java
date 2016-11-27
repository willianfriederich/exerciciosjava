/* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( Exercicio 2B - Ler um valor inteiro qualquer positivo ou negativo e apresentar o número lido como um valor
positivo)

*/

import java.util.Scanner;

public class Exe2B{
    public static void main(String[] args) {
        
        double num, result; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        num = input.nextDouble();
        
        result = Math.abs(num);
        
        System.out.print("O valor absoluto do numero digitado e: " + result + "\n");
    }
}