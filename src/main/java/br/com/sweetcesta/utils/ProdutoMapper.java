package br.com.sweetcesta.utils;

import br.com.sweetcesta.dto.ProdutoDTO;
import br.com.sweetcesta.entity.ProdutoEntity;

import java.util.List;
import java.util.stream.Collectors;;

public class ProdutoMapper {
    /*
     * Classe que faz o mapeamento de um objeto Entity Produto para um outro objeto do tipo DTO
     * 
     */

    public static ProdutoDTO toDTO(ProdutoEntity produto) {
     
        ProdutoDTO dto = new ProdutoDTO();
     
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.getDescricao());
        dto.setValor(produto.getValor());
       
    
        return dto;
    }

    public static List<ProdutoDTO> toDTOList(List<ProdutoEntity> produtos) {
        return produtos.stream()
                .map(ProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }
}