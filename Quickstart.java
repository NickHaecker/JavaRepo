class QuickStart {
    private static int[] intArr = { 5, 24, 18, 76 };

    public void tauschValue(int index) {
        for (int i = 0; i <= intArr.length - 1; i++) {
            if (i == index) {
                int k = intArr[i];
                int g = -1;
                if (i - 1 >= 0) {
                    g = intArr[i - 1];
                }
                if (g != -1) {
                    intArr[i] = g;
                    intArr[i - 1] = k;
                }
            }
        }
    }

    public static void main(String[] args) {
        QuickStart wt = new QuickStart();

        System.out.println("vorher:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        wt.tauschValue(-1);
        System.out.println("\nnachher:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }
}