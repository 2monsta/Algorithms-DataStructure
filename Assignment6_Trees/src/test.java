/**
 * Created by yunfei on 9/15/17.
 */
public class test {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(problem5());
    }

    public static int problem5() {
        int i = 2520;
        boolean found = false;
        while (!found) {
            i += 2520;
            boolean isDividable = true;
            for (int j = 11; j <= 20; j++) {
                if (i % j != 0) {
                    isDividable = false;
                    break;
                }
            }
            if (isDividable) {
                found = true;
            }
        }
        return i;
    }
}

