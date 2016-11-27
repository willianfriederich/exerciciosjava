/* 
/**

* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: (Ler uma temperatura em graus Fahrenheit e apresenta-la convertida em graus Celsius. A
fórmula de conversão a ser utilizada é C = (( F – 32 ) * 5) / 9, em que a variável F representa a
temperatura em graus Fahrenheit e a variável C a temperatura em graus Celsius.)

*/

public class Exe1C
{
	static public void main(String[] args)
	{
		float tempFahrenheit = Float.parseFloat(args[0]);
		float tempCelsius = (( tempFahrenheit - 32 ) * 5)/9;

		System.out.println("A temperatura " + tempFahrenheit + " Fahrenheit convertida em Celsius -> " + tempCelsius);
	}
}