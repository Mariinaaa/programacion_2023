package ejercicioManiquis;

public class Boton {
    private String color;
    private String forma;
    private int tamaño;
    
    public Boton(String color, String forma, int tamaño) {
        this.color = color;
        this.forma = forma;
        this.tamaño = tamaño;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getForma() {
        return forma;
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setForma(String forma) {
        this.forma = forma;
    }
    
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
	