package Progression;

/**
 * Progressao Fibonacci
 *
 * @author edson
 */
public class FibonacciProgression extends Progression {
    /** valor anterior */
    protected long prev;

    /** Construtor default inicializa os dois primeiros valores como sendo 0 e 1*/
    public FibonacciProgression() {
        this(0, 1);
    }
    /**
     * Construtor parametrico fornece o primeiro e o segundo valores.
     *
     * @param value1 e o primeiro valor
     * @param value2 e o segundo valor
     */
    public FibonacciProgression(long value1, long value2) {
        first = value1;
        prev = value2 - value1;
    }
    /**
     * Avanca a progressao somando o valor anterior no valor atual
     *
     * @return proximo valor da progressao
     */
    protected long nextValue() {
        long temp = prev;
        prev = cur;
        cur += temp;
        return cur;
    }
}
