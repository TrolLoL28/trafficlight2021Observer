package trafficlight.states;

//TODO implement a part of the pattern here

import trafficlight.inter.Observer;
import trafficlight.inter.Subject;

import java.util.ArrayList;
import java.util.List;

public abstract class State extends Subject{

    public abstract State getNextState();

    public abstract String getColor();

    public String getSting(){
        return getColor();
    }
}