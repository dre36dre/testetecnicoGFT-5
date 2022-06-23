package questao_1;

public class ContaCorrente  extends Conta implements Imposto{
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
	}
	
	
	@Override
public double  rendimento() {
return  this.getSaldo() * 0.03;
	}
	
	@Override
	public void calculaImposto() {
		double totla=rendimento() * 0.25;
	}

}
