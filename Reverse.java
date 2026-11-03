class Reverse {
    int n = 6789, rev = 0;

    void calculate() {
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse = " + rev);
    }

    public static void main(String[] args) {
        Reverse x = new Reverse();
        x.calculate();
    }
}
