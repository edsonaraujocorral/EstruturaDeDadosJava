package Code;
/*
   O uso de heranca multipla de interfaces e uma aproximacao da tecnica
   de heranca multiplas conhecida como mixtura...
 */
public interface InsurableItem extends Transportable, Sellable {
    /** Retorna o valor segurado em centavos */
    public int insuredValue();
}
