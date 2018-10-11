
public class Main {

	public static void main(String[] args) {
		Cachorro c = new Cachorro ("Susy", "Pinsher");
		Gato g = new Gato ("Sapato", "branco");
		
		System.out.println(c.getNome());
		c.setNome("Hanna");
		System.out.println(c.getNome());
	}

}