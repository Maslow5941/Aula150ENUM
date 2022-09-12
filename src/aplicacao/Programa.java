package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.ContratosHora;
import entidade.Departamento;
import entidade.Pessoa;

public class Programa {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Data do trabalhador:");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Classificacao: ");
		String classificacao = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		Pessoa pessoa = new Pessoa(nomeTrabalhador, classificacao.valueOf(classificacao), salarioBase, new Departamento(departamentoNome));
		
		
		System.out.print("Quantos contratos? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contrato #" + i + " data:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = null;
			try {
				dataContrato = sdf.parse(sc.next());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("valor por hora:  ");
			double valorHora = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			ContratosHora contrato = new ContratosHora(dataContrato, valorHora, hours);
			pessoa.addContract(contrato);
			
			
		sc.close();
		
	}

	}
}
