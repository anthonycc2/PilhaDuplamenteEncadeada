package estruturaDeDados;

public class PilhaDuplamenteEncadeada {

	private ListaDuplamenteEncadeada lista;
	
	public PilhaDuplamenteEncadeada() {
		this.lista = new ListaDuplamenteEncadeada();
	}
	
	public void adicionar(String valor) {
		this.lista.addFinal(valor);
	}
	
	public void remover() {
		try {
			this.lista.removeFim();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean contem(String valor) {
		return this.lista.contem(valor);
	}
	
	public boolean vazia() {
		return this.lista.vazia();
	}
	
	public void limpar() {
		this.lista.limpar();
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}

}
