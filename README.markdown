SIMULACIÓN DE UN SISTEMA OPERATIVO
==================================

Objetivo
--------

Realizar, mediante cualquier lenguaje de programación, la simulacíon de un sistema operativo, 
crear, manejar y destruir los procesos, asignarlos a un espacio de memoria mediante algún método
de ajuste. Crear estadísticas en base a estos factores.


Desarrollo
----------

Se debe de crear un entorno de Sistema Operativo, este funcionará como una simulacíon de un SO real.
Al momento de ejecutarse el entorno del SO se deberán presentar la opción de cual método de ajuste de 
memoria se usará. Una vez seleccionado el ajuste se procede a crear automáticamente los procesos e irlos 
asignando a la memoria. Despues de su tiempo de ejecución se mandará a cola el proceso o se destruirá según	
sea el caso.

## **Proceso**
El objeto del proceso constara de mínimo las siguientes características:

+ Tamaño.

	- Esto indicará el tamaño del proceso a ejecutarse para alojarse en la memoria.

+ Tiempo Total de Ejecución

	- Esto indicará el tiempo que le tardará al proceso realizar su función. Este tiempo es afectado solo cuando esta en ejecución (memoria) y no debe de ser alterado cuando este en espera.

+ ID único.

	- Servirá como un identificador del proceso.


*NOTA [1]: Los campos de Tamaño y Tiempo Total de Ejecución deberán de ser asignadas aleatoriamente y tambíen deberán de ser parametrizable.*

## **Memoria**
La memoria se manejara como una lista FIFO (First-In First-Out).   
//Sera variable, asignar cada objeto de la memoria con un tamaño variable?   
La memoria sirve para ajustar los procesos dentro de ella. Para esto consta de 3 algoritmos de ajuste:   

+ Primer Ajuste.

	- Colocar el programa al primer espacio disponible en la memoria.
	
+ Mejor Ajuste

	- Colocar el programa al espacio de memoria con menor desperdicio de ella.
	
+ Peor Ajuste.

	- Colocar el programa al mayor espacio de memoria disponible.
	

*NOTA [1]: Al comenzar la emulación del SO se debe presentar la opción al usuario de escoger cual método de ajuste desea.*   
*NOTA [2]: Independientemente del método de ajuste de memoria seleccionado también se deberá de simular el entorno del SO con los otros dos métodos de ajuste, esto con la finalidad de realizar las estadísticas.*   

## **Estadísticas**
Se deben realizar estadísticas en base a los 3 modelos de ajuste de memoria.  
Comparaciones sobre cual fue el más rápido, más efectivo, etc.  

## **Notas Finales**
Se deberá de correr la simulación un total de 360,000,000 unidades de tiempo.   
Siempre deberá de haber procesos (en memoria o en cola) durante todo el tiempo de la simulación.   

---

### **En resumen:**

#### **Proyecto**

+ Simulación de un SO.
+ Emular un ambiente de SO
+ Procesos (tamaño, tiempo total de ejecución, ID único).
	- Generar las dos primeras de forma aleatoria también parametrizable

#### **Algoritmos de colocación**

+ Primer ajuste.
+ Mejor ajuste
+ Peor ajuste.

#### **Tomar en cuenta**

+ Tamaño de memoria.
+ Tiempo total de ejecución por proceso (ambos parametrizables)
+ Siempre debe de haber procesos
+ Tiempo total de ejecución de la simulación.

#### **Estadísticas**