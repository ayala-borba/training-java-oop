
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

    public void saca(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
        }
    }
    
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
