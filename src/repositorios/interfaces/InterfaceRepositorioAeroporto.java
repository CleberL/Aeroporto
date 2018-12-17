package repositorios.interfaces;

import models.Aeroporto;

public interface InterfaceRepositorioAeroporto
{
	public void adicionarLocal(Aeroporto l);
	public void removerLocal(Aeroporto l);
	public Aeroporto procurarLocal(Aeroporto l);

}
