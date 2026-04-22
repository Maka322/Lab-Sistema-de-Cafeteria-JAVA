Preguntas del cuestionario primera parte:

1. ¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le asignas 3.50?

- Uso double porque los precios suelen tener decimales y este tipo de dato los permite. Si usaras int, Java daría error al intentar guardar los decimales o los borraría, haciendo que cobres menos dinero del real

2. ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador?

- El operador usado para el descuento es el de comparación (>), el cual devuelve un tipo de dato boolean.

3. ¿En qué situación preferirías usar switch en lugar de una cadena de if-else? ¿Hay algún caso en este ejercicio donde el switch no sería la mejor opción?

- Tenemos algo especifico, cuanto el tema es mas extenso usamos el if/else.

4. ¿Qué ocurre si la condición del while nunca se vuelve falsa? ¿Cómo lo prevendrías en este caso?

- Nunca cambiaria el inventario, quedaria un bucle infinito.

5. ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en el orden de ejecución?

- While válida y luego ejecuta, Do While, entra a ejecutar primero antes de válidar, si el valor es invalido el sistema permite nuevamente validarlo.
  
6. ¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando
conoces el número de elementos?

- El for, permite saber cuantos elementos tiene el array, el while al usar el contador, lo olvida y crea un bucle infinito.

7. ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error lógico? ¿Cómo los distingues?

- (3) Errores puntuales encontrados:

  * Tipo de dato incorrecto: Se asignó "5" (texto) a un int debe ser 5 (número).

  * Falta de punto y coma: La línea de double total no termina en  ;.

  * Error de comparación: En el if se usó = (asignación) en lugar de == o simplemente evaluar la variable booleana.

## COLABORADORES:

- Jordan Barrera
- Brayan Castro
- Marcia Baquero





