package br.com.sweetcesta.service;

import br.com.sweetcesta.repository.ProdutosRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

public class ProdutosService {

    @Inject
    ProdutosRepository produtosRepository;


    @Transactional
    public List<ProdutosDTO> listarTodosProdutos() {

        return produtosRepository.listAll();
    }
    
}
