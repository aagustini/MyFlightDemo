package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	/***
	 * 
	 * @param cod - código da compania para pesquisa 
	 * @return Objeto compania que contém o codigo <cod> retorna null caso não exista.
	 */
	public CiaAerea buscarPorCodigo(String cod) {
		for (int pos=0; pos<empresas.size(); pos++) {
			CiaAerea cia = empresas.get(pos);
			if (cia.getCodigo().equals(cod))
				return cia;
		}
		return null;
	}

}
