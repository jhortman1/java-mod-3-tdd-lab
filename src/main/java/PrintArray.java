public class PrintArray implements PrintArrayService{

    @Override
    public String printArray(String[] str) {
        String result ="";
        for (String s: str) {
           result += s +" ";
        }
        return result;
    }
}
