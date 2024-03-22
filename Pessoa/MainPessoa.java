import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args) {

        // instanciei o objeto
        Pessoas pessoa = new Pessoas();

        // pessoas
        Pessoas vinicius = new Pessoas("Vinícius", 41);
        Pessoas daniela = new Pessoas("Daniela", 44);
        Pessoas ana = new Pessoas("Ana", 18);
        Pessoas carla = new Pessoas("Carla", 20);
        Pessoas daniel = new Pessoas("Daniel Paiva", 31);
        Pessoas felipe = new Pessoas("Felipe", 24);
        Pessoas patricia = new Pessoas("Patricia", 23);
        Pessoas rafael = new Pessoas("Rafael", 20);
        Pessoas pedro = new Pessoas("Pedro", 22);
        Pessoas marcela = new Pessoas("Marcela", 24);
        Pessoas amanda = new Pessoas("Amanda", 100);

        // criei um arraylist de pessoas
        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();

        // adicionei todas as pessoas no arraylist
        listaDePessoas.add(vinicius); listaDePessoas.add(daniela); listaDePessoas.add(ana); listaDePessoas.add(carla);
        listaDePessoas.add(daniel); listaDePessoas.add(felipe); listaDePessoas.add(patricia); listaDePessoas.add(rafael);
        listaDePessoas.add(pedro); listaDePessoas.add(marcela); listaDePessoas.add(amanda);

        // EXERCICIO 6
        pessoa.buscarIdadeEspecifca(listaDePessoas, 100);

        //EXERCICIO 7
        pessoa.buscarIdade(listaDePessoas, 30);

        //EXERCICIO 8
        System.out.println("\n");
        pessoa.alterarIdade(listaDePessoas);
        for (Pessoas p: listaDePessoas) {
        System.out.println("Nome: " + p.getNome() + " -- Idade: " + p.getIdade());
        }

    }
    
}
