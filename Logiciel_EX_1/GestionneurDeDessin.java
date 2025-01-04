//Ce programme prends en saisie un nombre qui correspond au choix de l'utilisateur et ensuite il fait appel aux différentes 
//méthodes de ServiceDeDessins afin d'afficher le bon dessin selon la saisie (c'est donc l'interface utilisateur (UI) du logiciel)
import java.util.Scanner;
public class GestionneurDeDessin{
    public static void choisir(){
        Scanner sc = new Scanner(System.in);
        boolean boucle=true;

        while (boucle){
            int largeur=0;
            int hauteur=0;
            int longueur=0;
            int côté=0;
            int étage=0;
            System.out.println("Veuillez saisir 1 pour afficher un rectangle,2 pour carré,3 pour triangle rectangle gauche, 4 pour triangle rectangle droit,5 pour triangle isocèle,6 pour triangle isocèle inversé,7 pour les 2,8 pour losange,9 pour damier,10 pour rectangle creux,11 rectangle creux avec lettres,12 pour une croix,13 pour triangle isocèle croix et 14 pour un sapin,15 pour quitter");
            int choixduuser=sc.nextInt();
            switch(choixduuser){
                case 1:
                    System.out.println("Saisissez la largeur et la longueur du rectangle");
                    largeur=sc.nextInt();
                    longueur=sc.nextInt();
                    ServiceDeDessins.afficherRectangle(largeur,longueur);
                    break;
                case 2:
                    System.out.println("Saisissez le côté du carré");
                    côté=sc.nextInt();
                    ServiceDeDessins.afficherCarré(côté);
                    break;
                case 3:
                    System.out.println("Saisissez la hauteur du triangle");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherTriangleRectangleGauche(hauteur);
                    break;
                case 4:
                    System.out.println("Saisissez la hauteur du triangle");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherTriangleRectangleDroit(hauteur);
                    break;
                case 5:
                    System.out.println("Saisissez la hauteur du triangle");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherTriangleIsocèle(hauteur);
                    break;
                case 6:
                    System.out.println("Saisissez la hauteur du triangle");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherTriangleIsocèleInversé(hauteur);
                    break;
                case 7:
                    System.out.println("Saisissez la hauteur du triangle");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherTriangleIsocèleEtTriangleIsocèleInversé(hauteur);
                    break;
                case 8:
                    System.out.println("Saisissez la hauteur du losange");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherLosange(hauteur);
                    break;
                case 9:
                    System.out.println("Saisissez la hauteur et largeur du damier");
                    hauteur=sc.nextInt();
                    largeur=sc.nextInt();
                    ServiceDeDessins.afficherDamier(largeur,hauteur);
                    break;
                case 10:
                    System.out.println("Saisissez la longueur et largeur du carré");
                    hauteur=sc.nextInt();
                    longueur=sc.nextInt();
                    ServiceDeDessins.afficherRectangleCreux(largeur,hauteur);
                    break;
                case 11:
                    System.out.println("Saisissez la longueur et largeur du carré");
                    hauteur=sc.nextInt();
                    longueur=sc.nextInt();
                    ServiceDeDessins.afficherRectangleCreuxLettres(largeur,hauteur);
                    break;
                case 12:
                    System.out.println("Saisissez la longueur et largeur du carré");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherCroix(côté);
                    break;
                case 13:
                    System.out.println("Saisissez la hauteur du triangle creux");
                    hauteur=sc.nextInt();
                    ServiceDeDessins.afficherTriangleIsocèleCreux(hauteur);
                    break;
                case 14:
                    System.out.println("Saisissez la longueur et largeur du carré");
                    hauteur=sc.nextInt();
                    étage=sc.nextInt();
                    ServiceDeDessins.afficherSapin(hauteur,étage);
                    break;
                case 15:
                    boucle=false;
                    break;
                    


                    

                

      }
    }
  }
}



