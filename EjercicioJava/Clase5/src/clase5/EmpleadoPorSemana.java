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
public class EmpleadoPorSemana extends Empleado{
    
    //Variables privadas
    private int numero_semanas;
    private double valor_semanal;
    
    //Constructor
    public EmpleadoPorSemana(){
        super();//Llamamos al constructor de la clase padre
        numero_semanas = 0;
        valor_semanal = 0;
    }
    
    //Metodos de agregar
    public void agregar_numero_semanas(int nums){
        numero_semanas = nums;
    }
    
    public void agregar_valor_semanal(double valors){
        valor_semanal = valors;
    }
    
    //Metodos de obtener
    public int obtener_numero_semanas(){
       return numero_semanas;
    }
    
    public double obtener_valor_semanal(){
        return valor_semanal;
    }
    
    //Metodo que calcula el sueldo
    public double calcular_sueldo_final(){
        double sueldo_final = (obtener_numero_semanas() * obtener_valor_semanal())
                + obtener_comision_fija();
        
        return sueldo_final;//Retornamos el sueldo
    }

        //Sobre Escribimos el metodo ToString
    @Override
    public String toString(){
    
        return String.format("%s\tNumero de semanas: %d\n\tValor semanal: %.1f\n\t"
                + "Sueldo Final: %.2f", super.toString(), obtener_numero_semanas(),
                obtener_valor_semanal(),calcular_sueldo_final());
    }
        
    
    
}
