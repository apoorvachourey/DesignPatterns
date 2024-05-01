package org.observerpattern.Observer;

import org.observerpattern.Observable.ItemStockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    ItemStockObservable itemStockObservable;

    public EmailAlertObserverImpl(String emailId, ItemStockObservable itemStockObservable){
        this.emailId = emailId;
        this.itemStockObservable=itemStockObservable;
    }
    @Override
    public void update() {
        sendEmail(emailId,"product is in stock! Hurry up!");
    }

    private void sendEmail(String emailId, String message){
        System.out.println("Email sent to "+emailId);
        //send ActualEmail to user
    }
}
