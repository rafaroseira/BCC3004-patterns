package singleton;

public class ConexaoBD {
    private static ConexaoBD conexao;

	private ConexaoBD() {
	}

	public static ConexaoBD getInstance() {
		if (conexao == null)
			conexao = new ConexaoBD();

		return conexao;
	}

    /* Exemplo ilustrativo:
     * ConexaoBD conexao1 = ConexaoBD.getInstance();
     * ConexaoBD conexao2 = ConexaoBD.getInstance();
     * 
     * Ao criar o segundo objeto do tipo ConexaoBD, conexao2 receberá a conexão que foi aberta por conexao1
     * Dessa forma, não há a necessidade que conexao2 crie uma nova conexão porque ela já foi criada por conexao1
     */
    
}
