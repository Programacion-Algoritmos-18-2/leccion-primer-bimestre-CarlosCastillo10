"""
    @CarlosCastillo10
"""

class Empleado(object): #Clase Padre
    
    #Constructor
    def __init__(self):
        self.nombre = " "
        self.apellido = " "
        self.cedula = " "
        self.comision_fija = 0

    #Metodos de agregar
    def agregar_nombre(self, n):  
        self.nombre = n

    def agregar_apellido(self, a):
        self.apellido = a

    def agregar_cedula(self, c):  
        self.cedula= c

    def agregar_comision_fija(self, comision):
        self.comision_fija = comision

     #  Metodos de obtener   
    def obtener_nombre(self):
        return self.nombre

    def obtener_apellido(self):
        return self.apellido

    def obtener_cedula(self):
        return self.cedula

    def obtener_comision_fija(self):
        return self.comision_fija

    # Metodo de presentar datos
    def presentar_datos(self):
        cadena =  "Informacion de %s %s\n\tCedula: %s" % (self.obtener_nombre(),self.obtener_apellido(),self.obtener_cedula())
        return cadena#Retorna cadena

class EmpleadoPorHoras(Empleado):#Clase hija que era de la clase padre ("Empleado")
    
    def __init__(self):
        
        super(EmpleadoPorHoras, self).__init__()       
        self.numero_horas = 0
        self.valor_hora = 0


    #Metodos de agregar  
    def agregar_numero_horas(self, numh):  
        self.numero_horas = numh

    def agregar_valor_hora(self, valorh):  
        self.valor_hora = valorh

    #Metodos de obtener 
    def obtener_numero_horas(self):
        return self.numero_horas

    def obtener_valor_hora(self):
        return self.valor_hora

    #Metodo que calcula el sueldo
    def calcular_sueldo_final(self):
        sueldo_final = (self.obtener_numero_horas() * self.obtener_valor_hora()) + self.obtener_comision_fija()
        return sueldo_final 


    #Metodo de presentar datos(Llama al metodo presentar_datos de la clase padre "Empleado")
    def presentar_datos(self):
        #Llamamos al metodo presentar datos de la clase padre
        cadena = "%s\n\tNumero de horas: %d\n\tValor por Hora: %d\n\tSueldo Final: %.1f\n" % (super(EmpleadoPorHoras, self).presentar_datos(), self.obtener_numero_horas()
            ,self.obtener_valor_hora(),self.calcular_sueldo_final())

        return cadena#Retorna cadena

class EmpleadoFijo(Empleado):#Clase hija que era de la clase padre ("Empleado")

    def __init__(self):
        
        super(EmpleadoFijo, self).__init__()       
        self.sueldo_fijo = 0
        self.descuento_seguro = 0
    
    def agregar_sueldo_fijo(self, sueldof):  
        self.sueldo_fijo = sueldof

    def agregar_descuento_seguro(self, descuento):  
        self.descuento_seguro = descuento

        #Metodos de obtener 
    def obtener_sueldo_fijo(self):
        return self.sueldo_fijo

    def obtener_descuento_seguro(self):
        return self.descuento_seguro

#Metodo que calcula el sueldo
    def calcular_sueldo_final1(self):
        sueldo_final = (self.obtener_sueldo_fijo() + self.obtener_comision_fija()) - (self.obtener_sueldo_fijo() * (self.obtener_descuento_seguro() / 100))
        
        return sueldo_final#Retorna el sueldo
    
    def presentar_datos(self):
        #Llamamos al metodo presentar datos de la clase padre
        cadena = "%s\n\tSueldo Fijo: %.1f\n\tDescuento Seguro: %d%s\n\tSueldo Final: %.1f\n" % (super(EmpleadoFijo, self).presentar_datos(), self.obtener_sueldo_fijo()
            ,self.obtener_descuento_seguro(),"%",self.calcular_sueldo_final1())

        return cadena

class EmpleadoPorSemana(Empleado):#Clase hija que era de la clase padre ("Empleado")

    def __init__(self):
        
        super(EmpleadoPorSemana, self).__init__()       
        self.numero_semanas = 0
        self.valor_semanal = 0

    def agregar_numero_semanas(self, nums):  
        self.numero_semanas = nums

    def agregar_valor_semanal(self, vsemanal):  
        self.valor_semanal = vsemanal

        #Metodos de obtener 
    def obtener_numero_semanas(self):
        return self.numero_semanas

    def obtener_valor_semanal(self):
        return self.valor_semanal

    def calcular_sueldo_final(self):
        sueldo_final = (self.obtener_numero_semanas() * self.obtener_valor_semanal()) + self,obtener_comision_fija()

        return sueldo_final#Retorna el sueldo final


    def presentar_datos(self):
        #Llamamos al metodo presentar datos de la clase padre
        cadena = "%s\n\tNumero de Horas: %.1f\n\tValor Semanal: %d%s\n\tSueldo Final: %.1f\n" % (super(EmpleadoFijo, self).presentar_datos(), self.obtener_numero_semanas()
            ,self.obtener_valor_semanal(),"%",self.calcular_sueldo_final1())

        return cadena

    

