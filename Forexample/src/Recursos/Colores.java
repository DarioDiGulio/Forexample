package Recursos;

import java.awt.Color;

public class Colores {

    private Color colorFondo;
    private Color colorLetraTitulos;
    private Color colorLetraTextField;
    private Color colorTextoBoton;
    private Color colorFondoBoton;
    private Color colorLetraTextoComun;
    private Color panel;
    private Color fondoOscuro;
    
    public Colores(){
        setColorFondo();
        setColorLetraTitulos();
        setColorLetraTextField();
        setTextoBoton();
        setFondoBoton();
        setLetraTextoComun();
        setColorPanel();
        setFondoOscuro();
    }

    private void setColorFondo() {
        this.colorFondo = new java.awt.Color(74, 83, 155);
    }

    private void setColorLetraTitulos() {
        this.colorLetraTitulos = new java.awt.Color(255, 255, 255);
    }

    private void setColorLetraTextField() {
        this.colorLetraTextField = new java.awt.Color(255, 255, 255);
    }
    
    private void setTextoBoton() {
        this.colorTextoBoton = new java.awt.Color(255, 255, 255);
    }

    private void setLetraTextoComun() {
        this.colorTextoBoton = new java.awt.Color(255, 255, 255);
    }
    
    private void setColorPanel() {
        this.colorTextoBoton = new java.awt.Color(52, 50, 98);
    }

    private void setFondoBoton() {
        this.colorFondoBoton = new java.awt.Color(39, 136, 129);
    }
    
    private void setFondoOscuro() {
        this.colorFondoBoton = new java.awt.Color(67, 75, 142);
    }
    public Color getPanel() {
        return panel;
    }
        
    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorLetraTitulos() {
        return colorLetraTitulos;
    }

    public Color getColorLetraTextField() {
        return colorLetraTextField;
    }

    public Color getColorTextoBoton() {
        return colorTextoBoton;
    }

    public Color getColorLetraTextoComun() {
        return colorLetraTextoComun;
    }

    public Color getColorFondoBoton() {
        return colorFondoBoton;
    }

    public Color getFondoOscuro() {
        return fondoOscuro;
    }

}
