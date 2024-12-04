
import java.util.ArrayList;
import java.util.List;

interface Observer { // interface observador com método atualizar
  void update();
}

class Observable { // classe observável 
  private List<Observer> observers = new ArrayList<>(); // atributo lista de observadores
  private int state; // atributo estado

  public int getState() { // método que retorna o estado atual
      return state;
  }

  public void setState(int state) { // método que muda o estado, inclui a chamada da notificação para os observadores
      this.state = state;
      notifyObservers();
  }

  public void addObserver(Observer observer) { // método que adiciona um observador na lista
      observers.add(observer);
  }

  public void removeObserver(Observer observer) { // método que remove um observador da lista
      observers.remove(observer);
  }

  public void notifyObservers() { // método que notifica observadores, chamando da atualização dos observadores
      for (Observer observer : observers) {
          observer.update();
      }
  }
}

//exemplificação com classes genericas

class ConcreteObserver implements Observer { // classe que implementa a interface observador
  private Observable observable;             // atributo observável

  public ConcreteObserver(Observable observable) { // criação de um observador, inclui a adição dele na lista do observável
      this.observable = observable;
      observable.addObserver(this);
  }

  public void update() { // implementação do método para atualização do observador
      System.out.println("Estado mudou para " + observable.getState());
  }
}

public class Main {
  public static void main(String[] args) {
      Observable observable = new Observable(); // criação observável
      ConcreteObserver observer1 = new ConcreteObserver(observable); // criação de um observador
      ConcreteObserver observer2 = new ConcreteObserver(observable);// criação de outro observador

    // mudanças de estado do observável 
      observable.setState(1); 
      observable.setState(2);
      observable.setState(3);
  }
}