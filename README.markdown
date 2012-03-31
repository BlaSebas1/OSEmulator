SIMULACI�N DE UN SISTEMA OPERATIVO
==================================

Objetivo
--------

Realizar, mediante cualquier lenguaje de programaci�n, la simulac�on de un sistema operativo, 
crear, manejar y destruir los procesos, asignarlos a un espacio de memoria mediante alg�n m�todo
de ajuste. Crear estad�sticas en base a estos factores.


Desarrollo
----------

Se debe de crear un entorno de Sistema Operativo, este funcionar� como una simulac�on de un SO real.
Al momento de ejecutarse el entorno del SO se deber�n presentar la opci�n de cual m�todo de ajuste de 
memoria se usar�. Una vez seleccionado el ajuste se procede a crear autom�ticamente los procesos e irlos 
asignando a la memoria. Despues de su tiempo de ejecuci�n se mandar� a cola el proceso o se destruir� seg�n	
sea el caso.

## **Proceso**
El objeto del proceso constara de m�nimo las siguientes caracter�sticas:

+ Tama�o.

	- Esto indicar� el tama�o del proceso a ejecutarse para alojarse en la memoria.

+ Tiempo Total de Ejecuci�n

	- Esto indicar� el tiempo que le tardar� al proceso realizar su funci�n. Este tiempo es afectado solo cuando esta en ejecuci�n (memoria) y no debe de ser alterado cuando este en espera.

+ ID �nico.

	- Servir� como un identificador del proceso.


*NOTA [1]: Los campos de Tama�o y Tiempo Total de Ejecuci�n deber�n de ser asignadas aleatoriamente y tamb�en deber�n de ser parametrizable.*

## **Memoria**
La memoria se manejara como una lista FIFO (First-In First-Out).   
//Sera variable, asignar cada objeto de la memoria con un tama�o variable?   
La memoria sirve para ajustar los procesos dentro de ella. Para esto consta de 3 algoritmos de ajuste:   

+ Primer Ajuste.

	- Colocar el programa al primer espacio disponible en la memoria.
	
+ Mejor Ajuste

	- Colocar el programa al espacio de memoria con menor desperdicio de ella.
	
+ Peor Ajuste.

	- Colocar el programa al mayor espacio de memoria disponible.
	

*NOTA [1]: Al comenzar la emulaci�n del SO se debe presentar la opci�n al usuario de escoger cual m�todo de ajuste desea.*   
*NOTA [2]: Independientemente del m�todo de ajuste de memoria seleccionado tambi�n se deber� de simular el entorno del SO con los otros dos m�todos de ajuste, esto con la finalidad de realizar las estad�sticas.*   

## **Estad�sticas**
Se deben realizar estad�sticas en base a los 3 modelos de ajuste de memoria.  
Comparaciones sobre cual fue el m�s r�pido, m�s efectivo, etc.  

## **Notas Finales**
Se deber� de correr la simulaci�n un total de 360,000,000 unidades de tiempo.   
Siempre deber� de haber procesos (en memoria o en cola) durante todo el tiempo de la simulaci�n.   

---

### **En resumen:**

#### **Proyecto**

+ Simulaci�n de un SO.
+ Emular un ambiente de SO
+ Procesos (tama�o, tiempo total de ejecuci�n, ID �nico).
	- Generar las dos primeras de forma aleatoria tambi�n parametrizable

#### **Algoritmos de colocaci�n**

+ Primer ajuste.
+ Mejor ajuste
+ Peor ajuste.

#### **Tomar en cuenta**

+ Tama�o de memoria.
+ Tiempo total de ejecuci�n por proceso (ambos parametrizables)
+ Siempre debe de haber procesos
+ Tiempo total de ejecuci�n de la simulaci�n.

#### **Estad�sticas**