package com.formatech.test;

public class CompteChaine {

    private String chaine;

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public CompteChaine(String chaine) {
        this.chaine = chaine;
    }


    public int compterNbrAB(CompteChaine testCompteChainechaine){
        String[] listMots= testCompteChainechaine.chaine.split("\\s+");;
        int cmpt=0;
        for(String mot : listMots){
            if (mot.contains("a")|| mot.contains("b")){
                cmpt++;
            }
        }
        return cmpt;
    }

}
