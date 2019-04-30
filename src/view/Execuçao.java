package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execu�ao {
	
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setCpf(325255425);
		System.out.println(pf.getCpf());
		
		pf.setEndereco("Atravessa Nave-M�e");
		System.out.println(pf.getEndereco());
		
		pf.setBairro("Barreiro");
		System.out.println(pf.getBairro());
		
		pf.setCep(30561000);
		System.out.println(pf.getCep());
		
		pf.setCidade("Sao Paulo");
		System.out.println(pf.getCidade());
		
		pf.setEstado("S�o Paulo");
		System.out.println(pf.getEstado());
		
		pf.setTelefone(968239863);
		System.out.println(pf.getTelefone());
		
		pj.setCnpj(24584687);
		System.out.println(pj.getCnpj());
	}
	
}
