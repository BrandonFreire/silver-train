import java.util.Scanner;

public class EjerPol {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de posiciones: ");
        Scanner sc = new Scanner(System.in);
        int nPosiciones = sc.nextInt();
        serie1Char(nPosiciones);
        serei2Char(nPosiciones);
        serie7Char(nPosiciones);
        //----------------
        //Figuras: se debe pedir tamaño/niveles

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
    public static void Figura9 (){
        
    }
}
