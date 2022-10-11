public class Main {
    public static void main(String[] args) {
        String happy = "happy";
        String happy2 = "Happy";
        String happy3 = "H appy";

        System.out.println(happy.compareTo(happy2));
        System.out.println(happy.compareTo(happy3));
        System.out.println(happy2.compareTo(happy3));


    }
}
