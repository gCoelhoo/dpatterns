package observer;

public class StringBar extends Bar{
    private boolean hh = false;

    @Override
    public boolean isHappyHour() {
        return hh;
    }

    @Override
    public void startHappyHour() {
        hh = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        hh = false;
        notifyObservers();
    }
}
