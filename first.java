class first {
    public static void main(String[] args) {
        int x = 6;
        for (int i = 1; i <= x; i++) {
            int strt = 1;
            if (i % 2 == 0) {
                strt = 0;
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(strt);
                strt = 1 - strt;
            }
            System.out.print("\n");
        }
    }

}