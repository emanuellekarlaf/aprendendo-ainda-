
public class Cachorro {

	// declara se publcio, privado, pretect
	private String nome;
	private String raca;

	// estou fazendo um construtor
	public Cachorro(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return this.raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	// método para o cachorro latir
	public void latir() {
		System.out.println("au au");

	}

	public void dormir() {
		System.out.println("Zzzz");
	}

}
