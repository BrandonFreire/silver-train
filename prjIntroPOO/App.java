public class App {
    public static void main(String[] args) throws Exception {
       //creamos un objeto de la clase llamda "oMujer1"
        int a;
        Mujer oMujer1; //Esto se refiere a declaración, no quiere decir que ha creado el objeto
        oMujer1 = new Mujer(); //se usa la palabra new y se da el proceso de instanciación(es decirle que es al programa, en este caso es un objeto)
        
        System.out.println("Mujer 1: ");
        oMujer1.saludar();
        oMujer1.cantar();
        oMujer1.bailar();
        
        System.out.println("Mujer 2: ");
        Mujer oMujer2;
        oMujer2 = new Mujer();
        oMujer2.nombre="Maria";
        oMujer2.saludar();
        System.out.println("tu clave es: " + oMujer2.clave);
        oMujer2.clave = "123";
    }
    
}

