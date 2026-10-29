
/*
 * -----------------------------------------
 * Nome: Daniel Nogueira Lopes
 * RA: 0027826
 * Atividade 2 - Correção de uma nota
 * -----------------------------------------
 */

public class Atividade2 {

    public static void main(String[] args) {

        //Processamento
        double[] notas = {7.0, 8.5, 6.0, 9.0};

        //Resultados
        System.out.println("Nota original do terceiro estudante: " + notas[2]);

        notas[2] = 8.0;

        System.out.println("Nota atualizada do terceiro estudante: " + notas[2]);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Última nota: " + notas[3]);
    }
}

