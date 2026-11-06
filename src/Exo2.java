void main() {
    /*
    Ecrire un programme qui calcule la moyenne d'une série de n nombres entrés par l'utilisateur. La
    valeur de n est fournie en préambule par l'utilisateur. Par exemple si l'utilisateur veut calculer la
    moyenne de 8 nombres, il entre d'abord 8 et ensuite, les 8 nombres :
    8
    5 9 -1 0 12 -7 -4 3
    l'ordinateur affiche : 2.125
    */

    Scanner s = new Scanner(System.in);

    int size = s.nextInt();
    double res = 0;
    int k = 1;

    while (k<=size){
        int nb = s.nextInt();
        res += nb;
        ++k;
    }
    System.out.println("la moyenne de la série = " + res/size);
}