# CHALENGE NTTDATA Ejercicio E2E
Para iniciar el proyecto se utilizo un plantilla propia de serenityBDD.

Pagina : https://serenity-bdd.github.io/docs/tutorials/cucumber-screenplay

Clonar el proyecto.
Una vez clonado abrir el proyecto el IntelliJ IDEA.
Es un proyecto maven
Una vez cargado el proyecto ejecutar las siguiente instrucciones:
* nvm clean install
* nvm verify
Para ejecutar la prueba accerder a la carpeta test/resource/feature y 
abrir el archivo productPage.feature y ejecurtar.

En caso de presentar inconveniente abrir el modulo de configuracion del proyecto y cambiar el JDK
a 1.8 o a superior en esta pruba actualment se esta ejecutando con el 11.0.15

# Conclusion

* Se realizo una prueba a la pagina https://www.demoblaze.com/ en 5 pasos, las pruebas pasaron de forma exitosa.
* Esta prueba es mas utilizada para las pruebas de humo y pruebas de regresión, para verificar si no se altero la respuestas en el flujo 
con algun cambio que se implanto.
