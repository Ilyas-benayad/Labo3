void main() {
    /*Ecrire un programme qui détermine la plus grande valeur de n telle que la somme des n premiers
entiers positifs soit inférieure à un nombre max (entier positif) entré par l'utilisateur. Par exemple
si l'utilisateur entre la valeur 20, la réponse est 5 car 1 + 2 + 3 + 4 + 5 = 15 alors que 1 + 2 + 3
+ 4 + 5 + 6 = 21.

 */
    System.out.println("Entrer une valeur max");
    Scanner s = new Scanner(System.in);
    int max = s.nextInt();
    int k = 0;
    int res = 0;

    while (res + k <max){
        res+=k;
        ++k;

        System.out.println(k);;
    }
    System.out.println(res);
}