public class Main {
    void executeFirstTask() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton HashCode (Primeira Tarefa): " + singleton.hashCode());
        singleton.showMessage("Executando a primeira tarefa.");
    }

    void executeSecondTask() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton HashCode (Segunda Tarefa): " + singleton.hashCode());
        singleton.showMessage("Executando a segunda tarefa.");
    }

    void executeThirdTask() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton HashCode (Terceira Tarefa): " + singleton.hashCode());
        singleton.showMessage("Executando a terceira tarefa.");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Demonstrando que todas as tarefas compartilham a mesma instância Singleton:");
        main.executeFirstTask();
        main.executeSecondTask();
        main.executeThirdTask();
    }
}