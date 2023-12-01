package observerPattern;

public interface NewsAgencySubject{
    public void subscribe(Subscriber s);
    public void unSubscribe(Subscriber s);
    public void notifySubscriber();
}
