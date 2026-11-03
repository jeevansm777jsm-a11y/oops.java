class Sum {
    int n = 3456, s = 0;

    void calc() {
        while(n > 0) {
            s += n % 10;
            n /= 10;
        }
        System.out.println("Sum = " + s);
    }

    public static void main(String[] args) {
        Sum x = new Sum();
        x.calc();
    }
}