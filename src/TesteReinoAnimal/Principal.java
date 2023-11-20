package TesteReinoAnimal;

import ReinoAnimal.*;

public class Principal {

	public static void main(String[] args) {
		
		Aquatico ex1 = new Aquatico();
		
		ex1.setEspecie("Carcharias taurus");
		ex1.setSexo("Fêmea");
		ex1.setData("7");
		ex1.setTipoAgua("Água salgada");
		ex1.setEscama(false);
		
		Aquatico ex2 = new Aquatico();
		
		ex2.setEspecie("Pygocentrus nattereri");
		ex2.setSexo("Macho");
		ex2.setData("3");
		ex2.setTipoAgua("Água doce");
		ex2.setEscama(true);
		
		Terrestre ex3 = new Terrestre();
		
		ex3.setEspecie("Felis catus");
		ex3.setSexo("Fêmea");
		ex3.setData("2");
		ex3.setLocal("Ásia");
		ex3.setPelagem(true);
		
		Terrestre ex4 = new Terrestre();
		
		ex4.setEspecie("Hydrochoerus hydrochaeris");
		ex4.setSexo("Macho");
		ex4.setData("8");
		ex4.setLocal("América do Sul");
		ex4.setPelagem(true);
		
		Aereo ex5 = new Aereo();
		
		ex5.setEspecie("Coragyps atratus");
		ex5.setSexo("Macho");
		ex5.setData("3");
		ex5.setAltitude(54.5);
		
		Aereo ex6 = new Aereo();
		
		ex6.setEspecie("Amazona aestiva");
		ex6.setSexo("Fêmea");
		ex6.setData("10");
		ex6.setAltitude(37.9);
		
		System.out.println(Animal.getContador());
	}
	
	
}
