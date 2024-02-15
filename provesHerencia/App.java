package provesHerencia;

import provesHerencia.herencia.*;

public class App {
    public static void main(String[] args) {
        //A a = new A();
        B b = new B();
        C c = new C();
        //a.setA("A");
        b.setA(null);
        c.setA("c");
        b.retornaA();
        b.retornaD();
    }

}
