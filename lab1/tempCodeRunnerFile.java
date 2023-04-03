    public static int nextNumber(int n) {
        if (n  == 128) {
            return 1;
        } else if (n == 5) {
            return 3 * n + 1;
        } else {
            return n * 2;
        }
    }