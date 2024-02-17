package br.com.sweetcesta.rest;


import br.com.sweetcesta.dto.ProdutoDTO;
import br.com.sweetcesta.service.ProdutoService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/produtos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
class ProdutoResource {

    @Inject
    ProdutoService produtoService;



    @GET
    public Response listarProdutos() {
        


        return Response.status(Response.Status.OK)
            .entity(produtoService.listarTodosProdutos())
            .build();
    }

    @Path("/{nome}")
    @GET
    public Response getProdutoByName(@PathParam("nome") String nome) {
        
        return Response.status(Response.Status.OK)
            .entity(produtoService.buscarPorNome(nome))
            .build();

     
    }



    @POST
    public Response cadastrarProduto(ProdutoDTO produto) {

        produtoService.cadastrarProduto(produto);

        return Response.status(Response.Status.OK)
            .entity(produto)
            .build();


    }

 
}