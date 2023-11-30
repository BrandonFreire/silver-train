# Clase 2

*fecha: 08/11/2023*

1. Abrir terminal 
2. windows:             CTRL+SHIFT+P
3. quick ope:           CTRL+P  
4. toggle sidebar:      CTRL+B
5. multi-select cursor: CTRL+ALT, CTRL+F2, ALT+SHIFT+RATON
6. copy line:           SHIFT+ALT+UP, ALT+SHIFT+DOWN
7. comment code block:  SHIFT+ALTA+A (multi-line comment), CTRL+K+C (single-line)
8. goback/move forward ALT -> or+
9. Trigger suggestion and Trigger parameter hints: CTRL+SPACE,CTRL+SHIFT+SPACE
10. line cut:           CTRL+X
11. previsualizacion:   CTRL+SHIFT+V
12. limpiar terminal:   CTRL+L

----------------------------------
markdown
# titulo1

## subtitulo2

### titulo3
...
**palabras en negrita**

*palabras en cursiva*

***palabras en negrita y cursiva***

~~texto tachado~~

...
[google](www.google.com)
![imagen](img/img1.png)


------------------------------------------------------------
------------------------------------------------------------
# Clase 3

*09/11/2023*

-----------------------

Apuntes en el git 
El git recopila las conexiones y cambios 

-----------------------

### Git:

Fue creado en 2005 por Linus Torvalds
Facilita el trabajo colaborativo 
 
### Comandos de Git
 -**Pull:** para bajar cambios anteriores 
 -**Push:** para subir los cambios al proyecto 
 -**Clone:** copia un repositorio a tu computadora local
 -**Commit:** guarda los cambios realizados en la carpeta actual
-**Fetch:** comando para forzar el proceso y hacer que el programa funcione 

En la industria el 70% de la infraestructura esta en linux 
El kernel de MacOs se basa o es linux 

### Comandos de Linux 

- todos los comandos de git llevan "git", y los que no entonces seran de windows

  limpiar terminal:   *clear*

  limpiar terminal:   *CTRL+L*

                      cd/home/usuario/proyecto_git 

listar:                      *ls -l*

ubicacion de las carpetas(directorio actual):               *pwd*

directorio: *ls*

mostrar lo que hay dentro de un archivo:  *cat*

### Comando git

inicializar repositorio:       *git init*

ver la version del git:        *git --version*

configurar nombre:             *git config --global user.name "name"*

configurara correo:            *git config --global user.email "email"*

permite agregar archivos, archivos que no estan siendo respaldados:                   *git add*

como esta el estado en el background:                                                 *git status*

autocompletado:                 *tab*

 para subir todos los archivos:  *git add .*

 guardar cambios: *git commit*

 cear archivo: *touch*

 crear un archivo y escribir dentro de el: *echo "hola" > file.txt*

para abrir un archivo pero no en la terminal: *code .gitignore*

para crear archivo con su nombre: *touch name.txt*
unificar una rama: *git merge*
craer
 una rama: *git branch*
# Clase 4

*Fecha: 13/11/2023*


# Clase 5
 *Fecha: 147/11/2023*

- parametro: sirve para caracterizar al metodo, le da las particularidades para que ejecute 
- todos los bucles siempre tienen un condicional definido 
- ambito o tambien conocido como modificador de acceso: 
¿Que es? 
Tiene tres posibilidades que son: public (para todos, todos lo pueden ver, tiene acceso publico, en general las clases seran publicas)
                                 protected (solo "amigos")
                                 private   (solo "yo")


---------
# Clase 6
*16/11/2023*
*crear por medio del constructor 
*el constructor, caracteristicas:
-es un "metodo" publico, no puedo ser privado porque alguien tiene que llamarlo. 
-debe ser unico y tener el mismo nombre de la clase
-sino se lo coloca se autodefine
-se auto-ejecuta con "new" y una unica vez 
-cada vez que se coloca "new" se crea un espacio en memoria para almacenar este objeto 

(aquel que construye el objeto)
instancia= {crear -> utilizar un constructor - new(luego llamarlo, new lo llama)}

## objetos

- el computador lee la sentencia new, separa un espacio de memoria RAM para que pueda estar este objeto. Una vez en la RAM se necesita "algo" para poder ingresar y darle nombres

- recolector de basura esta encargado de limpiar la ram 



# Clase 9

formato base: string, double

- propiedades o atributos: son caracteristicas representativas de la clase.

los tipos de datos primitivos son para variables. Se los puede invocar o separar espacio de memoria directamente en la ram

## Cast

- La maquina realiza procesos de conversion 
- Para realizar transformacion
- Proceso de conversion

**Cast implicito** 

- Cuando hace la trasformacion de forma automatica
- El lenguaje asume la transformacion
long l = 10L;
float f = 10.0000f;
double d = 10.0000d;

**Cast explicito**

-Lenguaje necesita que haga un casting (un por favor puedes convertir a float este entero)

ll = (long)i;
dbl = (double)ff;
ff = (float)i;

**Tipos de datos de referencia**

String cadNum = "123a";
Long ll = 21L;
Integer i = 23;  //es un dato mas seguro que el int
Double dbl = 23.00;
Float flt = 23.0F; 
Character ch = 'A';
Boolean b = true;

- pasa usar datos por referencia se ocupa una libreria.

**Proceso de conversion**

//convert. 
i = Integer.parseInt(cadNum);

- forza la conversion.

ff = Float.parseInt(cadNum);

cadNum = I.tostring();
cadNum = F.tostring();

**Tipo de datos objeto**

- todas clases a usar son de datos tipo objeto

Persona persona = new Persona("Juan", 23);
Mujer m = new Mujer();


## String

- Cadena de caracteres que Java lo puede manejar de forma dinamica 

*Proceso de refactorizacion:* es reorganizar el codigo 

## Clase

**Static**

- Significa que no es dinamica, que solo esta en un bloque de memoria. 

- Genera un solo bloque de memoria.

- Sirve para las variables.
    ej:
    public static tipo_dato;
    public static Mujer oMujer;
    public static int PI = 3,14;

- Se los necesita porque a veces se requiere un valor unico.

- Por ejemplo PI, es un valor universal (una constante) y para no desperdiciar memoria al tener que crearse muchas veces, se lo crea como estatico para que todos puedan acceder a el, sin necesidad de acceder a mas espacios de memoria.

- Cuando se crean staticos, estos pueden ser:

- Estaticos de lectura: uso del *final*

public static final float PI = 3,14;

- Estaticos de lectura y escritura

public static Mujer oMujer;

- <rsc>
![Alt text](image.png)
