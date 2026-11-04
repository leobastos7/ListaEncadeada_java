import java.util.Scanner;
import listaSingular.ListaOrdenadaGenerica;

public class MainExercicio3
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		ListaOrdenadaGenerica<String> nomes = new ListaOrdenadaGenerica<String>();
		String nome;

		// teste: Maria, Pedro, Ana, Carlos, Beatriz -> Ana Beatriz Carlos Maria Pedro
		System.out.println("Entre com os nomes, um por linha (linha vazia para terminar): ");
		nome = scanner.nextLine();

		while (!nome.equals(""))
		{
			nomes.insere(nome);
			nome = scanner.nextLine();
		}

		System.out.println("Nomes em ordem alfabética:");
		nomes.imprime();

		scanner.close();
	}
}
