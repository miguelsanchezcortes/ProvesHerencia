package provesHerencia.herencia;


public abstract class A {
    private String a;


    public A() {
    }

    public A(String a) {
        this.a = a;
    }
    
    public void metodeA() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void retornaA(){
        System.out.println("Estic en A");
    }

}
