import java.util.List;

public class FizzBuzzArray implements FizzBuzzArrayService {
    @Override
    public String[] fizzBuzzArray(String[] fbArray) {
        FizzBuzzService fbs = new FizzBuzz();
        String [] newArray = new String[fbArray.length];
        for (int i = 0; i< fbArray.length; i++) {
            newArray[i] = fbs.FizzBuzz(fbArray[i]);
        }
        return newArray;
    }



}
