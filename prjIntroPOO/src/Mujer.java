public class Mujer {
    // atributos de clase mujer
    public String nombre;
    private int edad;
    private double altura;
    public String clave;

    // Metodos
    // Construnctor por defecto
    /*public Mujer() { // constructor
        nombre = "Ana";
        edad = 25; // Atributos
        altura = 1.60;
        clave = "firu.21";
        System.out.println("Mi nombre de construccion es: " + nombre);
    }*/

    /*public void saludar() {
        System.out.println("Hola, soy una mujer y me llamo " + nombre);
    }

    public void cantar() {
        System.out.println("Estoy cantando...");
    }

    public void bailar() {
        System.out.println("Bailo con pasos elegantes y lindos movimientos");
    }*/
    public void Arreglos(){
        char[] palabra = {'h','o','l','a'};
        //Matriz dinamica
        /**
         * en una fila puede terner mas columnas o mas elementos
         */
        int matriz[][]={
                        {1,2,3},
                        {1,2,3,4,5},
                        {1,2,3}
                        };
        for (int[] an : matriz) {
            for (int n : an) {
                System.out.print(" " + n);
            }
            System.out.println("");
        }
    }
}