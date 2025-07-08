class Counter {
    static int count = 0;
    int id;

    Counter() {
        count++;
        id = count;
    }

    void showId() {
        System.out.println("Object ID: " + id);
    }

    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        a.showId();  // ?
        b.showId();  // ?
        System.out.println("Total objects: " + count);  // ?
    }
}
