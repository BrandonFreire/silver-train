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

        boolean b = str.equals("GFG");
        System.out.println("equalsIgnoreCase(): La cadena es igual a \"GFG\": " +b);

        str.concat(".abc");
        str.concat(".123");
        str.concat(".*---+");
        System.out.println("concat(): La concatenación es: " + str);

        

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
        String[] strSplit = str.split(".");    // gfg abc 123 *--+ abc
        //for (int i = 0; i<strSplit.length; i++)
        System.out.println(" str.split(\".\"): dividir la cadena segun el punto: " +strSplit);
        for (String subS : strSplit) {                // acaba de crear 5 segmentos del array
            System.out.print(subS+ " ");              // for "inteligente", tiene tres puntos automaticos
        }
        
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
        name1 = name1.concat("Hol");
    }
}
