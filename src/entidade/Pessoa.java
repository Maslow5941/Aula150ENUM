package entidade;

import java.util.ArrayList;
import java.util.Calendar;

import entidade.enums.ClassificacaoPessoa;
import java.util.List;


public class Pessoa {
	
	private String nome;
	private ClassificacaoPessoa classificacao;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratosHora> contrato = new ArrayList<>();
	
	
	public Pessoa(String nomeTrabalhador, String string, double salarioBase2, Departamento departamento2) {
		
	}


	public Pessoa(String nome, ClassificacaoPessoa classificacao, Double salarioBase, Departamento departamento) {
		
		this.nome = nome;
		this.classificacao = classificacao;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public ClassificacaoPessoa getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(ClassificacaoPessoa classificacao) {
		this.classificacao = classificacao;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<ContratosHora> getContrato() {
		return contrato;
	}

	public void addContract(ContratosHora contrato) {
		this.contrato.add(contrato);
	}
	
	public void removerContrato(ContratosHora contrato) {
		this.contrato.remove(contrato);
		
	}
	
	public double income(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratosHora c : contrato) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	

	

}
