package listaSingular;

/* Exercício 3: lista ordenada genérica. Os elementos precisam ser comparáveis
 * (Comparable), como a String, para que a lista saiba a ordem entre eles. */
public class ListaOrdenadaGenerica<T extends Comparable<T>>
{
	/* Referência para primeiro elemento */
	protected Elo prim;
	protected int tam;

	protected class Elo
	{
		protected T dado;
		protected Elo prox;

		public Elo(T elem)
		{
			dado = elem;
			prox = null;
		}
	}

	public ListaOrdenadaGenerica()
	{
		prim = null;
		tam = 0;
	}

	/* Testa se a lista está vazia. */
	public boolean vazia()
	{
		return prim == null;
	}

	/* Insere elemento na lista na posição adequada, mantendo-a ordenada.
	 * Complexidade: O(n). No pior caso (elemento vai para o fim) percorre
	 * todos os n elos. Para manter n nomes em ordem alfabética, inserindo um
	 * a um, o custo total é 1 + 2 + ... + n = O(n²). */
	public void insere(T novo)
	{
		Elo p, q;
		Elo ant = null;

		q = new Elo(novo);

		for (p = prim; ((p != null) && (p.dado.compareTo(novo) < 0)); p = p.prox)
			ant = p;

		if (ant == null)
			prim = q;
		else
			ant.prox = q;

		q.prox = p;
		tam++;
	}

	/* Remove da lista o primeiro elemento igual a "elem". Ret. true se removeu.
	 * Complexidade: O(n). Pode parar antes do fim, pois a lista está ordenada. */
	public boolean remove(T elem)
	{
		Elo p;
		Elo ant = null;

		for(p = prim; ((p != null) && (p.dado.compareTo(elem) < 0)); p = p.prox)
			ant = p;

		if ((p == null) || (p.dado.compareTo(elem) != 0))
			return false;

		if (p == prim)
			prim = prim.prox;
		else
			ant.prox = p.prox;

		p = null;
		tam--;

		return true;
	}

	/* Complexidade: O(1) */
	public int tamanho()
	{
		return tam;
	}

	/* Imprime todos os elementos da lista. Complexidade: O(n) */
	public void imprime()
	{
		Elo p;

		System.out.println("Elementos da lista:");

		for(p = prim; p != null; p = p.prox)
		{
			System.out.print(p.dado + " ");
		}

		System.out.println();
	}
}
