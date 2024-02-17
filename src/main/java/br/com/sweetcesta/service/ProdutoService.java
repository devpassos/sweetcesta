package br.com.sweetcesta.service;

import java.util.List;

import br.com.sweetcesta.dto.ProdutoDTO;
import br.com.sweetcesta.entity.ProdutoEntity;
import br.com.sweetcesta.utils.ProdutoMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class ProdutoService {

  
 
    public List<ProdutoDTO> listarTodosProdutos() {

        //Cria uma lista do tipo ProdutoDTO e a inicia com a lista de todos os produtos retornados do banco de dados.
        //Os objetos são mapeados pelo método stático toDTOList da classe ProdutoMapper.
        List<ProdutoDTO> listProdutoDTO = ProdutoMapper.toDTOList(ProdutoEntity.listAll());
              
        return listProdutoDTO;
        
    }

    @Transactional
    public void cadastrarProduto(ProdutoDTO produto){

        ProdutoEntity novoProduto = new ProdutoEntity();
        
        novoProduto.setNome(produto.getNome());
        novoProduto.setDescricao(produto.getDescricao());
        novoProduto.setValor(produto.getValor());

        novoProduto.persist();
    }

    public ProdutoDTO buscarPorNome(String nome) {

        return ProdutoMapper.toDTO(ProdutoEntity.findByName(nome));
    }
    
}
