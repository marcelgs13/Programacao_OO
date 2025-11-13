class Bees {
    Honey[] beeHoney;
}

class Raccoon {
    Kit rk;
    Honey rh;
}

class Kit {
    Honey honey;
}

class Bear {
    Honey hunny;
}

public class Honey {
    public static void main(String[] args) {
        Honey honeyPot = new Honey();
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};

        Bees bees = new Bees();
        bees.beeHoney = ha;

        Bear[] bears = new Bear[5];
        for (int i = 0; i < 5; i++) {
            bears[i] = new Bear();
            bears[i].hunny = honeyPot;
        }

        Kit kit = new Kit();
        kit.honey = honeyPot;

        Raccoon raccoon = new Raccoon();
        raccoon.rh = honeyPot;
        raccoon.rk = kit;

        kit = null;
        
    }
}
/*O objeto que tem mais variáveis fazendo referência a ele na verdade é o objeto Honey (honeyPot),
pois é o que mais vezes ao longo do código foi referenciado — por variáveis locais, arrays e 
atributos de outros objetos.*/
