//import java.lang.foreign.ValueLayout.OfInt;
//import java.util.jar.Attributes.Name;

public class CadenaUtilities {
    public static void main(String[] args) {
        // Declaraciones
        byte asci[] = {71,70,71,72,73,75};
        byte character[] = {'G', 'f', 'g'};
        String cad = new String(asci);
        System.out.println("Cadena original: " + cad);
        //Para escoger hasta que posicion de la cadena asci se quiere
        String cad2 = new String(asci,2,2);
        System.out.println("Cadena con posicion y longitud: " + cad2);
        //
        String cad3 = new String(character);
        System.out.println("cadena de caracteres: " + cad3);

        String str = new String(cad3);
        System.out.println("Cadena de cadena: " + str);

        System.out.println("-------------------------------");
        System.out.println("[+] operaciones string");
        int len = str.length();
        System.out.println("Longitud de la cadena: "+len);

        Character  c = str.charAt(1);
        String s = c.toString();
        System.out.println("chatAt(): El caracter en el indice 1 es: "+c);
        System.out.println("c.tostring(): El caracter en el indice 1 es: "+s);

        boolean b = str.equals("GFG"); //equals compara contenido
        boolean B = str.equalsIgnoreCase("GFG"); //compara contenido sin importar si son mayusculas o minusculas
        System.out.println("equalsIgnoreCase(): La cadena es igual a \"GFG\": " +b);

        str.concat(".abc");
        str.concat(".123");
        str.concat(".*---+");
        str.concat(".abc");
        System.out.println("concat(): La concatenación es: " + str);

        String str1 = new String("Hola");
        String str2 = new String("Mundo");
        String str3 = str1;

        if (str1 == str2) {  //valida referencia
            System.out.println(" --> str==str2, La referencia del objeto es la misma");
        }else{
            System.out.println(" --> str!=str2, Las referencias son diferentes");
        }

        if (str1==str3) { //valida referencia
            System.out.println(" --> str1==str2, La referencia del objeto es la misma");
        }else{
            System.out.println(" --> str1!=str2, Las referencias son diferentes");
        }

        //Referencias dan una puerta de entrada a las variables
        str3 = "puede hacer cambios";
        System.out.println("str1="+str3);

        //para validar el valor
        //la forma de hacerlo es a travez del objeto mismo
        if (str1.equals(str2)) {
            System.out.println("--> str1 equals str2, Los valores son los mismos");
        }

        //en teoria se puede ingresar a un espacio de memoria sin referencia
        //for(;;) new String(); //for infinito que puede llenar todos los espacios de memoria y afectar la memoria ram
        /************************************************************************** */
        String subStrInicia = str.substring(4); //toma la cadena desde el valor en esa posicion 
        System.out.println(subStrInicia);

        String subStr123 = str.substring(8, 11);
        System.out.println("substring(): Substring del indice 8 al 3: "+subStr123);

        String subStr1 = str.substring(4,str.length());
        System.out.println("substring(): substring desde indice 4 hasta el final: " +subStr1);

        String subStr2 = str.replace('a', 'A');
        System.out.println("replace(): Reemplazar los valores de A por mayuscula: "+subStr2);

        String subStr3 = str.toUpperCase();
        System.out.println("toUpperCase(): La conversion a mayusculas es: " +subStr3);

        String subStr4 = str.toLowerCase();
        System.out.println(" toLowerCase(): Convertir todos los caracteres a minusculas" +subStr4);

        //Para hacer divisiones 
        //split: division de cadenas
        //ayuda a la segmentacion de cadenas
        //crear subcadenas a partir de una cadena
        String[] strSplit = str.split(".");    // gfg abc 123 *--+ abc
        //for (int i = 0; i<strSplit.length; i++)
        System.out.println(" str.split(\".\"): dividir la cadena segun el punto: " +strSplit);
        for (String subS : strSplit) {                // acaba de crear 5 segmentos del array
            System.out.print(subS+ " ");              // for "inteligente", tiene tres puntos automaticos
        }                                              //empezara al inicio del array y terminara al final del mismo
        
        System.out.println("str = "+str);
        for (char c1 : str.toCharArray()) {             //toarray: {'G', 'f', 'g' '.', ...}
            System.out.println(c1);
        }

        System.out.println("---------------");

        for (char c2 : "abcd".toCharArray()) {
            System.out.println(c2);
        }

        int a=12;
        str = str + a;
        str = str.concat(String.valueOf(a)); //valueof: convertir
        System.out.println("str = "+str);

        //para sacar un valor en especial o un elemento de alguna pocision especial
        //para encontrar en que posicion se en encuentra algo
        int indice123 = str.indexOf("123");
        System.out.println("indexof(): Indice donde empieza \"123\": "+indice123);
        System.out.println("cadena a partide de 123 es "+str.substring(indice123, str.length()));
    
        if (str.contains("123")) {
            System.out.println("contain(x): La cadena contiene \"123\":"+true);
        }else{
            System.out.println("contain(x): La cadena no contiene \"123\"."+false);
        }

        /*TRIM: eliminar espacios en blanco */
        String nombre = "           pepe alimaña    ";
        nombre = nombre.trim();
        System.out.println("nombre trim() = "+nombre);
    }

    private static void getDemoString() {
        //Formas para representar un String
        String name1 = "Geeks";
        String s = new String("Welcom");
        System.out.println(name1);
         System.out.println(s);
        //Existen veces que el compilador hace unaoptimizacion de memoria y puede guardar el mismo valor para ambos variables en un mismo espacio de memoria
        String s1 = "Tat";
        String s2 = "Tat";
        //el newo separa los espacios de memoria, para que no vaya a generar problemas
        String s3 = new String("Tat");
        String s4 = new String("Tat");
       

        //se utiliza cuando no se quiere alterar informacion
        //son secuencias inmutables
        StringBuffer demoString = new StringBuffer("Geeks");

        StringBuilder demoString1 = new StringBuilder();
        demoString1.append("Geeks");
        demoString1.insert(0,"Welcome to ");
        System.out.println(demoString1);

        //ahorra memoria 
        demoString1.append("GFG");
        demoString1.append("123");
        demoString1.append("abc");
        System.out.println(demoString1);

        name1 = name1.concat("hOLA");
        name1 = name1.concat("Hola");
    }
}
