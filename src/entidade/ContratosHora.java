package entidade;

import java.util.Date;

public class ContratosHora {

	private Date data;
	private Double ValorHora;
	private Integer horas;
	
	
	public ContratosHora() {
		
	}


	public ContratosHora(Date data, Double valorHora, Integer horas) {
		
		this.data = data;
		ValorHora = valorHora;
		this.horas = horas;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorHora() {
		return ValorHora;
	}


	public void setValorHora(Double valorHora) {
		ValorHora = valorHora;
	}


	public Integer getHoras() {
		return horas;
	}


	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		return ValorHora * horas;
	}
	
	
	
}
