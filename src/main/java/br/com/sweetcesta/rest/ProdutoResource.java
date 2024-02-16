package br.com.sweetcesta.rest;


import java.util.List;

import br.com.sweetcesta.service.ProdutoService;
import br.com.sweetcesta.dto.ProdutoDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/produtos")
@Produces(MediaType.APPLICATION_JSON)
class ProdutoResource {

    @Inject
    ProdutoService produtoService;


    @GET
    public Response listarProdutos() {
        List<ProdutoDTO> produtos = produtoService.listarTodosProdutos();

        return Response.ok(produtos).build();
    }
 
}