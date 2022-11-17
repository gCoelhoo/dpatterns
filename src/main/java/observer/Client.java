package observer;

import command.StringDrink;
import command.StringRecipe;

public interface Client extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
