public class BmiService {
    public double calculate(int weight, double height){
        double heights = height * height;
        double bmi = weight / heights;
        return bmi;
    }
}
