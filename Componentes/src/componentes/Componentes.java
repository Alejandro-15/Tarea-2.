package componentes;

import Partes.CPU;
import Partes.Computadora;
import Partes.Monitor;
import Partes.Mouse;
import Partes.Teclado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Calanda
 */
public class Componentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CPU cpu1 = new CPU("intel","i9 9900K",5);
        Computadora computadora1 = new Computadora("HP","Pavilion gamer","Yeyian","Flare serie 2000","Logitech","G203","ASUS","VP229HE",22, (int) 5,"alambrico",105,12);
        Monitor monitor1 = new Monitor("ASUS","VP229HE",22);
        Mouse mouse1= new Mouse("Logitech","G203","Alambrico");
        Teclado teclado1 = new Teclado("Yeyian","Flare serie 2000",105,12);
        System.out.println("Marca de Procesador:"+cpu1.getMarca());
        System.out.println("Modelo de Procesador:"+cpu1.getModelo());
        System.out.println("velocidad de Procesador:"+cpu1.getVelocidadProcesador());
        
        System.out.println("Marca de Computadora:"+computadora1.getMarca());
        System.out.println("Modelo de Computadora:"+computadora1.getModelo());
        System.out.println("Marca de teclado de Computadora:"+computadora1.getMarcaTeclado());
        System.out.println("Modelo de teclado de Computadora:"+computadora1.getModeloTeclado());
        System.out.println("Marca de mouse de Computadora:"+computadora1.getMarcaMouse());
        System.out.println("Modelo de mouse de Computadora:"+computadora1.getModeloMouse());
        System.out.println("Marca de monitor de Computadora:"+computadora1.getMarcaMmonitor());
        System.out.println("Modelo de monitor de Computadora:"+computadora1.getModeloMonitor());
        System.out.println("Pulgadas de monitor de Computadora:"+computadora1.getPulgadasMonitor());
        System.out.println("Velocidad de procesador de Computadora:"+computadora1.getVelocidadProcesador());
        System.out.println("Tipo de mouse de Computadora:"+computadora1.getTipoMouse());
        System.out.println("Numero de teclas de Computadora:"+computadora1.getNumeroTeclas());
        System.out.println("Multimedia de Computadora:"+computadora1.getMultimedia());
        
        System.out.println("Marca de Monitor:"+monitor1.getMarca());
        System.out.println("Modelo de Monitor:"+monitor1.getModelo());
        System.out.println("pulgadas de Monitor:"+monitor1.getPulgadas());
        
        System.out.println("Marca de Mouse:"+mouse1.getMarca());
        System.out.println("Modelo de Mouse:"+mouse1.getModelo());
        System.out.println("Tipo de Mouse:"+mouse1.getTipo());
        
        System.out.println("Marca de Teclado:"+teclado1.getMarca());
        System.out.println("Modelo de Teclado:"+teclado1.getModelo());
        System.out.println("numero de teclas de Teclado:"+teclado1.getNumeroDeTeclas());
        System.out.println("Multimedia de Teclado:"+teclado1.getMultimedia());
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}