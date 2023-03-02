package br.com.treinaweb.consultorio.app;

import br.com.treinaweb.consultorio.classes.Dentista;
import br.com.treinaweb.consultorio.classes.Paciente;

public class Programa {

	public static void main(String[] args) {
		Dentista dentista = new Dentista("Jose", "Carlos", "Protetico", "2589999-9", 1);
		
		System.out.println("\n\n-> Informaçôes do Medico <-\n");
		System.out.println(
		"Nome: " + dentista.getNome()+ " " + dentista.getSobrenome() + "\n" +
		"Especialidade: " + dentista.getEspecialidade() + "\n" +
		"Inscrição: " + dentista.getInscricaoCRO()
		);
	
	
		if (dentista.estaAtivo()) {
			System.out.println("CRO: Ativo");
		} else {
		System.out.println("CRO: Não Ativo");
		}
		
		dentista.atenderPaciente();
		dentista.marcarConsulta();
		dentista.remarcarConsulta();
		dentista.cancelarConsulta();
		dentista.viajarCongresso();
		
		
		
		Paciente paciente = new Paciente(1, "Andre Mattos", 45, "Masculino", "(11)99999-9999");
		System.out.println("\n\n-> Informaçôes do Paciente <-");
		System.out.println(
		"\nCódigo: " + paciente.getCodigo() + "\n" + 
		"Nome: " + paciente.getNomesobrenome() + "\n"+
		"Idade: " + paciente.getIdade() + "\n"+
		"Sexo: " + paciente.getSexo() + "\n" +
		"Telefone: " + paciente.getTelefone());	
	
		
		paciente.marcarConsulta();
		paciente.remarcarConsulta();
		paciente.cancelarConsulta();
		paciente.consultadoConsulta();
	}
}




