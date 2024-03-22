import java.util.ArrayList;

public class Pessoas {

    private String nome;
    private int idade;

    // construtor vazio
    public Pessoas() {
    }

    // método para buscar uma idade específica
    public void buscarIdadeEspecifca(ArrayList<Pessoas> listaDePessoas, int idadeDesejada) {
       for (Pessoas p: listaDePessoas) {
        if (p.getIdade() == idadeDesejada) {
            System.out.println("\nA pessoa que tem " + idadeDesejada + " anos é a " + p.getNome());
        }
      }
    }

     // método para buscar uma idade superior a uma
     public void buscarIdade(ArrayList<Pessoas> listaDePessoas, int idadeDesejada) {
        System.out.println("\nAs pessoas que tem mais de " + idadeDesejada + " anos são:");
        for (Pessoas p: listaDePessoas) {
         if (p.getIdade() > idadeDesejada) {
             System.out.println(p.getNome());
         }
       }
     }

     // método para alterar a idade de todos
     public void alterarIdade(ArrayList<Pessoas> listaDePessoas) {
        for (Pessoas p : listaDePessoas) {
            p.setIdade(18);
        } 
     }

    // contrutor
    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
