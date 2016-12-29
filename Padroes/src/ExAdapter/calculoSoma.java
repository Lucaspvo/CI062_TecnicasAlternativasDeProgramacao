package ExAdapter;

public class calculoSoma {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(new Somador());
		
		cliente.executar();
		
	}

}
