package beans;

import java.util.Date;

public class AgendaRevisao {
	
	// atributo (propriedades)
	public String cliente;
	public String modelo;
	public String veiculo;
	public Date data;
	public Date hora;
	
	
	// Metodos (operacoes)
	public void agendar() {
		System.out.println("Vai executar o agendamento");
	}
	
	public void cancelarAgenda() {
		System.out.println("Cliente " + this.cliente + " foi cancelado");
	}

}
