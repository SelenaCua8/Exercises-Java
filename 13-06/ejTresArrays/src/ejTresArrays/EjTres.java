package ejTresArrays;

class EjTres {

    public static void main(String[] args) {
        final int NUM_CORREDORES = 10;
        double suma = 0, min = 9999, max = -1, min1 = 9999, prom;
        double[] t = new double[NUM_CORREDORES];
        int gana = 0, ult = 0, seg = 0;

        // Generar tiempos aleatorios y calcular suma, ganador, último
        for (int i = 0; i < t.length; i++) {
            t[i] = Math.random() * 25; // tiempo aleatorio entre 0 y 25
            System.out.println("Tiempo corredor " + (i + 1) + ": " + t[i]);

            suma += t[i];

            if (t[i] < min) {
                min = t[i];
                gana = i + 1;
            }

            if (t[i] > max) {
                max = t[i];
                ult = i + 1;
            }
        }

        // Encontrar el segundo mejor tiempo (excluyendo al ganador)
        for (int i = 0; i < t.length; i++) {
            if (t[i] < min1 && t[i] != min) {
                min1 = t[i];
                seg = i + 1;
            }
        }

        prom = suma / t.length;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Ganador (1°): Corredor " + gana + " con tiempo: " + min);
        System.out.println("Segundo (2°): Corredor " + seg + " con tiempo: " + min1);
        System.out.println("Último (10°): Corredor " + ult + " con tiempo: " + max);
        System.out.println("Promedio de tiempos: " + prom);
    }
}
