package org.patterns.observerpattern.Observer;

import org.patterns.observerpattern.Observable.ItemStockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userId;
    ItemStockObservable itemStockObservable;

    public MobileAlertObserverImpl(String userId, ItemStockObservable itemStockObservable){
        this.userId=userId;
        this.itemStockObservable=itemStockObservable;
    }
    @Override
    public void update() {
        sendMsgOnPhone(userId,"product is in stock!!! hurry!!");

    }

    private void sendMsgOnPhone(String userName, String message){
        System.out.println("msg Sent to "+userName);
    }
}
