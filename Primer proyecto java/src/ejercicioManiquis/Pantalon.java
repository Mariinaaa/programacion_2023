package ejercicioManiquis;

public class Pantalon {
    private int talla;
    private double precio;
    private String color;
    private Boton boton;
    
    public Pantalon(int talla, double precio, String color, Boton boton) {
        this.talla = talla;
        this.precio = precio;
        this.color = color;
        this.boton = boton;
    }
    
    public int getTalla() {
        return talla;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public Boton getBoton() {
        return boton;
    }
    
    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setBoton(Boton boton) {
        this.boton = boton;
    }
}
