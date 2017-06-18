//CS5040    Assignment1     Yunfei Li
public class ConvertDeciman_Yunfei_Li {
    public static int last(int n){
        return n%2;
    } //mod by 2 to find the remainder
    public static int first(int n){
        return n/2;
    }//divide by 2 to find the remaining numbers
    public static String convertToBinary(int n) {
        try {
            if (n<= 0) {
                return "";  //base case
            } else {
                return convertToBinary(first(n)) + last(n);  //returns the remaining numbers after the last digit plus the last digit
            }
        } catch (Exception e) {
            return "Something Bad Happened";
        }

    }

    public static void main(String[] args) {

        System.out.println(convertToBinary(12)); //returns 1100
        System.out.println(convertToBinary(20)); //returns 10100

    }
}
