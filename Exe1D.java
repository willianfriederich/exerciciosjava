/* 
/**

* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( d) Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Kelvin. A fórmula
para conversão é K = C + 273.15, onde K é a temperatura em Kelvin e C é a temperatura em
graus Celsius)

*/

public class Exe1D
{
	public static void main(String[] args) {
		float celsius = Float.parseFloat(args[0]);
		double kelvin = (celsius + 273.15);

		System.out.println(celsius + " graus Celsius convertido para Kelvin -> " + kelvin);
	}
}


