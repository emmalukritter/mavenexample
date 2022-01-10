public class firsttest {
    public boolean first(int i) {
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int second() {
        if (this.first(0)) {
            System.out.println("The following code need to execute");
            return 1;
        } else {
            System.out.println("Error code");
            return 0;
        }
    }

    public static void main(String[] args) {
        firsttest n = new firsttest();
        int i = n.second();
    }
}
