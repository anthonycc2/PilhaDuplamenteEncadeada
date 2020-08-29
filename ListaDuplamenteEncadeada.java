package estruturaDeDados;

public class ListaDuplamenteEncadeada implements EstruturaDeDados {
	
	private NodoDuplo cabeca;
	private NodoDuplo cauda;
	private int tamanho;
	
	public ListaDuplamenteEncadeada() {

	}
	
	public void addFinal(String valor) {
		NodoDuplo no = new NodoDuplo(valor);
		
		if (this.cabeca == null) {
			this.cabeca = no;
			this.cauda = no;
			this.tamanho++;
			return;
		}
		
		/*NodoDuplo noAnterior = this.cauda;
		noAnterior.setProximo(no);
		no.setAnterior(noAnterior);*/
		no.setAnterior(this.cauda);
		this.cauda.setProximo(no);
		this.cauda = no;
		this.tamanho++;
	}
	
	public void removeInicio() throws Exception {
		if (this.cabeca == null) {
			throw new Exception("Lista vazia.");
		}
		
		this.cabeca = this.cabeca.getProximo();
		this.cabeca.setAnterior(null);
		this.tamanho--;
	}
	
	public void removeFim() throws Exception {
		if (this.cabeca == null) {
			throw new Exception("Lista vazia.");
		}
		
		NodoDuplo penultimo = this.cabeca;
		while (penultimo.getProximo() != this.cauda) {
			penultimo = penultimo.getProximo();
		}
		penultimo.setProximo(null);
		this.cauda = penultimo;
		this.tamanho--;
	}
	
	public void remove(String valor) throws Exception {
		if (this.cabeca == null) {
			throw new Exception("Lista vazia.");
		}
		
		if (this.cabeca.getValor().equals(valor)) {
			this.removeInicio();
			return;
		}
		
		if (this.cauda.getValor().equals(valor)) {
			this.removeFim();
			return;
		}
		
		NodoDuplo no = this.cabeca;
		while (!no.getValor().equals(valor)) {
			no = no.getProximo();
		}

		no.getAnterior().setProximo(no.getProximo());
		no.getProximo().setAnterior(no.getAnterior());
		this.tamanho--;
	}
	
	public boolean contem(String valor) {
		for(NodoDuplo n = this.cabeca; n != null; n = n.getProximo())
			if (n.getValor().contentEquals(valor))
				return true;
		
		return false;
	}
	
	public boolean vazia() {
		return (this.cabeca == null);
	}
	
	public void limpar() {
		this.cabeca = null;
		this.cauda = null;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		String string = "Lista: ";
		
		for(NodoDuplo no = this.cabeca; no != null; no = no.getProximo()) {
			string += no.getValor() + " ";
		}
		return string;
	}
	
}
