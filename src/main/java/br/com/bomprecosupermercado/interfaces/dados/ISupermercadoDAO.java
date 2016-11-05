package br.com.bomprecosupermercado.interfaces.dados;

import br.com.bomprecosupermercado.classesBasicas.Supermercado;

public interface ISupermercadoDAO extends IDAOGenerico<Supermercado>
{
	public Supermercado pesquisarSupermercadoPorNome(String nome);

	public Supermercado pesquisarSupermercadoPorCNPJ(String cnpj);
}