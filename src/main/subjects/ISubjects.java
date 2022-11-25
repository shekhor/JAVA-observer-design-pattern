package main.subjects;

import main.observers.IObserver;

public interface ISubjects{
    public void registerObserver(IObserver ob);
    public void removeObserver(IObserver ob);
    public void notifyObserver();
}