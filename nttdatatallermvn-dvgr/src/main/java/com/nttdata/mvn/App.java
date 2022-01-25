package com.nttdata.mvn;

/**
 * Una clase para representar circulos situados sobre el plano.
 * Cada circulo queda determinado por su radio junto con las 
 * coordenadas de su  centro.
 * 
 * @see <a href="https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html#see">javaDoc @see Spec</a>
 * 
 * @author Daniel 
 * @version 0.1, 25/01/22
 */

public class App {
	
    protected double x,y; // coordenadas del centro
    protected double r;  // radio del círculo
    
    /** 
     * Crea un circulo a partir de su origen su radio.
     * 
     * @param x La coordenada x del centro del circulo.
     * @param y La coordenada y del centro del circulo.
     * @param r El radio del circulo. Debe ser mayor o igual a 0.
     */
    public App(double x, double y, double r) {
        this.x=x; this.y = y; this.r = r;
    }   
    
    /** 
     * Calculo del area de este circulo.
     * 
     * @return El area (>= 0) del circulo.
     */
     public double area() {
        return Math.PI*r*r;
     }
     
     /**
      * Pensado para invertir figuras
      * 
      * @deprecated Se decidio dejarlo vacio
      */
     public void invierteF() {
    	    	 
     }
     
     /** 
      * Indica si un punto esta dentro del circulo.
      * 
      * @param px componente x del punto
      * @param py componente y del punto
      * @return true si el punto esta dentro del circulo o false en otro caso.
      */
     public boolean contiene(double px, double py) {
        /* Calculamos la distancia de (px,py) al centro del círculo (x,y),
           que se obtiene como raíz cuadrada de (px-x)^2+(py-y)^2 */
        double d = Math.sqrt((px-x)*(px-x)+(py-y)*(py-y));
        
        // el circulo contiene el punto si d es menor o igual al radio
        return  d <= r;
     }

}
