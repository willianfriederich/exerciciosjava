/* 
/**

* Unicesumar - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Willian Friederich

* Data: 19/11/2016

* Repositório: (coloque o link para o repositório no GitHub)

* Descrição: ( a) Calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel
que faz 12 km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem
e a velocidade média. Desta forma, será possível obter a distância percorrida com a fórmula
DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de
litros de combustível utilizada na viagem com a fórmula LITROS_USADOS = DISTANCIA / 12. O
programa deve apresentar os valores da velocidade média, tempo gasto, distância percorrida e
quantidade de litros utilizada na viagem)

*/

public class Exe1A
{
	static public void main(String[] args) 
	{
		float tempo = Float.parseFloat(args[0]); // recebe o tempo de viagem
		float mediaVelocidade = Float.parseFloat(args[1]); // recebe a velocidade média

		//executa os calculos necessários
		float distanciaPercorrida = (mediaVelocidade * tempo);
		float litroCombustivel = (distanciaPercorrida/12);

		System.out.println("A velocidade media foi = " + mediaVelocidade);
		System.out.println("O tempo gasto em horas foi = " + tempo);
		System.out.println("A distancia percorrida foi = " + distanciaPercorrida);
		System.out.println("A quantidade de litros de combustivel gasto no percurso foi = " + litroCombustivel);
	}
}