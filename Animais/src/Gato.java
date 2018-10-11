public class Gato {

	private String nome;
	private String cor;

	public Gato(String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void miar() {
		System.out.println("miau");
	}

	public void dormir() {
		System.out.println("Zzzzz");
	}
}
