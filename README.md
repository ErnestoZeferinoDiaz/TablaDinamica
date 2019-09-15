# TablaDinamica
Llena segundo a segundo una simple tabla hecha en java

Para dar estilo a nuestra app queremos que los datos en nuestra tabla vayan apareciendo poco a poco y no se muestren todos de golpe
y nisiquiera implementando un Thread.sleep(); podemos lograrlo

La solucion que encontre fue utilizar un hilo que se encargue de llenar la tabla poco a poco y el evento que activara nuestra accion solo inniciara el hilo
