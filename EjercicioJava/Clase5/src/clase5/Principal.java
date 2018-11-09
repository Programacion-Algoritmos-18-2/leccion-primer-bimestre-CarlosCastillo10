/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);//Importamos el metodo Scanner
        //Variables globales
        String nombre;
        double comision;
        
        Empleado e = new Empleado();//Creamos el objeto de tipo Empleado
        //Accedemos a los metodos del objeto
        e.agregar_nombre("Luis");
        e.agregar_apellido("Benitez");
        e.agregar_cedula("1110001");
        System.out.println(e);
        
        EmpleadoPorHoras e1 = new EmpleadoPorHoras();//Creamos el objeto de tipo EmpleadoPorHoras

        System.out.printf("\nIngrese su nombre: ");
        nombre = entrada.nextLine();
        //Accedemos a los metodos del objeto
        e1.agregar_nombre(nombre);
        e1.agregar_apellido("Andrade");
        e1.agregar_cedula("12233") ;
        e1.agregar_valor_horas(20.2);
        e1.agregar_numero_horas(15);
        e1.agregar_comision_fija(50);
        e1.calcular_sueldo_final();
        
        System.out.println(e1);
        
        EmpleadoFijo e2 = new EmpleadoFijo();//Creamos el objeto de tipo EmpleadoFijo
        //Accedemos a los metodos del objeto
        e2.agregar_sueldo_fijo(300.2);
        e2.agregar_descuento_seguro(10);

        System.out.printf("\nIngrese comision: ");
        comision = entrada.nextDouble();
        //Accedemos a los metodos del objeto
        e2.agregar_comision_fija(comision);
        e2.agregar_nombre("Ana");
        e2.agregar_apellido("Diaz");
        System.out.println(e2);
        
        
    }
    
}
