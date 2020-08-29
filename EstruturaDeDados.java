package estruturaDeDados;

public interface EstruturaDeDados {
	
	public void addFinal(String valor);
	
	public void removeInicio() throws Exception;
	
	public void removeFim() throws Exception;
	
	public void remove(String valor) throws Exception;

	public boolean contem(String valor);
	
	public boolean vazia();

	public void limpar();

	@Override
	public String toString();

}
