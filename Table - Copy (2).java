class Table {
    int n = 8;

    void print() {
        for(int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + n * i);
    }

    public static void main(String[] args) {
        Table x = new Table();
        x.print();
    }
}