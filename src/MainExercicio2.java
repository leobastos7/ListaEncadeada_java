import listaSingular.Lista;
import listaSingular.ListaCircular;
import listaSingular.ListaOrdenada;

public class MainExercicio2
{
	public static void main(String args[])
	{
		Lista lista = new Lista();
		ListaCircular circular = new ListaCircular();

		// teste: lista 1 8 3 5 -> lista ordenada 1 3 5 8
		lista.insere(5);
		lista.insere(3);
		lista.insere(8);
		lista.insere(1);

		System.out.println("Lista original:");
		lista.imprime();

		ListaOrdenada ordenada = new ListaOrdenada(lista);
		System.out.println("Lista ordenada criada a partir da lista:");
		ordenada.imprime();

		circular.insere(9);
		circular.insere(6);
		circular.insere(7);

		ListaOrdenada ordenada2 = new ListaOrdenada(circular);
		System.out.println("Lista ordenada criada a partir de uma lista circular (9 6 7):");
		ordenada2.imprime();

		ListaOrdenada vazia = new ListaOrdenada();
		vazia.insere(2);
		vazia.insere(1);
		System.out.println("Construtor vazio continua funcionando:");
		vazia.imprime();
	}
}
