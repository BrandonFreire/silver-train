public class SerieTriangular {
        public static void main(String[] args) {
            int filas = 6; // Puedes ajustar el número de filas según sea necesario
            int[][] matriz = new int[filas][filas];
    
            // Llenar la matriz
            for (int i = 0; i < filas; i++) {
                matriz[i][0] = 1;
                matriz[i][i] = 2;
    
                for (int j = 1; j < i; j++) {
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
            }
    
            // Imprimir la matriz en el formato deseado
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(matriz[i][j] + "   ");
                }
                System.out.println();
            }
        }
    }