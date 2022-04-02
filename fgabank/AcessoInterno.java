package fgabank;

public interface AcessoInterno {
	
	//os metodos n�o tem comportamento(corpo) so tem assinatura
	
	/**
	 * @param String usuario => pode-se informar um usuario valido
	 * @param String senha => pode-se informar uma senha com at� 255 caracteres alfanumericos
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	public boolean autenticarSistema(String usuario, String senha);


}
