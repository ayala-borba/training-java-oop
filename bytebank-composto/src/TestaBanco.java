
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Fulano de Tal";
		cliente.cpf = "222.222.222-22";
		cliente.profissao = "programador";
		
        Conta contaDoCliente = new Conta(); 
        contaDoCliente.deposita(100);

        contaDoCliente.titular = cliente; 
        System.out.println(contaDoCliente.titular.nome);
        System.out.println(contaDoCliente.titular);
	}
}
