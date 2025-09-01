public class ContactList {
    
    Contact[] contacts = new Contact[2];
    int tamanho_array = 0;


    public void add(Contact c) {
        //verifica se o contato é nulo
        if (c == null){
            return;
        }
        //verifica se o array está cheio
        if (tamanho_array == contacts.length){
            Contact[] novo_array = new Contact[contacts.length * 2];
            for (int i = 0; i < contacts.length; i++){
                novo_array[i] = contacts[i];
            }
            //atualiza a referencia do array antigo para o novo
            contacts = novo_array;
        }
        //adiciona o contato no array e incrementa o tamanho
        contacts[tamanho_array] = c;
        tamanho_array++;
    }
//imprime todos os contatos da lista
    public void printAll() {
        System.out.println("\n----- Lista de Contatos -----");
        for (int i = 0; i < tamanho_array; i++) {
            System.out.println(contacts[i]);
        }
        System.out.println("---------------------------\n");
    }
    public static void main(String[] args) {
        ContactList list = new ContactList();

        Contact c1 = new Contact("Batman", "1111-1111");

        list.add(c1);
        list.add(new Contact("Superman", "2222-2222"));
        list.add(new Contact("Lanterna Verde", "3333-3333"));
        list.add(new Contact("Deadpool", "4444-4444"));
        list.add(new Contact("Wolverine", "5555-5555"));

        System.out.println("Lista inicial:");
        list.printAll();
        //modifica o nome do contato original
        c1.name = "Bruce Wayne";
        
        System.out.println("Lista apos modificar a referencia original :");
        list.printAll();
    }
}
