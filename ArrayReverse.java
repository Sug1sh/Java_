class ArrayReverse {
    public static void main(String[] args) {

        int[] a = {5, 2, 6, 7, 4, 1};

        System.out.println("Array elements in reverse order:");

        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
