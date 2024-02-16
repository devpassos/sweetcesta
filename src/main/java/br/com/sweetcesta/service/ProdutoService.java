package br.com.sweetcesta.service;

import java.util.List;

import br.com.sweetcesta.dto.ProdutoDTO;
import br.com.sweetcesta.repository.ProdutoRepository;
import br.com.sweetcesta.utils.ProdutoMapper;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

public class ProdutoService {

    @Inject
    ProdutoRepository produtosRepository;

    @Transactional
    public List<ProdutoDTO> listarTodosProdutos() {

        return ProdutoMapper.toDTOList(produtosRepository.listAll());
    }
    
}
