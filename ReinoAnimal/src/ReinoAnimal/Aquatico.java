package ReinoAnimal;

public class Aquatico extends Animal{
	
	private String tipoAgua;
	private boolean escama;
	
	/**
	 * Método que diz se o animal esta comendo.
	 */
	public void comer() {
		System.out.println("O animal aquático está comendo...");
	}
	
	/**
	 * Método que mostra a espécie, o sexo e a data.
	 */
	public void perfil() {
		System.out.println("Espécie: " + getEspecie() + " | Sexo: " + getSexo() + " | Data: " + getData() + 
				" | Tipo de água que o animal vive: " + this.tipoAgua + " | Possui escamas? " + this.escama);
	}
	
	/**
	 * Método que mostra se o animal esta nadando.
	 */
	public void nadar() {
		System.out.println("O animal está nadando...");
	}
	

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscama() {
		return escama;
	}

	public void setEscama(boolean escama) {
		this.escama = escama;
	}
	
	

}
