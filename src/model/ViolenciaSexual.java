package model;

public class ViolenciaSexual extends ViolenciaDomestica {

	@Override
	public void emitirGuia() {
		super.emitirGuia();
		System.out.println("\n---------AGENDAMENTO PARA REALIZAÇÃO DE CORPO DE DELITO------\n");
		System.out.println("Data: ");
		System.out.println("Hora: ");
		System.out.println("Local: ");
		System.out.println("Documentos Necessários (RG, CPF e COMPROVANTE DE ENDEREÇO)");
		System.out.println("\n--------------------------------------------------------------\n");
	}

}
