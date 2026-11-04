
/* Exercício 4: tudo que pode estar dentro de um diretório (arquivo ou outro diretório) */
public abstract class ItemDiretorio
{
	protected String nome;

	public ItemDiretorio(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	/* Cada tipo de item sabe se imprimir com a indentação do seu nível */
	public abstract String toString(int nivel);

	public ItemDiretorio busca(String nome)
	{
		if (this.nome.equals(nome))
			return this;

		return null;
	}

	protected String indentacao(int nivel)
	{
		String s = "";
		int i = 0;

		while (i < nivel)
		{
			s = s + "\t";
			i++;
		}

		return s;
	}

	public String toString()
	{
		return toString(0);
	}
}
