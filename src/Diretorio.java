
public class Diretorio extends ItemDiretorio
{
	/* Um diretório é uma lista de arquivos e outros diretórios */
	private ListaGenerica<ItemDiretorio> conteudo;

	public Diretorio(String nome)
	{
		super(nome);
		conteudo = new ListaGenerica<ItemDiretorio>();
	}

	/* Complexidade: O(1), insere no fim da lista */
	public void adiciona(ItemDiretorio item)
	{
		conteudo.insere(item);
	}

	/* Imprime o nome e, um nível mais indentado, o conteúdo (recursivamente).
	 * Complexidade: O(N), onde N é o total de itens dentro do diretório,
	 * pois cada arquivo e cada subdiretório é visitado uma única vez. */
	public String toString(int nivel)
	{
		if (conteudo.vazia())
			return indentacao(nivel) + nome + "\n" + indentacao(nivel + 1) + "(Pasta Vazia)\n";

		return indentacao(nivel) + nome + "\n" + conteudo.toString(nivel + 1);
	}

	/* Procura um item com esse nome aqui ou em qualquer subdiretório.
	 * Complexidade: O(N) no pior caso (o item não existe ou é o último visitado). */
	public ItemDiretorio busca(String nome)
	{
		if (this.nome.equals(nome))
			return this;

		return conteudo.busca(nome);
	}
}
