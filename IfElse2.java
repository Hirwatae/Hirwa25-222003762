 class IfElse2{
    public static void main(String[] args) {
        int a=20;
        //the classfication of players according to their age .
        if (a <=12){
            System.out.println("The child is cadette");
        }
        
       else if (a>=13 && a<=17){
        System.out.println("The player is junior");
       }
       else if (a>=18){
        System.out.println("The player is senior");
       }
       else 
       System.out.println("the player is a master");
    }
}

