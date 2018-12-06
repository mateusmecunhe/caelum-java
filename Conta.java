class Conta{
	private String titular;
	private String agencia;
	private int numero;
	private double saldo;
	private String dataDeAbertura;
	static private int contador = 1;
	private int id = contador;

	
	int setId(){
		contador++;
		return contador;
	}
	
	void setTitular(String titular){
		this.titular = titular;
	}
	
	void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	void setNumero(int numero){
		this.numero = numero;
	}
	
	void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	void setDataDeAbertura(String dataDeAbertura){
		this.dataDeAbertura = dataDeAbertura;
	}
	
	void saca (double valor){
		this.saldo -= valor;
	}
	
	void deposita (double valor){
		this.saldo += valor;
	}
	
	double calculaRendimento (){
		this.saldo = saldo*(1+0.10);
		return saldo;
	}
	
	String getDados(){
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nAgencia: " + this.agencia;
		dados += "\nNumero: " + this.numero;
		dados += "\nData de Abertura da conta: " + this.dataDeAbertura;
		dados += "\nID: " + this.id;
		
		return dados;
	}
	
	Conta(){
		setId();
	}
	
	Conta(String titular){
		this();
		this.titular = titular;
	}

}	

