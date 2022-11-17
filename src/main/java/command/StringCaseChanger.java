package command;

public class StringCaseChanger implements StringTransformer, StringTransformerUndo{
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();

        for(char c : chars){
            if(Character.isLowerCase(c))
                stringBuilder.append(Character.toUpperCase(c));
            else
                stringBuilder.append(Character.toLowerCase(c));
        }

        drink.setText(stringBuilder.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = drink.getText().toCharArray();

        for(char c : chars){
            if(Character.isUpperCase(c))
                stringBuilder.append(Character.toLowerCase(c));
            else
                stringBuilder.append(Character.toUpperCase(c));
        }

        drink.setText(stringBuilder.toString());
    }
}
