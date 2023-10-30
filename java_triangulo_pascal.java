 public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca el número de filas para el triángulo de Pascal
        System.out.print("Introduce el número de filas para el triángulo de Pascal: ");
        int numeroDeFilas = scanner.nextInt();
        
        // Iterar a través de cada fila del triángulo
        for (int i = 0; i < numeroDeFilas; i++) {
            // Empezar con el número 1 para cada fila
            int numero = 1;
            
            // Imprimir espacios para alinear los números y hacer que se vea como un triángulo
            for (int j = 0; j < numeroDeFilas - i; j++) {
                System.out.print(" ");
            }
            
            // Iterar a través de cada número en la fila
            for (int j = 0; j <= i; j++) {
                // Imprimir el número
                System.out.print(numero + " ");
                
                // Calcular el siguiente número en la fila usando la fórmula de la combinación
                // nCr = nCr-1 * (n - r + 1) / r
                numero = numero * (i - j) / (j + 1);
            }
            
            // Ir a la siguiente línea después de imprimir cada fila
            System.out.println();
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
