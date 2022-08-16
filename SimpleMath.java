public final class SimpleMath {
    public final static int POWER = 3;

    public double add (double num1, double num2) {
        return num1 + num2;
    }

    public double toTheThirdPower (double num1){
        double product = 1;

        for(int i = 1; i <= POWER; i++) {
            product *= num1;
        }
        return product;
    }
}
