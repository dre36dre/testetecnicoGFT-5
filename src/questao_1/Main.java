package questao_1;

public class Main {
	public static void main(String[] args) {
		ContaCorrente c1=new ContaCorrente();
		ContaPoupanca p1=new ContaPoupanca();
		p1.depositar(1000);	
		c1.depositar(100);
		c1.getSaldo();
	System.out.println("Rendimento  CC: "+	c1.rendimento());
	System.out.println("Rendimento: CP"+	p1.rendimento());
	
	}
}
