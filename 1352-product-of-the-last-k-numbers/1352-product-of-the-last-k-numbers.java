class ProductOfNumbers {

    ArrayList<Integer> li = new ArrayList<>();

    public ProductOfNumbers() {
        // No need to create another object here
    }

    public void add(int num) {
        li.add(num);
    }

    public int getProduct(int k) {

        int n = li.size();
        if (k > n) return 0;

        int prod = 1;

        // Multiply the last k numbers
        for (int i = n - 1; i >= n - k; i--) {
            prod *= li.get(i);
        }

        return prod;
    }
}
// note