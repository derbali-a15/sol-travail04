package com.example.services;

import com.example.dao.ClientDAO;
import com.example.entities.Client;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Set;

@Path("clients")
public class ClientResource {
    ClientDAO dao = null;

    public ClientResource() {
        dao = new ClientDAO();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/banque/{id}")
    public Set<Client> trouverClientsParBanque(@PathParam("id") int id){
        return dao.trouverClientsParBanque(id);
    }

    @POST
    @Path("/banque/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Client ajouterClientABanque(@PathParam("id") int id, Client client){
        return dao.ajouterClientABanque(id, client);
    }
}
