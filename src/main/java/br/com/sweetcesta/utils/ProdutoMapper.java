package br.com.sweetcesta.utils;

import br.com.sweetcesta.dto.ProdutoDTO;
import br.com.sweetcesta.Entities.Produto;;

public class ProdutoMapper {

    public static ProdutoDTO toDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setPreco(produto.getPreco());
        // Aqui você pode mapear outros atributos, se necessário
        return dto;
    }

    public static List<ProdutoDTO> toDTOList(List<Produto> produtos) {
        return produtos.stream()
                .map(ProdutoMapper::toDTO)
                .collect(Collectors.toList());
    }
}