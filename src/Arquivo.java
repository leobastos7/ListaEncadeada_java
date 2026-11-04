
public class Arquivo extends ItemDiretorio
{
	public Arquivo(String nome)
	{
		super(nome);
	}

	/* Complexidade: O(1) */
	public String toString(int nivel)
	{
		return indentacao(nivel) + nome + "\n";
	}
}
