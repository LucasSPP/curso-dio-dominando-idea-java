package dio2;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gato Gato = new gato();
		carro Carro = new carro();
		System.out.println(Gato);
		System.out.println(Carro);

	}

}

class carro {
	private String nome;

	private String marca;

	@Override
	public String toString() {
		return "carro [nome=" + nome + ", marca=" + marca + "]";
	}

}
