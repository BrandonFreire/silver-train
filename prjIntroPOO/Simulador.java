import java.util.Scanner;

public class Simulador {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el carácter para la barra: ");
        char caracterBarra = scanner.next().charAt(0);

        System.out.print("Ingrese la longitud de la barra (máximo 20): ");
        int longitudBarra = scanner.nextInt();

        // Asegurarse de que la longitud esté en el rango de 0 a 20
        longitudBarra = Math.max(0, Math.min(20, longitudBarra));

        // Calcular el porcentaje de completitud
        int[] porcentajeCompletitud;
        for(int i=0 ; i<100 ; i++){
            porcentajeCompletitud[i];
            try {Thread.sleep(100);} 
            catch (InterruptedException ie) {}
        }
        //int porcentajeCompletitud = (int) (((double) longitudBarra / 20) * 100);


        // Imprimir la barra
        System.out.print("[");
        for (int i = 0; i < longitudBarra; i++) {
            System.out.print(caracterBarra);
            try {Thread.sleep(500);} 
            catch (InterruptedException ie) {}
        }
        for (int i = longitudBarra; i < 20; i++) {
            System.out.print(" ");
        }
        System.out.println("] " + porcentajeCompletitud + "%");

        scanner.close();
    }*/

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Ingrese el carácter para la barra: ");
            char caracterBarra = scanner.next().charAt(0);
    
            System.out.print("Ingrese la longitud máxima de la barra (máximo 20): ");
            int longitudMaxima = scanner.nextInt();
    
            // Asegurarse de que la longitud máxima esté en el rango de 1 a 20
            longitudMaxima = Math.max(1, Math.min(20, longitudMaxima));
    
            for (int longitudBarra = 1; longitudBarra <= longitudMaxima; longitudBarra++) {
                // Calcular el porcentaje de completitud
                int porcentajeCompletitud = (int) (((double) longitudBarra / longitudMaxima) * 100);
    
                // Imprimir la barra y el porcentaje en el mismo espacio
                System.out.print("[");
                for (int i = 0; i < longitudMaxima; i++) {
                    if (i < longitudBarra) {
                        System.out.print(caracterBarra);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("] " + porcentajeCompletitud + "%\r");
                System.out.flush();
    
                // Esperar un breve momento para que sea visible en la ejecución
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    
            scanner.close();
        }
    }

