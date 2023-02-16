package com.example.services;

import com.example.dao.BanqueDAO;
import com.example.entities.Banque;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/banques")
public class BanqueResource {
    BanqueDAO dao = null;
    public BanqueResource() {
        this.dao = new BanqueDAO();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Banque> trouverBanques(){
        return dao.trouverBanques();
    }
}
