package Progression;

/**
 * Progressao Geometria
 *
 * @author edson
 */
public class GeomProgression extends Progression{
    /** Base */
    protected long base;

    /**
     * Construtor default inicializa o valor base com 2;
     */
    public GeomProgression() {
        this(2);
    }
    /**
     * Construtor parametrico fornece o valor base
     *
     * @param base e o valor da progressao
     */
    public GeomProgression(long b) {
        base = b;
        first = 1;
        cur = first;
    }
    /**
     * Avanca a progressao multiplicando a base pelo valor corrente
     *
     * @return proximo valor da progressao
     */
    protected long nextValue() {
        cur *= base;
        return cur;
    }
}
