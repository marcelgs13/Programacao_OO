public class Puzzle4 {
    public static void main(String[] args) {
        Value[] values = new Value[6];   // trecho utilizado
        int number = 1;
        int i = 0;
        while (i < 6) {
            values[i] = new Value();     // trecho utilizado
            values[i].intValue = number; // trecho utilizado
            number = number * 10;
            i = i + 1;
        }

        int result = 0;
        i = 6;
        while (i > 0) {
            i = i - 1;
            result = result + values[i].doStuff(i); // trecho utilizado
        }

        System.out.println("result " + result);
    }
}

class Value {
    int intValue;

    public int doStuff(int factor) {   // trecho utilizado
        if (intValue > 100) {
            return intValue * factor;          // trecho utilizado
        } else {
            return intValue * (5 - factor);    //trecho utilizado
        }
    }
}
//Marquei os trechos utilizados com um comentário para facilitar na hora de revisar o código.
