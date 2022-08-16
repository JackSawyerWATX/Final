class Main {
    public static void main(String[]args ){

        SimpleMath helper = new SimpleMath();
        double sum = helper.add(4,5);
        System.out.println(sum);

        // Sub helper = new Sub();
        // double sum = helper.add(4,5);
        // System.out.println(sum);

        System.out.println(SimpleMath.POWER);

        double product = helper.toTheThirdPower(2);
        System.out.println(product);

        // SimpleMath.POWER = 4;
        // System.out.println(SimpleMath.POWER);

        double product2 = helper.toTheThirdPower(2);
        System.out.println(product2);

    }
}