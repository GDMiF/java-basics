public class Members {

    String name;
    static int numberOfMembers;

    Members(String name){
        this.name = name;
        numberOfMembers ++;
    }

    static void showFriend(){
        System.out.println("You have " + numberOfMembers + " Freinds");
    }

}
