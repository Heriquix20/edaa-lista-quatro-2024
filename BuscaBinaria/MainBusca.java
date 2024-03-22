package BuscaBinaria;

public class MainBusca {
    public static void main(String[] args) {

        BuscaBinaria b = new BuscaBinaria();

        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64,
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
            75, 76, 77, 78, 79, 80, 81,
            82, 83, 84, 85, 86, 87, 88, 89,
            90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

        //EXERCICIO 8
        
        // Busca pelo número 99
        int chaveUm = 99, chaveDois = 81;
        int result = b.buscaBinaria(listaNumeros, chaveUm);
        if (result > -1) {
            System.out.println("\nO índice do número " + chaveUm + " é: " + result);
        } else {
            System.out.println("\nNão contém este número no array!!");
        }

        // Busca pelo número 81
        int resultDois = b.buscaBinaria(listaNumeros, chaveDois);
        if (resultDois > -1) {
            System.out.println("\nO índice do número " + chaveDois + " é: " + resultDois);
        } else {
            System.out.println("\nNão contém este número no array!!");
        }


    }
    
}
