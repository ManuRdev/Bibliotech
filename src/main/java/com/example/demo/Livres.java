package com.example.demo;

import java.util.Date;

public class Livres {
    private String Titre;
    private String auteur;
    private String presentaiton;
    private Date parution;
    private int col;
    private int rank;

    public void setTitre(String titre){
        this.Titre = titre;
    }

    public String getTitre() {
        return Titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getPresentaiton() {
        return presentaiton;
    }

    public void setPresentaiton(String presentaiton) {
        this.presentaiton = presentaiton;
    }

    public Date getParution() {
        return parution;
    }

    public void setParution(Date parution) {
        this.parution = parution;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
