
public class TestaValores { 
    public static void main(String[] args) { 
    	//Conta conta = new Conta();
    	Conta conta1 = new Conta(1337, 24226);
    	
        System.out.println(conta1.getAgencia());
        System.out.println(conta1.getNumero());

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);

        System.out.println(Conta.getTotal());
    }
} 