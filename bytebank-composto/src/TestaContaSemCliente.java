
public class TestaContaSemCliente { 
    public static void main(String[] args) { 
        Conta contaDoCliente = new Conta();
        System.out.println(contaDoCliente.pegaSaldo());

        contaDoCliente.titular = new Cliente();
        System.out.println(contaDoCliente.titular);

        contaDoCliente.titular.nome = "Marcela";
        System.out.println(contaDoCliente.titular.nome); 
    }
}
