package questao_1;

public class Conta {
  private String titular;
  private double  saldo;
  private String numero;

  public Conta() {
	super();
}

public Conta(String titular, double saldo, String numero) {
	super();
	this.titular = titular;
	this.saldo = saldo;
	this.numero = numero;
}

public String getTitular() {
	return titular;
}

public double getSaldo() {
	return saldo;
}

public String getNumero() {
	return numero;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public void setNumero(String numero) {
	this.numero = numero;
}


public void depositar(double valor){
	saldo+=valor;  
}
  
  public double rendimento() {
	  return this.saldo;
  }
  
  
  
  
  
}
