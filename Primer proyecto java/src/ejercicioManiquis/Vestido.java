package ejercicioManiquis;

public class Vestido {
    private int talla;
    private int precio;
    private String color;
    
    public Vestido(int talla, int precio, String color) {
        this.talla = talla;
        this.precio = precio;
        this.color = color;
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
    
    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
