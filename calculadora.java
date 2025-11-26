/**
 * <p><strong>Projeto: Calculadora Simples</strong></p>
 *
 * <p>Esta classe foi desenvolvida com o propósito de demonstrar o uso de
 * métodos puros em Java, aplicando boas práticas de programação,
 * refatoração e documentação com Javadoc.</p>
 *
 * <p>A Calculadora oferece operações matemáticas básicas e um método principal
 * capaz de interpretar um operador e executar a operação correspondente.</p>
 *
 * <p>O código é objetivo, claro e ideal para fins educacionais e testes
 * unitários.</p>
 *
 * @author Gustavo Zamboni  
 * @version 1.0
 */

    public class calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return a diferença entre {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o produto de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * <p>Se o divisor for zero, uma exceção será lançada.</p>
     *
     * @param a dividendo
     * @param b divisor
     * @return o quociente da divisão de {@code a} por {@code b}
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática com base no operador informado.</p>
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>+ : Soma</li>
     *     <li>- : Subtração</li>
     *     <li>* : Multiplicação</li>
     *     <li>/ : Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resulta em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo que indica a operação desejada
     * @return o resultado da operação executada
     * 
     * @throws IllegalArgumentException se o operador informado for inválido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
