# Documentación Tarea 5
Primero configuramos nuestro nombre y correo electrónico para que se identifique el autor de los commits.
```git
git config user.name "Víctor Sánchez Sánchez"
git config user.email "2914176@alu.murciaeduca.es"
```
`En este caso no habrá mensaje por pantalla`

En la raíz de nuestro proyecto inicializamos el repositorio local.

```git
git init
```
Y nos aparecerá el mensaje que se ha inicializado el repositorio

`Initialized empty Git repository`

Añadimos los ficheros, Cliente, Main y Pedidos y realizamos el primer commit.

El primer paso es decirle a Git que añada todos los cambios que hemos realizado al staging

```git 
git add .
```
Con el `.` le indicamos que añada todos los archivos de ese repositorio al stag antes de confirmar los cambios.

Se confirman los cambios y se hace el commit para confirmar los cambios.

```git
git commit -m "Se añaden las clases Cliente, Pedido y Main"
```
Y por pantalla aparecerán los cambios en nuestro control de versiones.

```[master (root-commit) f704703] Se añaden las clases Cliente, Pedido y Main
 3 files changed, 52 insertions(+)
 create mode 100644 Cliente.java
 create mode 100644 Main.java
 create mode 100644 Pedido.java
```
A continuación se cambia el nombre de la rama principal "master" a "main" dado a que es una buena práctica.
```git
git branch -m master main
```
No aparecerá ningún mensaje por pantalla si todo ha funcionado correctamente.

Creamos una rama a partir de la rama main.
```git
git checkout -b refacto
```
Y nos aparece el siguiente mensaje, que nos indica que ha creado la rama y que ahora nos ha cambiado a esa rama.

`Switched to a new branch 'refacto'`

Otras opciones de crear ramas son:
```git
git switch -c refacto # hace lo mismo que checkout
git branch refacto # la crea pero no te cambia a ella
```
Refacforizamos los archivos Cliente.java y Pedido.java y los confirmamos.
```git
git add .
git commit -m "realizada encapsulación de los atributos de las clases pedido y cliente"
```
Y nos aparecerán los cambios

```
src/Cliente.java | 6 +++---
 src/Pedido.java  | 4 ++--
 2 files changed, 5 insertions(+), 5 deletions(-)
```
Se refactorizan los métodos procesarPedido y procesarPedidoVip. Se ralizan algunos cambios oportunos en la clase main para comprobar el funcionamiento de la refactorización y se realiza un nuevo commit.
```git
git add .
git commit -m "creados getters y setters de clases cliente y pedido"
```
Y se muestran los cambios
```
src/Cliente.java |  8 ++++++++
 src/Main.java    |  6 +++---
 src/Pedido.java  | 24 +++++++++++++-----------
 ```
Nos percatamos que hemos tenido un error en una refactorización por lo que volvemos a realizar un nuevo commit con el problema solventado.
```git
git add .
git commit -m "refactorizada la clase Main aplicando las refactorizaciones de las clases"
```
Y se muestran los cambios.
```
src/Pedido.java | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)
```
Una vez realizados los cambios pertinentes, cambiamos de rama a la rama main.
```git
git switch main
# o
git checkout main
```
Y aparecerá el mensaje
```
Switched to branch 'main'
```
Ahora vamos a fusionar los cambios de la rama refacto en la main.
```git
git merge refacto
```
Y los cambios se quedarán reflejados en la rama main. Como no he tenido ningún conficto (y el ejercicio lo hice antes de tiempo). Los cambios del merge no se han visto reflejados en el log porque se realiza un Fast Fordward que unifica los cambios sin hacer un commit del merge y no aparecen los datos en el log. 😓
