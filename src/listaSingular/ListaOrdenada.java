package listaSingular;

public class ListaOrdenada extends Lista
{
	/* Exercício 2: ao criar outro construtor, o construtor vazio deixa de ser
	 * gerado automaticamente, então ele precisa ser declarado. */
	public ListaOrdenada()
	{
		super();
	}

	/* Exercício 2: cria uma ListaOrdenada com os elementos de "lista".
	 * Complexidade: O(n²). Cada um dos n elementos é inserido com o insere
	 * ordenado, que percorre a lista até achar a posição certa: O(n) por
	 * inserção. A lista original não é alterada.
	 * Percorre usando o tamanho para funcionar também com uma ListaCircular. */
	public ListaOrdenada(Lista lista)
	{
		super();

		Elo p;
		int i;

		for(p = lista.prim, i = 0; i < lista.tam; p = p.prox, i++)
			this.insere(p.dado);
	}

	/* Insere elemento na lista na posição adequada, mantendo-a ordenada. */
	public void insere(int novo)
	{
		Elo p, q;
		Elo ant = null;
		
		q = new Elo(novo);
		
		for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;

		q.prox = p;
		tam++; /* Exercício 1 */
	}

	/* Remove da lista o primeiro elemento com valor igual a “elem". Ret. true se removeu. */
	public boolean remove(int elem)
	{
		Elo p;
		Elo ant = null; /* referência para anterior */
		
		for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
			ant = p;
		
		/* Se p é null ou p.dado != elem, então não encontrou elemento. */
		if ((p == null) || (p.dado != elem))
			return false;
		
		if (p == prim)
			prim = prim.prox; /* Remove elemento do início. */
		else
			ant.prox = p.prox;  /* Remove elemento do meio. */
		
		/* Remove a última referência para o elo a ser removido. Dessa forma,
		 * o Garbage Collector irá liberar essa memória. */
		p = null;
		tam--; /* Exercício 1 */

		return true;
	}

	/* Método para intersecao de conjuntos. Calcula intersecao do conjunto com cj2 e retorna novo conjunto com a intersecao. 
	 * Usa fato de conjuntos estarem ordenados e percorre as listas em paralelo. */
	public int calculaElementosComuns(ListaOrdenada lista2)
	{
		Elo p1 = prim, p2 = lista2.prim;
		int total = 0;

		while ( (p1 != null) && (p2 != null) )
		{
			if (p1.dado < p2.dado)
			{
				p1 = p1.prox;
			}
			else if(p2.dado < p1.dado)
			{
				p2 = p2.prox;
			}
			else
			{
				total++;
				
				p1 = p1.prox;
				p2 = p2.prox;
			}
		}

		return total;
	}
}