class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
//Para o arquivo A o código compila e roda normalmente, imprimindo "42 84".


class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    void getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
/*Para o arquivo B não compila, pois o método getTime é do tipo void e não deveria retornar um valor, e já na linha String tod = c.getTime(); está tentando
atribuir esse valor retornado a uma variável do tipo String. A correção seria mudar o tipo do método getTime de void para String. Com
isso o código rodaria normalmente.
 */
