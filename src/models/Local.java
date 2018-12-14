package models;

public class Local
{
	String cidade, estado, pais;
	
	public Local(String cidade, String estado, String pais)
	{
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	public String getCidade()
	{
		return cidade;
	}
	
	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado = estado;
	}
	
	public String getPais()
	{
		return pais;
	}
	
	public void setPais(String Nome)
	{
		this.pais = pais;
	}
	
	//teste
}
