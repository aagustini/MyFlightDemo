package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	// 
	// nao usar for, o mais adequado é trabalhar com foreach
	//
	public CiaAerea buscarPorCodigo(String cod) {
		for (CiaAerea cia : empresas) {
			if (cia.getCodigo().equals(cod))
				return cia;
		}
		return null;
	}

}
