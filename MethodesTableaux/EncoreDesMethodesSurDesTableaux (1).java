public class EncoreDesMethodesSurDesTableaux {
    public static double moyenne(double[] tab) { // Fonction qui renvoie la moyenne d'un tableau de double, à ne pas utiliser sur un tableau vide
        double moyenne = 0;
        for (int i = 0; i < tab.length; i++) {
            moyenne += tab[i];
        }
        return moyenne / tab.length;
    }

    public static void main(String[] args) {
        double[] tabLongZéro = new double[0]; // création d’un tableau de longueur zéro

        System.out.println(moyenne(tabLongZéro));
    }

    public static double plusGrand(double[] tab) { // Fonction qui renvoie le plus grand d'un tableau de double,à ne pas utiliser sur des nombres négatifs
        double max = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static boolean égaux(int[] tab1, int[] tab2) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public static int[] sommeMêmeLongueur(int[] tab1, int[] tab2) { // les tableaux doivent être de même longueur pour que la méthode renvoie la somme des cases du tableau 1 et 2.
        int[] tabResultat;
        tabResultat = new int[tab1.length];
        for (int i = 0; i < tab1.length; i++) {
            tabResultat[i] = tab1[i] + tab2[i];
        }
        return tabResultat;

    }
    public static int[] somme(int[] tab1,int[] tab2){
            int[] tabSomme;
            int longueurPluspetit=0;
            int longueurPlusgrand=0;
            if (tab1.length>tab2.length){
                tabSomme=new int[tab1.length];
                longueurPluspetit=tab2.length;
                longueurPlusgrand=tab1.length;
            }
            else{
                tabSomme=new int[tab2.length];
                longueurPluspetit=tab1.length;
                longueurPlusgrand=tab2.length;

            }
            for(int i=0;i<longueurPluspetit;i++){
                    tabSomme[i]=tab1[i]+tab2[i];
                }
            for(int j=longueurPluspetit;j<longueurPlusgrand;j++){
                if (longueurPlusgrand==tab1.length){
                    tabSomme[j]=tab1[j];
                }
                else{
                    tabSomme[j]=tab2[j];
                }
            }
            return tabSomme;

            }

    public static int[] positifs(int []tab ){
        int cpt=0;
        int[] tabResultat;
        int nb=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                cpt++;
            }
        }
        if (cpt==tab.length){
            return tab;
        }
        tabResultat=new int[cpt];
        for(int i=0;i<tab.length;i++){
                if (tab[i] >= 0) {
                    tabResultat[nb] = tab[i];
                    nb++;
                }

            }

        return tabResultat;
    }
    public static double Seuil(double[] tab,double seuila){
        double[] tabtab;
        int cpt=0;
        double max=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<=0){
                cpt++;
            }
        }
        tabtab=new double[cpt];
        for(int j=0;j<tab.length;j++){
            if(tab[j]<=0){
                tabtab[j]=tab[j];
            }

        }
        for(int k=0;k<tabtab.length;k++){
            if(tabtab[k]>max)
                max=tabtab[k];
        }
        return max;

        }





    }





