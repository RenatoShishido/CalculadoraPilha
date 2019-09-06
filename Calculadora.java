public class Calculadora<T> implements CalculadoraInterface<T>
{
	public T [] vet;
	private int topo;

	public Calculadora()
	{
		vet = (T[]) new Object[10];
		topo = -1;
	}
	public Calculadora(int capacidade)
	{
		vet = (T[]) new Object[capacidade];
		topo = -1;
	}
	public void empilhar(T empilha)
	{
		vet[++topo] = empilha;
	}
	public T desempilhar()
	{
		T item = vet[topo];
		vet[topo] = null;
		--topo;
		return item;
	}
	public T topo()
	{
		return vet[topo];
	}
	public boolean vazio()
	{
		return topo == -1;
	}
	public int tamanho()
	{
		return vet.length;
	}
}