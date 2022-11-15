public class StringReplacer implements StringTransformer{
    private final char actual;
    private final char x;

    public StringReplacer(char actual, char x) {
        this.actual = actual;
        this.x = x;
    }

    @Override
    public void execute(StringDrink drink) {
        String string = drink.getText();
        drink.setText(string.replace(this.actual, this.x));
    }
}
