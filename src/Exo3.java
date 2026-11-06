void main() {
    /*
    Réécrivez le même programme que pour l'exercice précédent, mais cette fois vous devez assurer que
l'utilisateur entre un nombre (strictement) positif pour n. Vous devez l'obliger à recommencer si ce
nombre n'est pas positif.
*/

    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    double res = 0;
    int k = 1;
    while (n<=0){
        System.out.println("Entrer un positif");
        n = s.nextInt();
    }
    while (k<=n){
        int nb = s.nextInt();
        res += nb;
        ++k;
    }
    System.out.println("la moyenne de la série = " + res/n);

}