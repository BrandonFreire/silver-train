import java.util.Scanner;

public class Ejer {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de posiciones: ");
        Scanner sc = new Scanner(System.in);
        int nPosiciones = sc.nextInt();
        //serie1Char(nPosiciones);
        //serei2Char(nPosiciones);
        //serie7Char(nPosiciones);
        //----------------
        //Figuras: se debe pedir tamaño/niveles
        //figura9(nPosiciones);
        //figura12(nPosiciones);
        //figura18(nPosiciones);
        //cadena4();
        //cadena5();
    }

    public static void serie1Char(int posiciones) {
        // S1: + - + - + - + ...
        /**
         * @autor Ismael Freire
         * @version 1.0
         */
        char signo = '+';
        for (Integer i = 0; i < posiciones; i++) {
            System.out.print(signo + " ");
            if (signo=='+') {
                signo = '-';
            }else{
                signo = '+';
            }
        }   
        System.out.println();
    }

    public static void serei2Char(int posiciones){
        /** S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
         *       1+1 2  2+1 3+2   5+3       8+5
         * @autor Ismael Freire
         * @version 1.0
         */
        int variable=1;
        int anterior=0;
        int auxiliar;
        for(int i=0 ; i < posiciones; i++){ 
            String serieChar = "+".repeat(variable);
            System.out.print(serieChar + " ");
            auxiliar = variable;
            variable += anterior;
            anterior = auxiliar;
        }
        System.out.println();
    }

    /** S7:  aa   bbbb  cccccc  dddddddd    ...
     * @autor Ismael Freire
     * @version 1.0
     */
    public static void serie7Char(int posiciones){
        int contadorElementos=0;
        char letra = 'a';
        for(int i=2 ; contadorElementos<posiciones ; i+=2){
            //System.out.print(i);
            for(int j=0 ; j<i ; j++){
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            contadorElementos++;
        }
        System.out.println();
    }

    /** 
     * F9:
                            ___   
                        ___|   |___
                    ___|	   	   |___
                ___|		   		   |___
            ___|			   			   |___
     * @author Ismael Freire
     */
    public static void figura9 (int numFilas){
        int espaciosBlanco = 0;
        /*String matriz[][]= {{"___"},{"|"}};
        for(int i=0 ; espaciosBlanco<numFilas ; i++){
            //System.out.println("___");
            for(int j=0 ; j< (Math.pow(numFilas, 2)+1); j++){
                System.out.println(matriz[i][j]);
            }
            espaciosBlanco += 3;
        }*/
    }
    /**F10:
            _+_
                |_-_
                    |_+_
                        |_-_
                            |_+_
                                |
     * 
     */
    
    /**
    * 
    */


    public static void  figura12(int posiciones){
            /**F12:
            ...
            123456789
            12345678
            1234567
            123456
            12345
            1234
            123
            12
            1
     * 
     */
        int contador=posiciones;
        for(int i=0 ; i<=posiciones ; i++){
            for(int j=1 ; j<=contador ; j++){
                System.out.print(j);
            }
            System.out.println();
            contador--;
        }
    }
    
    /**F17:
            1				1
                0		0
                    1
                0		0
            1				1
            ....
     * 
     */

    
    public static void figura18(int filas){
        /**F18:
            2
            1   2
            1   3   2
            1   4   5   2
            1   5   9   7  2
            1   6   14  16  9  2
     * 
     */
        int[][] matriz = new int[filas][filas];
        // Llenar la matriz
        for (int i = 0; i < filas; i++) {
            matriz[i][0] = 1;
            matriz[i][i] = 2;

            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        // Imprimir la matriz 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }
    //----------------

    public static void cadena4(){
            /**C04)    Pedir una frase y una letra, eliminar la letra ingresada de la frase. 
            Ejemplo, frase: ballena azul  
                    letra : l
                    salida: ba  ena azu 
     * 
     */
        String cadena = new String();
        String letra = new String();
        System.out.println("Ingrese una frase");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la letra a eliminar:");
        letra = sc.nextLine().toLowerCase();
        String cadenaRem = cadena.replaceAll(letra, " ");
        System.out.println(cadenaRem);
    }

    
    
    public static void cadena5 (){
        /**C05)    Pedir una frase y presentarla inverida con las vocales en mayusculas. 
            Ejemplo, frase: ballena
                    salida: AnEllAb 
        * 
        */
        String cadena = new String();
        System.out.println("Ingrese una frase");
        Scanner sc = new Scanner(System.in);
        cadena = sc.nextLine().toLowerCase();
        char[] cadenachars = cadena.toCharArray();
        for (int i=0 ; i<cadenachars.length ; i++){
            if ((cadenachars[i] == 'a') || (cadenachars[i]=='e')|| (cadenachars[i]=='i') || (cadenachars[i]=='o') || (cadenachars[i]=='u')){
                cadenachars[i]= Character.toUpperCase(cadenachars[i]);
            }
        }
        String nuevaCadena = String.valueOf(cadenachars);
        StringBuilder reversaCadena = new StringBuilder(nuevaCadena);
        reversaCadena.reverse();;
        System.out.println(reversaCadena);
    }

    /**	C06)    Pedir una frase y presentarla inverida con las letras en mayusculas. 
            Ejemplo, frase: ballena
                    salida: aNeLLaB 
     * 
     */
    public static void cadena6(){
        String cadena = new String();
    }
}

