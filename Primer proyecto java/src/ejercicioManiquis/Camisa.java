package ejercicioManiquis;

import java.util.List;

public class Camisa {
    private int talla;
    private int precio;
    private String color;
    private List<Boton> botones;
    
    public Camisa(int talla, int precio, String color, List<Boton> botones) {
        this.talla = talla;
        this.precio = precio;
        this.color = color;
        this.botones = botones;
    }
    
    public int getTalla() {
        return talla;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public List<Boton> getBotones() {
        return botones;
    }
    
    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setBotones(List<Boton> botones) {
        this.botones = botones;
    }
}