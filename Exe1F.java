/* 
/**

* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 20/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( f) Calcular e apresentar o valor do volume de um galão, utilizando a fórmula (V = π.r2.a). Tanto o raio quanto a área são dados
de entrada do programa.)

*/

import java.util.Scanner;

public class Exe1F{
    
    public static void main(String[] args){
        
        float raio, area;
        double volume;
        Scanner input = new Scanner(System.in);  
                
        System.out.println("Informe o raio: ");
        raio = input.nextFloat();
        System.out.println("Informe a area: ");
        area = input.nextFloat();
        
        volume = 3.1415*(raio*raio)*area;
        
        System.out.println("O volume do galão é " + volume);
    } 
}