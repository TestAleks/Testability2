public class BmiService {

    public double calculate(double height, double wight) {
        double BodyMass;
        BodyMass = wight / (height * height);
        int bmi = (int) BodyMass;
        return (int) BodyMass;
    }
}
