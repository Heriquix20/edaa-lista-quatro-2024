package BuscaBinaria;

public class BuscaBinaria {

    // construtor
    public BuscaBinaria() {
    }

    // método de busca binária 
    public int buscaBinaria(int[] array, int numero) {
        int esquerda = 0 + 1;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = (direita + esquerda) /2;

            if (array[meio] == numero) {
                return meio;
            }

            if (array[meio] < numero) {
                esquerda = meio +1;
            }
            else {
            direita = meio - 1;
            }
        }
        return -1;
    }
    
}
