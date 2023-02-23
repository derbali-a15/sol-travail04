package com.example.dao;

import com.example.entities.Banque;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class BanqueDAO implements IBanqueDAO {
    DataManager dataManager = null;
    public BanqueDAO() {
        dataManager = DataManager.getSingleInstance();
    }

    @Override
    public List<Banque> trouverBanques() {
        if(dataManager.manager != null){
            Query query = dataManager.manager.createQuery("SELECT b FROM Banque  b");
            return query.getResultList();
        }
        return null;
    }
}
