package strategy;

import command.StringDrink;
import command.StringRecipe;
import observer.StringBar;

public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
