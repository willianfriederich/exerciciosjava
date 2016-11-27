/*

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 25/11/2016

* Repositório: (https://github.com/willianfriederich/exerciciosjava/tree/master)

* Descrição: (2G - Ler um valor inteiro e verifique se o valor está entre 1 e 9 (inclusive). O programa deve indicar
com a mensagem (O valor está na faixa permitida) caso esteja dentro da faixa e indicar com a
mensagem (O valor está fora da faixa permitida) caso esteja fora da faixa.)

*/

import java.util.Scanner;

public class Exe2G
{
  static public void main(String[] args)
  {
    
    int num;
    //inicializa o Scanner
    Scanner input = new Scanner(System.in);

    //entrada de dados
    System.out.println("Digite um numero inteiro: ");
    num = input.nextInt();

    //executa a logica
    if((num >= 1) && (num <= 9)){
      System.out.println("O valor esta na faixa permitida");
    }
    else{
      System.out.println("O valor esta fora da faixa permitida");
    }
  }
}