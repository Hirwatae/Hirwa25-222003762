public class switchcase {
    public static void main(String[] args) {
        //The program showinng the pregnant trimister 
        int weeks=40;
        switch(weeks){
            case 12:
            System.out.println("first trimister");
            break;
            case 13 - 27:
            System.out.println("second trimister");
            break;
            case 28 - 40:
            System.out.println("third timister");
            break;
            case 42:
            System.out.println("extra");
            break;
            default:System.out.println( "Not first, second third trimister or extra");
        }
    }
}
