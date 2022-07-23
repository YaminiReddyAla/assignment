package july18th.designpatterns.observer.copypaste;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


public class Subject {
private List<Observer> observers=new ArrayList<Observer>();
private int state;
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
	notifyAllObservers();
}
private void notifyAllObservers() {
	// TODO Auto-generated method stub
	for(Observer observer:observers) {
		observer.update(null, observer);
	}
}

}
