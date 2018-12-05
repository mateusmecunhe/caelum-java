class TestaConta{
	public static void main(String[] args){
		Conta c = new Conta();
		c.titular = "Ana";
		c.numero = 1234;
		c.agencia = "22-x";
		c.saldo = 2000;

		
		c.saca(150);
		
		System.out.println(c.recuperaDados());
		
		
		
		Conta c1 = new Conta();
		c1.titular = "Danilo";
		c1.saldo = 100;	
		
		Conta c2 = c1;
		
		if (c1==c2){
			System.out.println("iguais");
		} else{
			System.out.println("diferentes");
		}
		


	}
}
