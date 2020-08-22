package com.octest.dao;

import java.util.List;

import com.octest.beans.Utilisateur;

public class UtilisateurDao {
    void ajouter( Utilisateur utilisateur );
    List<Utilisateur> lister();
}