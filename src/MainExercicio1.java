import listaSingular.Lista;
import listaSingular.ListaCircular;
import listaSingular.ListaOrdenada;

public class MainExercicio1
{
	public static void main(String args[])
	{
		Lista lista = new Lista();
		ListaOrdenada ordenada = new ListaOrdenada();
		ListaCircular circular = new ListaCircular();
		Lista separada;

		// teste: o tamanho() deve acompanhar todas as inserções e remoções
		lista.insere(5);
		lista.insere(3);
		lista.insere(8);
		lista.insere(1);
		System.out.println("Lista após inserir 4 elementos: tamanho = " + lista.tamanho());

		lista.remove(3);
		lista.remove(99);
		System.out.println("Lista após remover o 3 (e tentar remover o 99): tamanho = " + lista.tamanho());

		separada = lista.separa(8);
		System.out.println("Após separar no 8: lista = " + lista.tamanho() + ", separada = " + separada.tamanho());

		Lista.concatena(lista, separada);
		System.out.println("Após concatenar: lista = " + lista.tamanho() + ", separada = " + separada.tamanho());

		ordenada.insere(7);
		ordenada.insere(2);
		ordenada.insere(4);
		ordenada.remove(2);
		System.out.println("Lista ordenada (3 inserções, 1 remoção): tamanho = " + ordenada.tamanho());

		circular.insere(10);
		circular.insere(20);
		circular.insere(30);
		circular.remove(10);
		System.out.println("Lista circular (3 inserções, 1 remoção): tamanho = " + circular.tamanho());
	}
}
