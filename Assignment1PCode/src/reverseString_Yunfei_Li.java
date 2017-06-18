//CS5040    Assignment1     Yunfei Li
public class reverseString_Yunfei_Li {
    public static char head(String str){
        return str.charAt(0);    //finds the first character of the string
    }
    public static String tails(String str){
        return str.substring(1); //finds the string minus the first character of the string
    }

    public static String reverse(String str){
        try {
            if (str.length() <= 0) {  //base case
                return "";
            } else {
                return reverse(tails(str)) + head(str); //returns reverse of the remaining string plus the first character of the string
            }
        }catch(Exception e){
            return "something bad happened";
        }
    }


    public static void main(String[] args) {
        System.out.println(reverse("blahblahblah"));        //returns halbhalbhalb
        System.out.println(reverse("This is a test."));     //returns .tset a si sihT
        System.out.println(reverse("racecar"));             //returns racecar




    }
}
