package provesHerencia.herencia;


public class B extends A implements D{
    public String b;

    public B() {
    }


    public B(String a, String b) {
        super(a);
        this.b = b;
    }

    

    public void metodeB() {
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Override
    public void retornaA(){
        super.retornaA();
        System.out.println("Estic en B");
    }


    @Override
    public void retornaD() {
        // TODO Auto-generated method stub
        System.out.println("Metode de la interficie D");
        throw new UnsupportedOperationException("Unimplemented method 'retornaD'");
    }

}
