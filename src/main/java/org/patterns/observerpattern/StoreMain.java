package org.patterns.observerpattern;

import org.patterns.observerpattern.Observable.IphoneObservableImpl;
import org.patterns.observerpattern.Observable.ItemStockObservable;
import org.patterns.observerpattern.Observer.EmailAlertObserverImpl;
import org.patterns.observerpattern.Observer.MobileAlertObserverImpl;
import org.patterns.observerpattern.Observer.NotificationAlertObserver;

public class StoreMain {
    public static void main(String[] args) {
        ItemStockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com ", iphoneObservable);
        //this is the first subscriber, who has clicked on notify me when iphone comes in stock
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com ", iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("userId1 ", iphoneObservable);
        /*
        so these are three subscribers
         */

        // adding observers(subscribers) to observable list
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);


        iphoneObservable.setStockCount(10);







    }
}
/*
Real time usecase -
Amazon website item going out of stock and user clicking notify me!

 */