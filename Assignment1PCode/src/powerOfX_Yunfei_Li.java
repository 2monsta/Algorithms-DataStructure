//CS5040    Assignment1    Yunfei Li
public class powerOfX_Yunfei_Li {

    public static int powerOfX(int base, int power){
        try {
            if (power <= 0) {
                return 1;   //base case
            } else {
                return base * powerOfX(base, power - 1);  //returns the base times the power until it reaches 0
            }
        }catch(Exception e){
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(powerOfX(2,4));          //returns 16
        System.out.println(powerOfX(2,6));          //returns 64
    }
}
