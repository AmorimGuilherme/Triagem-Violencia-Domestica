package model;

import java.util.ArrayList;
import java.util.Random;

public class ViolenciaPatrimonial extends ViolenciaDomestica {
	
	//Array de locais
		private static ArrayList<String> locais = new ArrayList<String>() {
	        {
	            add("Avenida Tiradentes, 345");
	            add("Rua Monte Carlos, 67");
	            add("Alameda Mercadantes, 567");
	            add("Rua Fortaleza, 101");
	            add("Rua Topázio, 11");
	        }
	    };
	    
	  //Array de datas
	    private static ArrayList<String> datas = new ArrayList<String>() {
	        {
	            add("15/03/2023");
	            add("09/03/2023");
	            add("07/03/2023");
	            add("22/03/2023");
	            add("11/03/2023");
	        }
	    };
	    
	  //Array de horas
	    private static ArrayList<String> horas = new ArrayList<String>() {
	        {
	            add("13h30");
	            add("19h00");
	            add("15h45");
	            add("11h00");
	            add("16h15");
	        }
	    };

	@Override
	public void emitirGuia() {
		
Random rand = new Random(); //Cria um objeto para gerar valores aleatórios
		
		//Seleciona um local aleatório do array
		int indiceLocal = rand.nextInt(locais.size());
        String local = locais.get(indiceLocal);
        
        //Seleciona um local aleatório do array
        int indiceHora = rand.nextInt(horas.size());
        String hora = horas.get(indiceHora);
        
        //Seleciona um local aleatório do array
        int indiceData = rand.nextInt(datas.size()); 
        String data = datas.get(indiceData);
		
		super.emitirGuia();
		System.out.println("----------AGENDAMENTO CIVÍL NA DEFENSORIA PÚBLICA-----------");
		System.out.println("|Data: "+data);
		System.out.println("|Hora: "+hora);
		System.out.println("|Local: "+local);
		System.out.println("|Documentos Necessários (RG, CPF e COMPROVANTE DE ENDEREÇO)");
		System.out.println("------------------------------------------------------------\n");
	}

}
