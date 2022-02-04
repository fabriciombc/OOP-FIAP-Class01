package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyy");
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.cliente = "Ana Maria Braga";
		agenda1.modelo = "Gol";
		agenda1.veiculo = "Gol 1000";
		agenda1.data = formatoData.parse("03/02/2022");
		
		System.out.println("Dados do Agendamento");
		System.out.println("Cliente: " + agenda1.cliente);
		System.out.println("Veiculo: " + agenda1.veiculo);
		System.out.println("data: " + agenda1.data);
		
		agenda1.agendar();
		
		agenda1.cancelarAgenda();
	}

}
