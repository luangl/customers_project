/**
 *
 */
package main.java.br.com.luan.services;

import main.java.br.com.luan.domain.Cliente;
import main.java.br.com.luan.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Luan Glaab
 *
 */
public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
