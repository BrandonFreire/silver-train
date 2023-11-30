public class Bucle{
    private int nroTerminos=0;
    //propiedades
    public static void main(String[] args) throws Exception{
        cicloRepetitivo();
    }
    /**
     * Constructor 
     * @param nroTerminos
     */
    public Bucle(int nroTerminos){
        this.nroTerminos = nroTerminos;
    }

    public static void cicloRepetitivo(){
        //ciclo
        int nroTerminos=10;
        int incremento=0;
        for(; incremento<nroTerminos;incremento++){
            System.out.println("Hola; " +incremento); 
        }

        //ciclo
        while (incremento<nroTerminos) {
            System.out.println("While " + incremento++);
        }

        //ciclo
        do{
            System.out.println("do while " + ++incremento);
            System.out.println("");
        }while(incremento < nroTerminos);
    }

    public void tipoDato(){
        //Tipo de dato primitivos -> variables
        byte bin =0; //almacena 1 y 0
        boolean ban = true; // almacena true y flase
        char c = 'c'; // almacena cualquier caracter
        c = 54 ; // se le asigna un valor entero, tomara el valor ascii

        // Cast implicito: proceso de conversion para almacenar numeros mas grandes y asignar espacion mas grandes
        short edad = 37;
        int num = 10;
        // al asignarle una letra, se le dice al compilador que separe un gran espacio o poco espacio de memoria 
        long l = 10L; // L indica que sera un enterp largo. Indica que separe un valor para almacenarlo
        float f = 10.00000f; //
        double d = 10.000d;

        //Tipos de dato de referencia = propiedades
        String cadNum = "123a";
        Long ll = 21L;
        

    }
}