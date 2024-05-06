import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;

        String nombre = "Matrix";
        String sinopsis = """
                la mejor pelicula de ciencia ficción
                """;
        double mediaEvaluacionUsuario = 0;
        System.out.println("Pelicula: " + nombre);
        System.out.println("Año: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);


        double  mediaEvaluacion = (4.5 * 4.8 * 3 )/ 3;
        System.out.println("Media de la evaluación de Matriz: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en l momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matriz calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}