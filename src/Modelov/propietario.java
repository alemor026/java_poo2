/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelov;

/**
 *
 * @author Usuaria
 */
public class propietario extends persona {
    private String nit;
    private String cui;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

   
    
    @Override
  public void agregar(){
  System.out.println("Nit: " + getNit() );
  System.out.println("CUI: " + getCui() );
  System.out.println("Nombre: " + this.getNombre() );
  System.out.println("Apellido: " + this.getApellido() );
  System.out.println("Direccion: " + this.getDireccion() );
  System.out.println("Telefono: " + this.getTelefono() );
  System.out.println("Dia: " + this.getDia() );
  System.out.println("Mes: " + this.getMes() );
  System.out.println("Año: " + this.getAnio() );
}
  public void mostar(){}
  
}
