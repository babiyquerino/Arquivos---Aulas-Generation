package exercicios;

public class exerc1 {
        private String nome;
		private String cpf;
		private String genero;
		private String email;
		private String telefone;
		private int total_comprado=0;
		
		public void Cliente(String nome,String cpf,String genero,String email,String telefone)
		{
			this.nome = nome;
			this.cpf = cpf;
			this.genero = genero;
			this.email = email;
			this.telefone = telefone;
			
		}
		
		public void comprarProduto()
		{
			this.total_comprado++;
		}
		
		public void devolverProduto()
		{
			if(total_comprado>0)
			{
				this.total_comprado--;
			}
		}
		
		public void printInfo()
		{
			System.out.println("Cliente \nNome: "+nome+"\nCPF: "+cpf+"\nGenero: "+genero+"\nEmail: "+email+
					"\nTelefone: "+telefone+"\nTotal de produtos comprados: "+total_comprado);
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public int getTotal_comprado() {
			return total_comprado;
		}

		public void setTotal_comprado(int total_comprado) {
			this.total_comprado = total_comprado;
		}
		
		
	}




