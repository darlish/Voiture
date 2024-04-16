public class Voiture {
    private String marque;
    private String modele;
    private int fabrication;

    //On crée un constructeur pour la classe voiture
    public Voiture(String marque, String modele, int fabrication){
        this.marque = marque;
        this.modele = modele;
        this.fabrication = fabrication;
    }
    // On utilise les accesseur pour avoir acces aux attribut de la classe
    public String getMarque(){
        return marque;
    }
    public String getModele(){
        return modele;
    }
    public int getFabrication(){
        return fabrication;
    }
}


