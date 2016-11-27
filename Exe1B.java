/* 
/**

* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( b) Ler uma temperatura em graus Celsius e exibi-la convertida em graus Fahrenheit. A fórmula de
conversão a ser utilizada é F = ( 9 * C + 160 ) / 5, em que a variável F representa a temperatura
em graus Fahrenheit e a variável C a temperatura em graus Celsius.)

*/

public class Exe1B
{
	static public void main(String[] args)
	{
		float tempCelsius = Float.parseFloat(args[0]);
		float tempFahrenheit = (9*tempCelsius + 160)/5;

		System.out.println("A temperatura " + tempCelsius + " Celsius convertida em Fahrenheit -> " + tempFahrenheit);
	}

}