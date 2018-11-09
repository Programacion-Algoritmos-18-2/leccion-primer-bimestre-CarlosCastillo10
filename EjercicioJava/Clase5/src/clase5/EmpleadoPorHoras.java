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
public class EmpleadoPorHoras extends Empleado{
    //Variable privadas
    private int numero_horas;
    private double valor_horas;
    
    
    //Constructor
    public EmpleadoPorHoras(){
        super();//Llamamos al constructor de la clase padre
        numero_horas = 0;
        valor_horas = 0;
    }
    
    //Metodos de agregar
    public void agregar_numero_horas(int numh){
        numero_horas = numh;
    }
    
    public void agregar_valor_horas(double valorh){
        valor_horas = valorh;
    }
    
    //Metodos de obtener
    public int obtener_numero_horas(){
       return numero_horas;
    }
    
    public double obtener_valor_horas(){
        return valor_horas;
    }
    
    //Calculamos el sueldo final
    public double calcular_sueldo_final(){
        double sueldo_final = (obtener_numero_horas() * obtener_valor_horas())
                + obtener_comision_fija();
        return sueldo_final;//Retornamos el sueldo final
    }
    
    //Sobre Escribimos el metodo ToString
     @Override
    public String toString(){
    
        return String.format("%s\tNumero de horas: %d\n\tValor hora: %.1f\n\t"
                + "Sueldo Final: %.2f", super.toString(), obtener_numero_horas(),
                obtener_valor_horas(),calcular_sueldo_final());
    }
    
    
}
