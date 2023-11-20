package ReinoAnimal;

public class Terrestre extends Animal{
	
	private String local;
	private boolean pelagem;
	
	/**
	 * Método que diz se o animal esta comendo.
	 */
	public void comer() {
		System.out.println("O animal terrestre está comendo...");
	}
	
	/**
	 * Método que diz se o animal esta se movendo.
	 */
	public void mover() {
		System.out.println("O animal está se movendo...");
	}
	
	/**
	 * Método que mostra a espécie, o sexo e a data.
	 */
	public void perfil() {
		System.out.println("Espécie: " + getEspecie() + " | Sexo: " + getSexo() + " | Data: " + getData() + " "
				+ " | Local que o animal vive: " + this.local + " | Possui pelagem? " + this.pelagem);
	}
	

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public boolean isPelagem() {
		return pelagem;
	}

	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
	
	

}
