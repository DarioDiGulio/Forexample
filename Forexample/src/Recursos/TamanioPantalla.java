package Recursos;

import java.awt.Dimension;
import java.awt.Toolkit;

public class TamanioPantalla {
    private final Toolkit toolkit;
    Dimension screenSize;
    private final int ancho;
    private final int alto;

    public TamanioPantalla() {
        this.toolkit = Toolkit.getDefaultToolkit(); 
        this.screenSize = this.toolkit.getScreenSize();
        this.ancho = this.screenSize.width;
        this.alto = this.screenSize.height;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
    
    public int getAnchoPartidoEn(int partes){
        return this.ancho / partes;
    }
    
    public int getAltoPartidoEn(int partes){
        return this.alto / partes;
    }
    
    public int getAltoVentana(){
        return getAltoPartidoEn(2);
    }
    
    public int getAnchoVentana(){
        return getAnchoPartidoEn(2);
    }
}
