package com.example.dao;

import com.example.entities.Banque;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class BanqueDAO implements IBanqueDAO {
    EntityManager manager = null;
    public BanqueDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bank_system");
        this.manager = factory.createEntityManager();
    }

    @Override
    public List<Banque> trouverBanques() {
        if(manager != null){
            Query query = manager.createQuery("SELECT b FROM Banque  b");
            return query.getResultList();
        }
        return null;
    }
}
