/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.cosas;

/**
 *
 * @author PC
 */
public class Reloj {
    private int hora;
    private int minuto ;
    private int segundo;
    private boolean manecilla; //False = es digital
    private String marca;
    private int[] alarma;
    private int[] fecha;

    public Reloj() {
    }

    public Reloj(int hora, int minuto, int segundo, boolean manecilla, String marca, int[] alarma, int[] fecha) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.manecilla = manecilla;
        this.marca = marca;
        this.alarma = alarma;
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public boolean isManecilla() {
        return manecilla;
    }

    public void setManecilla(boolean manecilla) {
        this.manecilla = manecilla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int[] getAlarma() {
        return alarma;
    }

    public void setAlarma(int[] alarma) {
        this.alarma = alarma;
    }

    public int[] getFecha() {
        return fecha;
    }

    public void setFecha(int[] fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Reloj{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + ", manecilla=" + manecilla + ", marca=" + marca + ", alarma=" + alarma + ", fecha=" + fecha + '}';
    }
    
    public void mostrarHoraActual(){
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
        
    }
    
    public void incrementarSegundo(){
      
        if( this.segundo < 59){
            this.segundo++; //incremento en 1
        }else{
            this.incrementarMinuto();
            this.segundo = 0;
            
        }
        
        //hila de espera de un segundo exacto
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        
        
        
    }
    
    public void incrementarMinuto(){
        if (this.minuto < 59){
            
        }else{
            this.incrementarHora();
            this.minuto = 0;
        }
    }
    
    
   public void incrementarHora(){
       if(this.hora < 23 ){
           this.hora++;
       }else{
           //incrementarDia()
           this.hora=0;
       }
   }
    
}
