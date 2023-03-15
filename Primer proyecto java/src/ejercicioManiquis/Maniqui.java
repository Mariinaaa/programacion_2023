package ejercicioManiquis;

public class Maniqui {
    private int id;
    private Pantalon pantalon;
    private Camisa camisa;
    private Vestido vestido;
    
    public Maniqui(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public Pantalon getPantalon() {
        return pantalon;
    }
    
    public Camisa getCamisa() {
        return camisa;
    }
    
    public Vestido getVestido() {
        return vestido;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }
    
    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }
    
    public void setVestido(Vestido vestido) {
        this.vestido = vestido;
    }
    
    public void vestirse(Pantalon pantalon, Camisa camisa) {
        this.pantalon = pantalon;
        this.camisa = camisa;
    }
    
    public void desvestirse() {
        this.pantalon = null;
        this.camisa = null;
    }
    
    public void vestirse(Vestido vestido) {
        this.vestido = vestido;
    }
}
