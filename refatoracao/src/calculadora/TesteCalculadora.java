package calculadora;

/**
 * <p><strong>Teste Calculadora</strong></p>
 * 
 * <p>Esta classe fornece os testes realizados de acordo com a classe {@link Calculadora} 
 * Ou seja, a operação matemática entre dois números inteiros: soma, subtração, multiplicação e divisão, 
 * respectivamente. Além da tentativa da divisão de um número inteiro diferente de 0, por 0, e a tentativa 
 * de uma operação com o símbolo "x", o qual essa alternativa não se encontra na classe "Calculadora".
 * Sendo assim, é inserido em cada invocação do método "calcular()" os dois números inteiros 
 * e o símbolo matemático refente à necessidade. Além do retorno ser inserido no console.</p>
 * 
 * <p>Esse projeto é utilizado para demonstrar as seguintes operações entre dois números inteiros:</p>
 * 
 * <ul>
 * 		<li>Soma</li>
 * 		<li>Subtração</li>
 * 		<li>Multiplicação</li>
 * 		<li>Divisão, com o segundo número inteiro sendo diferente de 0</li>
 * 		<li>Divisão, com o segundo número inteiro sendo igual a 0</li>
 * 		<li>Tentativa de uma operação matemática com o símbolo "x"</li>
 * </ul>
 * 
 * @author Ana Araujo - 236943
 * @version 1.0
 */

public class TesteCalculadora {
	
	/**
	 * Método principal com os blocos de código para realizar as operações matemáticas
	 * @param args argumentos da linha de comando
	 */
	public static void main(String[] args) {
		
		/**
		 * Criação de uma nova Calculadora, com base na classe Calculadora, com o nome calc
		 */
		Calculadora calc = new Calculadora();
		
		/**
		 * Invocação do método "calcular()", com o uso da Calculadora, de nome "calc". 
		 * Inserção dos dois números inteiros e a operação matemática escolhida
		 */
		System.out.println(calc.calcular(2, 3, "+"));
		System.out.println(calc.calcular(10, 4, "-"));
		System.out.println(calc.calcular(3, 5, "*"));
		System.out.println(calc.calcular(8, 2, "/"));
		
		
		/**
		 * Invocação do método "calcular()", com a tentativa de inserir o
		 * primeiro número inteiro sendo diferente de 0, e o segundo número inteiro sendo
		 * igual a 0. E na operação matemática selecionada ser "/", que seria divisão
		 */
		try {
			System.out.println(calc.calcular(8, 0, "/")); // exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		/**
		 * Invocação do método "calcular()", com a tentativa de inserir como símbolo matemático
		 * escolhido "x".
		 */
		try {
			System.out.println(calc.calcular(5, 5, "x")); // exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
