
# PRUEBA

Ejercicio 1: OpenCart



## Requisitos

Para ejecutar el proyecto es necesario tener instalado lo siguiente:


  - JDK 8
  - Intellij-Idea Comunity o Ultimate
  - La ultima version de Google Chrome
  - La ultima version de chromedriver


## Ejecucion

- Para ejecutar el Test implementado se debe ejecutar el proyecto ubicandose en la raiz del proyecto y ejecutando:

1. Abrir la configuracion del proyecto con: Maven project
2. Ubicarse en el archivo CucumberTestSuite.java y ejecutar el Test correspondiente.

Otra forma de ejecutar el proyecto es desde el terminal mediante:

```bash
  #En windows
    ./mvnw.cmd clean install
  #En Linux
    ./mvnw clean install
```


# Reportes
El reporte de ejecuci'on del test realizado se encuentra en la ruta <b>target/site/serenity/index.html<b>
Al abrir el archivo html con un navegador se puede visualizar el resultado de los test ejecutados además de capturas de pantalla
de cada paso ejecutado.

# Posibles errores
Si se presenta el error de que no se puede instanciar el ChromeDriver se tiene que descargar la ultima version del chromedriver y colocarla en las rutas especificadas en el archivo serenity.conf, dependiendo del sistema operativo que se este usando.