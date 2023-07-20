/**
 *
 */
package main.java.br.com.luan.dao;

import main.java.br.com.luan.dao.generic.GenericDAO;
import main.java.br.com.luan.domain.Venda;
import main.java.br.com.luan.domain.Venda.Status;
import main.java.br.com.luan.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Luan Glaab
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Status.CONCLUIDA);
        super.alterar(venda);
    }



}
