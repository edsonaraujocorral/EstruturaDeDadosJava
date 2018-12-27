package Code;

/** Interfaces para objetos que podem ser vendidos */
public interface Sellable {
    /** descricao do objeto */
    public String description();
    /** lista de precos em centavos */
    public int listPrice();
    /** precos mais baixo em centavos que se pode aceitar*/
    public int lowestPrice();
}
