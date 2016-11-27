/*

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 25/11/2016

* Repositório: (https://github.com/willianfriederich/exerciciosjava/tree/master)

* Descrição: (2I - Ler um valor inteiro qualquer e apresentar mensagem informando se o valor é par ou ímpar.)

*/

import java.util.Scanner;

public class Exe2I
{
  static public void main(String[] args)
  {
    //inicializa o Scanner
    Scanner input = new Scanner(System.in);

    //declara as variaveis
    int num;

    //entrada de dados
    System.out.println("Digite um numero inteiro: ");
    num = input.nextInt();

    //logica do programa
    if(num % 2 != 0){
      System.out.print("O numero " + num + " e IMPAR!\n");
    }else{
      System.out.print("O numero " + num + " e PAR!\n");
    }
  }
}