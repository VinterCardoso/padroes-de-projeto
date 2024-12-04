interface objeto {
    void display();
}

class objeto_base implements objeto{
    private String nome_arq;

    public objeto_base(String nome_arq){
        this.nome_arq = nome_arq;
        load_objeto_from_disk();
    }

    public void display() {
        System.out.println("Imprimindo " + nome_arq);
    }
}

class proxy_objeto implements objeto {
    private RealImage objeto_base;
    private String nome_arq;

    public ProxyImage(String nome_arq) {
        this.nome_arq = nome_arq;
    }

    public void display() {
        if (objeto_base == null) {
            objeto_base = new objto_base(nome_arq);
        }
        objeto_base.display();
    }
}
