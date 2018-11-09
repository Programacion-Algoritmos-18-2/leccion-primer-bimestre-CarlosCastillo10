/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author carlos
 */
public class Empleado{
    //Varibales privadas
    private String nombre;
    private String apellido;
    private String cedula;
    private double comision_fija;
    
    //Constructor
    public Empleado(){
        nombre = "";
        apellido = "";
        cedula = "";
        comision_fija = 0;
    }
    
    //Metodos de Agregar
    public void agregar_nombre(String n){
        nombre = n;
    } 
    
    public void agregar_apellido(String a){
        apellido = a;
    }
    
    public void agregar_cedula(String c){
        cedula = c;
    }
    
    public void agregar_comision_fija(double comision){
        comision_fija = comision;
    }
    
    //Metodos de obtener
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_apellido(){
        return apellido;
    }
    
    public String obtener_cedula(){
        return cedula;
    }
    
    public double obtener_comision_fija(){
        return comision_fija;
    }
    
    //Sobre escribimos el metodo ToString
    @Override
    public String toString(){
    
        return String.format("\nInformacion de %s %s\n\tCedula: %s\n", obtener_nombre()
                ,obtener_apellido(),obtener_cedula());
    }
}
