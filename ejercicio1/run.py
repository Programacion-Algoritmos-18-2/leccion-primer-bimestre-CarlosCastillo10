#Autor: Carlos Castillo

from mipaquete.modelo import * #Importamos de mi paquete.modelo todo

e = Empleado()#Obejto de tipo Empleado
#Llamamos a los metodos
e.agregar_nombre("Luis")
e.agregar_apellido("Benitez")
e.agregar_cedula("1110001")

print(e.presentar_datos())#Presenta en panatalla

e1 = EmpleadoPorHoras()#Objeto de tipo EmpeladoPorHoras

nombre = input("\nIngrese su nombre: ")
#Llamamos a los metodos
e1.agregar_nombre(nombre)
e1.agregar_apellido("Andrade")
e1.cedula = "12233"
e1.agregar_valor_hora(20.2)
e1.agregar_numero_horas(15)
e1.agregar_comision_fija(50)
e1.calcular_sueldo_final()

print(e1.presentar_datos())#Presenta en panatalla
#Llamamos a los metodos
e2 = EmpleadoFijo()#Objeto de tipo EmpleadoFijo

e2.agregar_sueldo_fijo(300.2)
e2.descuento_seguro = 10

comision = input("Ingrese comision: ")
comision = float(comision)
e2.agregar_comision_fija(comision)
e2.nombre = "Ana" 
e2.apellido = "Diaz"

print(e2.presentar_datos())#Presenta en panatalla
