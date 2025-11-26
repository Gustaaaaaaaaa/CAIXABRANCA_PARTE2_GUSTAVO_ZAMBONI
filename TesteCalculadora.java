/**
 * <p><strong>Classe de Teste da Calculadora</strong></p>
 *
 * <p>Esta classe é responsável por executar testes manuais dos métodos da
 * classe {@code Calculadora}, verificando o funcionamento das operações
 * matemáticas e o tratamento de exceções durante a execução.</p>
 *
 * <p>Os testes incluem:</p>
 * <ul>
 *     <li>Operações válidas (soma, subtração, multiplicação e divisão)</li>
 *     <li>Teste de divisão por zero</li>
 *     <li>Teste de operador inválido</li>
 * </ul>
 *
 * <p>As saídas são exibidas diretamente no console, permitindo observar o
 * comportamento da aplicação durante sua execução.</p>
 *
 * @author Gustavo Zamboni
 * @version 1.0
 */

public class TesteCalculadora {

   /**
    * Método principal responsável por executar os testes da classe Calculadora.
    *
    * @param args argumentos da linha de comando (não utilizados)
    */
   public static void main(String[] args) {

       // Instância da classe Calculadora, onde os métodos serão testados
       calculadora calc = new calculadora();

       // Testes sem exceção

       // Teste de soma
       System.out.println(calc.calcular(2, 3, "+"));   // esperado: 5

       // Teste de subtração
       System.out.println(calc.calcular(10, 4, "-"));  // esperado: 6

       // Teste de multiplicação
       System.out.println(calc.calcular(3, 5, "*"));   // esperado: 15

       // Teste de divisão válida
       System.out.println(calc.calcular(8, 2, "/"));   // esperado: 4

       // Teste com exceção: divisão por zero

       try {
           System.out.println(calc.calcular(8, 0, "/"));  // deve lançar exceção
       } catch (IllegalArgumentException e) {
           // Exibe a mensagem da exceção no console
           System.out.println(e.getMessage());
       }

       // Teste com exceção: operador inválido
       try {
           System.out.println(calc.calcular(5, 5, "x"));  // deve lançar exceção
       } catch (IllegalArgumentException e) {
           // Exibe a mensagem da exceção no console
           System.out.println(e.getMessage());
       }
   }
}
