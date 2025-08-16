class Exercisela {
    public static void main(String[] args) {
        int x = 1;
        while(x<10){
            if(x>3){
                System.out.println("big x");
            }
        } 
    }
}
/*Para esse arquivo A o programa é executado normalmente no entanto ele nunca sairá desse loop
 While pois para corrigir e sair do loop é necessário que dentro do while, após o if tenha um 
 incrementador x++; para que seja atualizado o valor de x para que saia do loop, se não esse
 programa roda infinitamente.*/



 public static void main(String [] args) {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
    }
}


/*Para esse arquivo B o programa não é executado, pois o método main precisa está dentro de uma 
  classe e dessa forma está como se fosse solto , a solução seria criar uma classe e colocar todo
  o código dentro do escopo da classe. abaixo está comentado a solução exemplo:

  class Arquivob { 
    public static void main(String [] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}
*/

class Exercise1c {
    int x = 5;
    while (x > 1) {
        x = x - 1;
        if (x < 3) {
            System.out.println("small x");
        }
    }
}

/*Para esse Arquivo C não é compilado pois para que todas as operações sejam executadas precisam
estar dentro de um método nesse caso poderia ser um método como o 'main', e ai estão apenas no escopo
 da classe por isso não chega a executar.
*/
