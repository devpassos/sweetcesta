package br.com.sweetcesta.service;

import java.util.List;

import br.com.sweetcesta.Entities.Produto;
import br.com.sweetcesta.repository.ProdutoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

public class ProdutoService {

    @Inject
    ProdutoRepository produtosRepository;

    @Inject
    Produto produto;


    @Transactional
    public List<Produto> listarTodosProdutos() {

        return produtosRepository.listAll();
    }
    
}
