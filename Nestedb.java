public class Nestedb {
    public static void main(String[] args) {
        //The variable term value is 6
        int term=6;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
