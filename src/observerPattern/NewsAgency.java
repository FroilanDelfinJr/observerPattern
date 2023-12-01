package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    private List<Subscriber> subscriberList = new ArrayList<>();

    public List getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void subscribe(Subscriber s) {
        subscriberList.add(s);
    }

    @Override
    public void unSubscribe(Subscriber s) {
        subscriberList.remove(s);
    }

    @Override
    public void notifySubscriber() {

        for (Subscriber subscriber : subscriberList) {
            subscriber.update();
        }
    }
}
