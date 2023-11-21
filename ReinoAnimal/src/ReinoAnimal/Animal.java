package ReinoAnimal;

/**
 * Classe responsavel por representar um Animal .
 *@author 20201064010019
 */

public class Animal {
	
	private String especie;
	private String data;
	private String sexo;
	private static int contador;

	public Animal() {
		setContador();
	}

	/**
	 * Método que mostra a espécie, o sexo e a data..
	 */
	public void perfil() {
		System.out.println("Espécie: " + this.especie + " | Sexo: " + this.sexo + " | Data: " + this.data);
	}
	
	/**
	 * Método que diz se o animal esta comendo.
	 */
	public void comer() {
		System.out.println("O animal está comendo...");
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static int getContador() {
		return contador;
	}
	private static void setContador() {
		Animal.contador = contador + 1;
	}
	
	
}
