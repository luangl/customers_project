/**
 *
 */
package br.com.luan.dao;

import java.util.Collection;

import main.java.br.com.luan.dao.IProdutoDAO;
import main.java.br.com.luan.domain.Produto;
import main.java.br.com.luan.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Luan Glaab
 *
 */
public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void excluir(String valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}