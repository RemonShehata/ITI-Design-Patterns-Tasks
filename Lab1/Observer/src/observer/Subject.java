package observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author remon
 */
public abstract class Subject {

    protected abstract void add(Observer obs);

    protected abstract void remove(Observer obs);

    protected abstract void notifyall();
}
