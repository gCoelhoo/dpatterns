public class StringCaseChanger implements StringTransformer{
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
}
