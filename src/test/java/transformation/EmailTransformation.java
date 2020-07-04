package transformation;


import io.cucumber.cucumberexpressions.Transformer;

public class EmailTransformation implements Transformer<String> {

    public String transform(String s) throws Throwable {
        return s.concat("@learn.com");
    }
}
