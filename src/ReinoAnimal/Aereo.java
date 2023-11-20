package ReinoAnimal;

/**
 * Classe responsavel por mostrar informações de animais aereos.
 *@author 20201064010019
 */
public class Aereo extends Animal{
		private double altitude;
		
		/**
		 * Método que diz se o animal esta comendo.
		 */
		public void comer() {
			System.out.println("O animal aéreo está comendo...");
		}
		
		/**
		 * Método que diz se o animal esta voando.
		 */
		public void voar() {
			System.out.println("O animal está voando...");
		}
		
		/**
		 * Método que mostra a espécie, o sexo, a data e altitude que o animal voa.
		 */
		public void perfil() {
			System.out.println("Espécie: " + getEspecie() + " | Sexo: " + getSexo() + " | Data: " + getData() + " | Altitude em que vooa: " + this.altitude);
		}

		public double getAltitude() {
			return altitude;
		}

		public void setAltitude(double altitude) {
			this.altitude = altitude;
		}
		
		
	}


