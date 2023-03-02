package br.com.treinaweb.consultorio.classes;

public class Dentista {
	
	private String nome;
	private String sobrenome;
	private String especialidade;
	private String inscricaoCRO;
	private int estado;
	
	
	
	public String getNome() 	{	
	return nome;	
	}		
	public void setNome(String nome) {	
	this.nome = nome;	
	}
	
	
	public String getSobrenome() 	{ 
	return sobrenome; 
	}	
	public void setSobrenome(String sobrenome) { 
	this.sobrenome = sobrenome; 
	}
	
	
	public String getEspecialidade() 	{	
	return especialidade;	
	}		
	public void setEspecialidade(String especialidade) {	
	this.especialidade = especialidade;	
	}
	
	
	public String getInscricaoCRO() 	{	
	return inscricaoCRO;	
	}
	public void setInscricaoCRO (String inscricaoCRO) {	
	this.inscricaoCRO = inscricaoCRO; 
	}
	
	
	public int getEstado()		{	
	return estado;	
	}	
	public void  setEstado(int estado)	{	
	this.estado = estado;	
	}
	
	
	public Dentista (String nome, 
			String sobrenome, 
			String especialidade, 
			String inscricaoCRO, 
			int estado ) 
	{
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.especialidade = especialidade;
		this.inscricaoCRO = inscricaoCRO;
		this.estado = estado;
	}
	
	
	public Boolean estaAtivo()	{	
	return estado == 1;	
	}	
	
	public void atenderPaciente(){
		System.out.println("O " + nome + " está atendendo o paciente!");
	}
	
	public void marcarConsulta(){
		System.out.println("Marcando consulta com paciente!");
	}
	
	public void remarcarConsulta(){
		System.out.println("Remarcando consulta com paciente!");
	}
	
	public void cancelarConsulta(){
		System.out.println("Cancelando consulta com paciente!");
	}
	
	public void viajarCongresso(){
		System.out.println("Indisponivel, pois está em um congresso!");
	}
}



