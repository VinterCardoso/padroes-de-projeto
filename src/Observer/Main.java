
import java.util.ArrayList;
import java.util.List;

interface Observer {
  void update();
}

class Observable {
  private List<Observer> observers = new ArrayList<>();
  private int state;

  public int getState() {
      return state;
  }

  public void setState(int state) {
      this.state = state;
      notifyObservers();
  }

  public void addObserver(Observer observer) {
      observers.add(observer);
  }

  public void removeObserver(Observer observer) {
      observers.remove(observer);
  }

  public void notifyObservers() {
      for (Observer observer : observers) {
          observer.update();
      }
  }
}

class ConcreteObserver implements Observer {
  private Observable observable;

  public ConcreteObserver(Observable observable) {
      this.observable = observable;
      observable.addObserver(this);
  }

  public void update() {
      System.out.println("Estado mudou para " + observable.getState());
  }
}

public class Main {
  public static void main(String[] args) {
      Observable observable = new Observable();
      ConcreteObserver observer1 = new ConcreteObserver(observable);
      ConcreteObserver observer2 = new ConcreteObserver(observable);

      observable.setState(1);
      observable.setState(2);
      observable.setState(3);
  }
}