import java.util.Scanner;

public class MainExercicio4
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		ItemDiretorio diretorio;
		String nome;

		Diretorio raiz = new Diretorio("Meu Computador");

		Diretorio jogos = new Diretorio("Jogos");
		jogos.adiciona(new Arquivo("Campo Minado"));
		jogos.adiciona(new Arquivo("Paciência"));
		jogos.adiciona(new Arquivo("World of Warcraft"));

		Diretorio aces = new Diretorio("ACEs");
		aces.adiciona(new Arquivo("ACE1"));
		aces.adiciona(new Arquivo("ACE2"));
		aces.adiciona(new Arquivo("ACE3"));

		Diretorio faculdade = new Diretorio("Faculdade");
		faculdade.adiciona(new Arquivo("EDD1"));
		faculdade.adiciona(new Arquivo("EDD2"));
		faculdade.adiciona(new Arquivo("AA"));
		faculdade.adiciona(aces);
		faculdade.adiciona(new Arquivo("TPD"));

		Diretorio marvel = new Diretorio("Marvel");
		marvel.adiciona(new Arquivo("Vingadores"));
		marvel.adiciona(new Arquivo("Homem-Aranha"));

		Diretorio dc = new Diretorio("DC");
		dc.adiciona(new Arquivo("Superman"));

		Diretorio superHeroicos = new Diretorio("Super-heróicos");
		superHeroicos.adiciona(marvel);
		superHeroicos.adiciona(dc);

		Diretorio drama = new Diretorio("Drama");
		drama.adiciona(new Arquivo("Brilho Eterno de Uma Mente Sem Lembranças"));

		Diretorio filmes = new Diretorio("Filmes");
		filmes.adiciona(superHeroicos);
		filmes.adiciona(drama);
		filmes.adiciona(new Diretorio("Comédias Românticas"));

		raiz.adiciona(jogos);
		raiz.adiciona(faculdade);
		raiz.adiciona(filmes);

		// testes: Meu Computador, Faculdade, Filmes, Comédias Românticas
		System.out.print("Entre com o nome da pasta: ");
		nome = scanner.nextLine();

		diretorio = raiz.busca(nome);

		if (diretorio == null)
			diretorio = new Arquivo("Pasta \"" + nome + "\" não encontrada.");

		System.out.println(diretorio);

		scanner.close();
	}
}
