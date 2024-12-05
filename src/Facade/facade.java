// Subsistema 1: Sistema de Controle de Luz
class Luz {
    void ligar() {
        System.out.println("Luz ligada.");
    }

    void desligar() {
        System.out.println("Luz desligada.");
    }
}

// Subsistema 2: Sistema de Controle de Temperatura
class ArCondicionado {
    void ligar() {
        System.out.println("Ar-condicionado ligado.");
    }

    void desligar() {
        System.out.println("Ar-condicionado desligado.");
    }
}

// Subsistema 3: Sistema de Som
class Som {
    void ligar() {
        System.out.println("Sistema de som ligado.");
    }

    void desligar() {
        System.out.println("Sistema de som desligado.");
    }
}

// Facade: Interface simplificada
class SistemaAmbienteFacade {
    private final Luz luz;
    private final ArCondicionado arCondicionado;
    private final Som som;

    public SistemaAmbienteFacade() {
        luz = new Luz();
        arCondicionado = new ArCondicionado();
        som = new Som();
    }

    void iniciarAmbiente() {
        System.out.println("Iniciando ambiente...");
        luz.ligar();
        arCondicionado.ligar();
        som.ligar();
    }

    void finalizarAmbiente() {
        System.out.println("Finalizando ambiente...");
        luz.desligar();
        arCondicionado.desligar();
        som.desligar();
    }
}

public class Main {
    public static void main(String[] args) {
        // Usando o Facade para simplificar o processo
        SistemaAmbienteFacade ambiente = new SistemaAmbienteFacade();
        ambiente.iniciarAmbiente();  // Inicia todos os subsistemas
        ambiente.finalizarAmbiente();  // Finaliza todos os subsistemas
    }
}
