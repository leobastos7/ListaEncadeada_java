
/* Exercício 4: versão da lista encadeada com generics, para guardar itens de diretório */
public class ListaGenerica<T extends ItemDiretorio>
{
	/* Referência para primeiro elemento */
	protected Elo prim;
	/* Referência para o último elemento, para inserir no fim em O(1) */
	protected Elo ult;

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

	public ListaGenerica()
	{
		prim = null;
		ult = null;
	}

	/* Testa se a lista está vazia. */
	public boolean vazia()
	{
		return prim == null;
	}

	/* Insere elemento no fim da lista, para manter a ordem em que os itens foram adicionados.
	 * Complexidade: O(1), graças à referência "ult". */
	public void insere(T novo)
	{
		Elo p = new Elo(novo);

		if (prim == null)
			prim = p;
		else
			ult.prox = p;

		ult = p;
	}

	/* Complexidade: O(n) */
	public String toString(int nivel)
	{
		Elo p;
		String s = "";

		for(p = prim; p != null; p = p.prox)
			s = s + p.dado.toString(nivel);

		return s;
	}

	/* Complexidade: O(n) */
	public ItemDiretorio busca(String nome)
	{
		Elo p;
		ItemDiretorio item;

		for(p = prim; p != null; p = p.prox)
		{
			item = p.dado.busca(nome);

			if (item != null)
				return item;
		}

		return null;
	}
}
