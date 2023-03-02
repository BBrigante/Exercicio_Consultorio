package br.com.treinaweb.consultorio.classes;

public class Paciente {
		
		private int codigo;
		private String nomeSobrenome;
		private int idade;
		private String sexo;
		private String telefone;
		
		
		public int getCodigo() {	
		return codigo;
		}
		public void setCodigo(int codigo) {		
		this.codigo = codigo;	
		}	
		
		
		public String getNomesobrenome() {
		return nomeSobrenome;
		}
		public void setNomesobrenome(String nomeSobrenome) {
			this.nomeSobrenome = nomeSobrenome;
		}
		
		
		public int getIdade() {
		return idade;
		}
		public void setIdade(int idade) {
		this.idade = idade;
		}
		
		
		public String getSexo() {
		return sexo;
		}
		public void setSexo (String sexo) {
		this.sexo = sexo;
		}
		
		
		public String getTelefone() {
		return telefone;
		}
		public void setTelefone (String telefone ) {
		this.telefone = telefone;
		}
		
		
		public Paciente (int codigo, 			
				String nomeSobrenome, 
				int idade, 
				String sexo, 
				String telefone ) 
		{
			
			this.codigo = codigo;
			this.nomeSobrenome = nomeSobrenome;
			this.idade = idade;
			this.sexo = sexo;
			this.telefone = telefone;
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
		public void consultadoConsulta(){
			System.out.println("Consultado uma consulta com o dentista!");
		}
		
}
