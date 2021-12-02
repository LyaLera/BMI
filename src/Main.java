public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 86;
        double height = 1.78;
        double bmi = service.calculate(weight,height);
        System.out.println(bmi);
    }
}