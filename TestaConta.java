class TestaConta{

	public static void main(String[] args){
		Conta c = new Conta();
		c.setTitular("Ana");
		c.setSaldo(1000);
		c.setAgencia("abc");
		c.setNumero(123);
		c.setDataDeAbertura("01-02-2018");

		
		c.saca(150);
		
		Conta c1 = new Conta("Zé");
		Conta c2 = new Conta();
		
		c2.setTitular("Maria");
		
		System.out.println(c.getDados());
		System.out.println(c1.getDados());
		System.out.println(c2.getDados());
	}
}
