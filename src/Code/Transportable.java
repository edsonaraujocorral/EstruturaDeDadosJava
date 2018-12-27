package Code;
/** Interface para objetos que podem ser transportados */
public interface Transportable {
    /** peso em gramas */
    public int weight();
    /** se o objeto e ou nao e perigoso */
    public boolean isHazardous();
}
