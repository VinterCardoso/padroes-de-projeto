interface Objeto {
    void display();
}

class ObjetoBase implements Objeto{
    private String nome_arq;

    public ObjetoBase(String nome_arq){
        this.nome_arq = nome_arq;
    }

    public void display(){
        System.out.println("Imprimindo " + nome_arq);
    }
}

class ProxyObjeto implements Objeto{
    private ObjetoBase objetoBase;
    private String nome_arq;

    public ProxyObjeto(String nome_arq){
        this.nome_arq = nome_arq;
    }

    @Override
    public void display(){
        if (objetoBase == null){
            objetoBase = new ObjetoBase(nome_arq);
        }
        objetoBase.display();
    }
}

public class Main{
    public static void main(String[] args){
        Objeto proxy = new ProxyObjeto("arquivo_exemplo.txt");

        System.out.println("Chamando display pela primeira vez:");
        proxy.display();

        Systema.out.println("Chamando display novamente: ");
        proxy.display();
    }
}
