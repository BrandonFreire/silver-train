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
        //son mas rapidos que los tipos de datos de referencia 
        byte bin =0; //almacena 1 y 0
        boolean ban = true; // almacena true y flase
        char c = 'c'; // almacena cualquier caracter
        c = 54 ; // se le asigna un valor entero, tomara el valor ascii

        // Cast implicito: proceso de conversion para almacenar numeros mas grandes y asignar espacion mas grandes
        short edad = 37;
        int i = 10;
        // al asignarle una letra, se le dice al compilador que separe un gran espacio o poco espacio de memoria 
        long ll = 10L; // L indica que sera un enterp largo. Indica que separe un valor para almacenarlo
        float f = 10.00000f; //
        double d = 10.000d;
        /**
         * EJ:
         * i = 5;
         * la division: ll = i/2;
         *              ll = 2;
         * ocupa automaticamente solo los enteros    
         */
        
    
        /**      Tipos de dato de referencia = propiedades
         * Objetos de referencia
         * Funcionan de la misma manera que los datos primitivos
         * Al usar estos tipos de datos por referencia, se debe ocupar una paqueteria que lo acompañe 
         * Brinda mayor opciones a diferencia de los datos primitivos 
         */ 
        String cadNum = "123";
        Long L = 21L;
        Integer I = 23;
        Double dbl = 23.000;
        Float F = 24.4f;
        Boolean b = true;
        Character ch = 'c';
        String[] arr = {"uno", "dos", "tres"};

            //Cast explicito
        /**
         * es un "por favor convierte..."
         * proceso de conversion se llama cast
         */
        ll = (long)i;
        dbl = (double)F;
        F = (float)i;
        
        /** Conversion
         * 
         */
        i = Integer.parseInt(cadNum);
        F = Float.parseFloat(cadNum);
        //Conversion desde el mismo tipo de dato
        cadNum = I.toString();
        cadNum = F.toString();
        /**
         * para crear un objeto se usa la palabra new        
         * ej
         * Mujer mujer = new Mujer();
         */
         
    }
}