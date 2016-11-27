/*

* Unicesumar ? Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es):

* Data: 25/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: (2D - Ler três valores inteiros e apresenta-los em ordem crescente)

*/
import java.util.Scanner;

public class Exe2D {
    public static void main(String[] args){
        
        int aux, j, i;
        int[] num = new int[3];
        
        Scanner input = new Scanner(System.in);
        
        for(i = 0; i < num.length; i++){
        System.out.println("Digite o " + (i+1) + "º numero: ");
        num[i] = input.nextInt(); 
        }
        for(i = 0; i < num.length; i++){
            for(j = 0; j < (num.length -1); j++){
                if(num[j] > num[j+1]){
                 aux = num[j];
                 num[j] = num[j+1];
                 num[j+1] = aux;
                }
            }
        }
        //mostrar ordenação crescente
        System.out.println("Numeros de ordem crescente: ");
        for(i = 0; i < num.length; i++){
         
            System.out.println(num[i]);
        }
    }
}   