package command;

public class StringDrink {
    private String string;

    public StringDrink(String string){
        this.string = string;
    }

    public String getText(){
        return this.string;
    }

    public void setText(String string){
        this.string = string;
    }
}
