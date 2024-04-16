public class Main {
    public static void main(String[] args) {
    Voiture mcqueen = new Voiture("Ford", "Ford Mustang", 2006);

    //On affiche les caractéristiques de la voiture à l'aide des accesseurs

    System.out.println("année de fabrication: " + mcqueen.getFabrication());
    System.out.println("Marque: " + mcqueen.getMarque());
    System.out.println("Modèle: " + mcqueen.getModele());

}
}


