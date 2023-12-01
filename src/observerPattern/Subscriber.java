package observerPattern;

public class Subscriber implements SubscriberObserver{

    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update() {
        System.out.println();
        System.out.println("Hey " + subscriberName + "! \nExciting news just for you: stay in the loop with the latest updates and uncover the stories shaping our world right now.");
    }

}
