package ejercicioManiquis;

import java.util.Arrays;

public class Tienda {   
    public static void main(String[] args) {
        Boton boton1 = new Boton("negro", "cuadrado", 10);
        Pantalon pantalon1 = new Pantalon(34, 30, "azul", boton1);
        Camisa camisa1 = new Camisa(36, 20, "blanco", Arrays.asList(boton1));
        Vestido vestido1 = new Vestido(38, 40, "rojo");
        
        Maniqui maniqui1 = new Maniqui(1);
        maniqui1.vestirse(pantalon1, camisa1);
        
        Maniqui maniqui2 = new Maniqui(2);
        maniqui2.vestirse(vestido1);
        
        System.out.println("Precio del vestuario del maniqui 1: " + calcularPrecioVestuario(maniqui1));
        System.out.println("Precio del vestuario del maniqui 2: " + calcularPrecioVestuario(maniqui2));
    }
    
    public static int calcularPrecioVestuario(Maniqui maniqui) {
        int precioTotal = 0;
        
        if (maniqui.getPantalon() != null) {
            precioTotal += maniqui.getPantalon().getPrecio();
        }
        
        if (maniqui.getCamisa() != null) {
            precioTotal += maniqui.getCamisa().getPrecio();
        }
        
        if (maniqui.getVestido() != null) {
            precioTotal += maniqui.getVestido().getPrecio();
        }
        
        return precioTotal;
    }
}

