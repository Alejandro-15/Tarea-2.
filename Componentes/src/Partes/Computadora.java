/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Partes;

/**
 *
 * @author Calanda
 */
public class Computadora {
    
    private String marca;
    private String modelo;
    private String marcaTeclado;
    private String modeloTeclado;
    private String marcaMouse;
    private String modeloMouse;
    private String marcaMmonitor;
    private String modeloMonitor;
    private int pulgadasMonitor;
    private int velocidadProcesador;
    private String tipoMouse;
    private int numeroTeclas;
    private int multimedia;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String marcaTeclado, String modeloTeclado, String marcaMouse, String modeloMouse, String marcaMmonitor, String modeloMonitor, int pulgadasMonitor, int velocidadProcesador, String tipoMouse, int numeroTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.marcaTeclado = marcaTeclado;
        this.modeloTeclado = modeloTeclado;
        this.marcaMouse = marcaMouse;
        this.modeloMouse = modeloMouse;
        this.marcaMmonitor = marcaMmonitor;
        this.modeloMonitor = modeloMonitor;
        this.pulgadasMonitor = pulgadasMonitor;
        this.velocidadProcesador = velocidadProcesador;
        this.tipoMouse = tipoMouse;
        this.numeroTeclas = numeroTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarcaTeclado() {
        return marcaTeclado;
    }

    public void setMarcaTeclado(String marcaTeclado) {
        this.marcaTeclado = marcaTeclado;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getMarcaMouse() {
        return marcaMouse;
    }

    public void setMarcaMouse(String marcaMouse) {
        this.marcaMouse = marcaMouse;
    }

    public String getModeloMouse() {
        return modeloMouse;
    }

    public void setModeloMouse(String modeloMouse) {
        this.modeloMouse = modeloMouse;
    }

    public String getMarcaMmonitor() {
        return marcaMmonitor;
    }

    public void setMarcaMmonitor(String marcaMmonitor) {
        this.marcaMmonitor = marcaMmonitor;
    }

    public String getModeloMonitor() {
        return modeloMonitor;
    }

    public void setModeloMonitor(String modeloMonitor) {
        this.modeloMonitor = modeloMonitor;
    }

    public int getPulgadasMonitor() {
        return pulgadasMonitor;
    }

    public void setPulgadasMonitor(int pulgadasMonitor) {
        this.pulgadasMonitor = pulgadasMonitor;
    }

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(int velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    public String getTipoMouse() {
        return tipoMouse;
    }

    public void setTipoMouse(String tipoMouse) {
        this.tipoMouse = tipoMouse;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", marcaTeclado=" + marcaTeclado + ", modeloTeclado=" + modeloTeclado + ", marcaMouse=" + marcaMouse + ", modeloMouse=" + modeloMouse + ", marcaMmonitor=" + marcaMmonitor + ", modeloMonitor=" + modeloMonitor + ", pulgadasMonitor=" + pulgadasMonitor + ", velocidadProcesador=" + velocidadProcesador + ", tipoMouse=" + tipoMouse + ", numeroTeclas=" + numeroTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
    
}