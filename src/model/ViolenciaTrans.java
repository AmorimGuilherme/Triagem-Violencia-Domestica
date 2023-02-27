package model;

public class ViolenciaTrans extends ViolenciaDomestica {

	@Override
	public void emitirGuia() {
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("--------AGENDAMENTO PARA GRUPO DE APOIO À MULHERES TRANS-----------\n");
		System.out.println("Data: ");
		System.out.println("Hora: ");
		System.out.println("Local: ");
		System.out.println("Documentos Necessários (RG, CPF e COMPROVANTE DE ENDEREÇO)");
		System.out.println("\n----------------------------------------------------------------\n");
	}

}
