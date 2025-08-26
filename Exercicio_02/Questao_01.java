class Books {
    String title;
    String author;
}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
/*Para o arquivo A o código não é executado pois o array myBooks foi criado porém, nenhum objeto foi
instanciado e com isso ocorrerá um erro do tipo NullPointerException para corrigir o código, seria
necessário instanciar os objetos em cada posição do array:
myBooks[0] = new Books();
myBooks[1] = new Books();
myBooks[2] = new Books();
 */


class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 4) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
/*Para o arquivo B não é executado, pois o erro está no loop while que deveria ser z < 3 pois o array
de objetos é de tamanho 3 ou seja 0,1,2 pois a partir da terceira interação o z assume o valor 3 e
excede o tamanho do array ocorrendo o erro ArrayIndexOutOfBoundsException, para corrigir seria apenas
ajustar o while e se caso quisesse também ajustar a lógica, seria melhor o incremento do z =z +1; ser
na última linha para que o objeto do indice 0 seja instanciado também.
 */
