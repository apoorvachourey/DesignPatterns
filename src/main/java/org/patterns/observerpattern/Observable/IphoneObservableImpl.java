package org.patterns.observerpattern.Observable;

import org.patterns.observerpattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements ItemStockObservable{


    List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;


    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : observerList){
            observer.update(); // I have called the update
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount==0){
            notifySubscriber();
        }
        stockCount = stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
