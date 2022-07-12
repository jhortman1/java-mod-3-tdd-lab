public class Main {
    public static void main(String[] args) {
        String [] str = {"foot","comb","face-comb","thomas",null};
        FizzBuzzArrayService fb = new FizzBuzzArray();
        PrintArrayService print = new PrintArray();
        String[] str2 = fb.fizzBuzzArray(str);
        System.out.println(print.printArray(str));
        System.out.println(print.printArray(str2));
    }
}
