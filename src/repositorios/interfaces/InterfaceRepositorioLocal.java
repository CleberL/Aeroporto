package repositorios.interfaces;

import models.Local;

public interface InterfaceRepositorioLocal
{
	public void adicionarLocal(Local l);
	public void removerLocal(Local l);
	public Local procurarLocal(Local l);

}
