package trafficlight.gui;


//import sun.jvm.hotspot.utilities.Observer;
import trafficlight.inter.Observer;
import trafficlight.states.State;

import java.awt.*;

public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update(State state) {
        turnOn(!isOn());
    }

    //TODO implement a part of the pattern here
}
