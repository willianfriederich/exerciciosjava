/* 
/**

* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( e) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em Kelvin. Para
conversão deve-se primeiro converter em graus Celsius conforme exercício anterior, e depois
converter em Kelvin.)

*/

public class Exe1E
{
	public static void main(String[] args) {
		float fahrenheit = Float.parseFloat(args[0]);
		float celsius = ((fahrenheit - 32 ) * 5)/9;
		double kelvin = (celsius + 273.15);

		System.out.println(fahrenheit + " graus fahrenheit convertido para Kelvin = " + kelvin);

	}
}