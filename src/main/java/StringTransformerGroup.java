import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer tr : transformers)
            tr.execute(drink);
    }
}
