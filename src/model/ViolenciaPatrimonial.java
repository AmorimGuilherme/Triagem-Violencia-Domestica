package model;

public class ViolenciaPatrimonial extends ViolenciaDomestica {

	@Override
	public void emitirGuia() {
		super.emitirGuia();
		System.out.println("\n----------AGENDAMENTO CIVÍL NA DEFENSORIA PÚBLICA------------\n");
		System.out.println("Data: ");
		System.out.println("Hora: ");
		System.out.println("Local: ");
		System.out.println("Documentos Necessários (RG, CPF e COMPROVANTE DE ENDEREÇO)");
		System.out.println("\n--------------------------------------------------------------\n");
	}

}
