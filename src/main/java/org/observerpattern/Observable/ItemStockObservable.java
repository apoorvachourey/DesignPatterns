package org.observerpattern.Observable;

import org.observerpattern.Observer.NotificationAlertObserver;

public interface ItemStockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
