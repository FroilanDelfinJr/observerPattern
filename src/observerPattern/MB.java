package observerPattern;

public class MB {
    public static void main (String[] args){

        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber();
        subscriber1.setSubscriberName("Juan");

        Subscriber subscriber2 = new Subscriber();
        subscriber2.setSubscriberName("Dos");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        System.out.println("BREAKING NEWS!!!");

        newsAgency.notifySubscriber();

        Subscriber subscriber3 = new Subscriber();
        subscriber3.setSubscriberName("Tres");

        newsAgency.subscribe(subscriber3);

        System.out.println();
        System.out.println("BREAKING NEWS!!!");

        newsAgency.notifySubscriber();

        newsAgency.unSubscribe(subscriber1);

        System.out.println();
        System.out.println("BREAKING NEWS!!!");
        
        newsAgency.notifySubscriber();
    }
}
