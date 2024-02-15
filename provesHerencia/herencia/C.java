package provesHerencia.herencia;


public class C extends A {
    public String c;

    public C() {
    }

    
    public C(String a, String c) {
        super(a);
        this.c = c;
    }
    
    public void metodeC() {
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

}
