package com.example.dao;

import com.example.entities.Banque;
import java.util.List;

public interface IBanqueDAO {
    List<Banque> trouverBanques();
}
