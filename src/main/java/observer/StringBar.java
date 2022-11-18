package observer;

import command.StringDrink;
import command.StringRecipe;

public class StringBar extends Bar{
    private boolean hh = false;

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }

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
