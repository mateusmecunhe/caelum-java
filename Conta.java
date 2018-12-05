class Conta{
	String titular;
	String agencia;
	int numero;
	double saldo;
	String dataDeAbertura;
	
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
	
	String recuperaDados(){
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		return dados;
	}

}	

