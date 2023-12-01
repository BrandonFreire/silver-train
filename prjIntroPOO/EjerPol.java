import java.util.Scanner;

public class EjerPol {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero de posiciones: ");
        Scanner sc = new Scanner(System.in);
        int nPosiciones = sc.nextInt();
        Serie1Char(nPosiciones);
        Serei2Char(nPosiciones);
    }

    public static void Serie1Char(int posiciones) {
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

    public static void Serei2Char(int posiciones){
        /** S2:  + + ++ +++ +++++ ++++++++ +++++++++++++ ...
         *       1+1 2  2+1 3+2   5+3       8+5
         * @autor Ismael Freire
         * @version 1.0
         */
        int variable=1;
        int anterior=0;
        int auxiliar;
        for(int i=0 ; i < posiciones; i++){ 
            /*for(int j =1; j <=variable ; j++){
                System.out.print("+" + " ");
            }*/
            String s = "+".repeat(variable);
            System.out.print(s + " ");
            auxiliar = variable;
            variable += anterior;
            anterior = auxiliar;
        }
    }
}
