/*

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 25/11/2016

* Repositório: (https://github.com/willianfriederich/exerciciosjava/tree/master)

* Descrição: (2H - Ler cinco valores inteiros e apresentar o maior e o menor valores informados)

*/

import java.util.Arrays;
import java.util.Scanner;

public class Exe2H
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner input = new Scanner(System.in);

    //inicializa as variaveis
    int num[] = new int[5];
    int maior, menor;

    //entrada de dados
    for(int i = 0; i < 5; i++){
      System.out.print("Digite o " +(i+1)+ " numero: \n");
      num[i] = input.nextInt();
    }

    //logica do programa
    Arrays.sort(num);
    menor = num[0];
    maior = num[4];
    System.out.print("O menor numero digitado foi: " + menor + "\n");
    System.out.print("O maior numero digitado foi: " + maior + "\n");
  }
}