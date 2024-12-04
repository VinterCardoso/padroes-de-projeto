import java.util.ArrayList;
import java.util.List;

interface Observer { // criação da interface "observador" com o método atualizar
  void update();
}

class Subject { // criação da classe observável
  private List<Observer> observers = new ArrayList<>(); // atributo para lista de observadores do observável 
  private int state; // atributo estado

  public int getState() { // método que retorna o estado atual
      return state;
  }

  public void setState(int state) { // método que muda o estado, que inclui a chamada de notificação para os observadores
      this.state = state;
      notifyObservers();
  }

  public void add(Observer observer) { // método que adiciona um observador na lista
      observers.add(observer);
  }

  public void remove(Observer observer) { // método que retira um observador da lista
      observers.remove(observer);
  }

  public void notifyObservers() { // método que notifica observadores, incluindo a chamada da atualização deles
      for (Observer observer : observers) { 
          observer.update();
      }
  }
}