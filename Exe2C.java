/* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 25/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( Exercicio 2C - Ler quatro valores reais referentes a quatro notas escolares de um aluno e apresentar uma
mensagem informando se o aluno foi aprovado ou reprovado. Para determinar a aprovação do
aluno considere a média escolar maior ou igual a 6. Apresentar junto com as mensagens o
valor da média do aluno.)

*/

import java.util.Scanner;

public class Exe2C {
    
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);
    
    float n1, n2, n3, n4; 
    float media;
    
    System.out.println("Digite a primeira nota: ");
    float N1 = input.nextFloat();
    System.out.println("Digite a segunda nota: ");
    float N2 = input.nextFloat();
    System.out.println("Digite a terceira nota: ");
    float N3 = input.nextFloat();
    System.out.println("Digite a quarta nota: ");
    float N4 = input.nextFloat();
    
    media = (N1+N2+N3+N4)/4;
    
    if(media>=60){
       System.out.println("Sua media foi de " + media + ". Portanto, voce esta aprovado!\n"); 
    }
    else if(media<60){
       System.out.println("Sua media foi de " + media + ". Infelizmente voce nao foi aprovado.\n");
    }
  }
}