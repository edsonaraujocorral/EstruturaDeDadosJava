package Code;

/**
 * Esta classe define um ponto (x, y) nao alteravel no plano
 *
 * @author Edson
 */

public class XYPoint {
    //Variaveis de instancia
    private double x, y;

    /**
     * Constroi um ponto (x, y) em uma localizacao especifica
     *
     * @param xCoor A abscissa do ponto
     * @param yCoor A ordenada do ponto
     */
    public XYPoint(double xCoor, double yCoor) {
        this.x = xCoor;
        this.y = yCoor;
    }
    /**
     * Retorna o valor da abscissa
     * @return abscissa
     */
    public double getX() { return this.x; }

    /**
     * Retorna o valor da ordenada
     * @return ordenada
     */
    public double getY() { return this.y; }

}
