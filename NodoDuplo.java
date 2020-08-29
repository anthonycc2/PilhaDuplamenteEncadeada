package estruturaDeDados;

public class NodoDuplo {
	
	private String valor;
	private NodoDuplo anterior;
	private NodoDuplo proximo;
	
	public NodoDuplo() {
		this.valor = null;
		this.anterior = null;
		this.proximo = null;
	}
	
	public NodoDuplo(String valor) {
		this.valor = valor;
		this.anterior = null;
		this.proximo = null;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public NodoDuplo getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDuplo anterior) {
		this.anterior = anterior;
	}

	public NodoDuplo getProximo() {
		return proximo;
	}

	public void setProximo(NodoDuplo proximo) {
		this.proximo = proximo;
	}
	
}
