# AdministradorCursos1
Proyecto base de ejemplo JEE

Arquitectura basica de proyecto JEE de entrenamiento. Consta de un flujo con DAOS, DTOS y Facade.

Detalles: La aplicacion de ejemplo tiene por objetivo permitir a un usuario inscribirse a un curso, indicado la forma de pago. El proyecto es una
aproximacion preeliminar a una aplicacion mas elaborada utilizando JEE. En esta version solo se programa el backend, dejando la parte front conectada a la
consola. 
En los archivos, en la carpeta \AdministradorCursos1\dist\lib existe el jar hsqldb, que permite utilizar la base de datos en memoria. En cada
equipo debe configurar la base de datos. Puedes seguir el manual de configuracion de hqldb: https://www.tutorialspoint.com/hsqldb/hsqldb_installation.htm

La clase UConnection es la encargada de hacer la conexion con la BD.

El script de base de datos esta en el archivo script_bd.sql
El server.properties esta en el repositorio. Este archivo lo colocan en la raiz de la instalacion de hsqldb. 
