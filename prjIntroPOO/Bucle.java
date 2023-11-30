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
        //Datos primitivos 
        char letra = 'a';
        letra=54; //al asignar un numero, considera que se le esta asginando un valor de la tabla asci
        short edad= 32;
        int num = 321;
        long numeroLong = 98786;
        long l = 10L;  //L esta separando un valor "grande" de memoria
        float peso= 1.7f; //letras al final para manejar tipos de datos
        double altura= 1.8d;
        boolean esMayorDeEdad = (i==2);
        boolean esMayorDeEdad = 0;

        num = (float) precio;
        
        //datos objeto
        String nombre="122544";
        Integer numero = 45;
        Float float1 = 321f;
        /*
         * en capacidad de almacenamiento, los datos objeto no tienen ninguna diferencia con los datos primitivos
         */
        nombre=float1.toString();
        nombre=numero.toString();
        nomre.charAt(1);

    }

    /*
     * for( ; ; ) 
     * ciclo que repite infinitamente
     */
}