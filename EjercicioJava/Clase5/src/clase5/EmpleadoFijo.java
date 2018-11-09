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
public class EmpleadoFijo extends Empleado {
    
    //Variables privadas.
    private double sueldo_fijo;
    private double descuento_seguro;
    
    //Constructor
    public EmpleadoFijo(){
        super();//Llamamos al constructor de la clase padre
        sueldo_fijo = 0;
        descuento_seguro = 0;
    }
    
    //Metodos de agregar
    public void agregar_sueldo_fijo(double sueldof){
        sueldo_fijo = sueldof;
    }
    
    public void agregar_descuento_seguro(double descuento){
        descuento_seguro = descuento;
    }
    
    //Metodos de obtener
    public double obtener_sueldo_fijo(){
       return sueldo_fijo;
    }
    
    public double obtener_descuento_seguro(){
        return descuento_seguro;
    }
    public double calcular_sueldo_final(){
        
        double sueldo_final = (obtener_sueldo_fijo() + obtener_comision_fija()) -
                (obtener_sueldo_fijo() * (obtener_descuento_seguro() / 100));
        
        return sueldo_final;//Retornamos el sueldo final
    }
    
        //Sobre Escribimos el metodo ToString
     @Override
    public String toString(){
    
        return String.format("%s\tSueldo fijo: %.2f\n\tDescuento: %.1f%s\n\t"
                + "Sueldo Final: %.2f", super.toString(), obtener_sueldo_fijo(),
                obtener_descuento_seguro(),"%",calcular_sueldo_final());
    }
    
}
