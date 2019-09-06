public interface CalculadoraInterface<T>
{
	void empilhar(T empilha);
	T desempilhar();
	T topo();
	boolean vazio();
}