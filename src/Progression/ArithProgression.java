package Progression;

/**
 * Progressao Aritmetica
 *
 * @author Edson
 */
public class ArithProgression extends Progression {
    /** Incremento */
    protected long inc;

    /** Construtor default inicializa com incrementos de 1. */
    public ArithProgression() {
        this(1);
    }
    /** Construtor parametrico fornece o incremento */
    public ArithProgression(long increment) {
        inc = increment;
    }
    /**
     * Avanca a progressao acrescentando o incremento ao valor atual..
     *
     * @return proximo valor da progressao
     */
    protected long nextValue() {
        cur += inc;
        return cur;
    }
}
