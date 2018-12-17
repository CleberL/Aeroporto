package models;

public class Aeroporto {
    private String codigo;
	private String cidade;
	private String estado;
	private String pais;

	Aeroporto(String codigo, String cidade, String estado, String pais) {
        this.codigo = codigo;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
	
	public void setPais(String pais)
	{
		this.pais = pais;
	}
}
