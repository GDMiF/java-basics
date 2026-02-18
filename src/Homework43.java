public class Homework43 {
    public static void main(String[] args) {

        Members members1 = new Members("Spongebob");
        Members members2 = new Members("Patrick");
        Members members3 = new Members("SquidWard");
        Members members4 = new Members("Mr Carbs");


        System.out.println(members1.name);
        System.out.println(members2.name);
        System.out.println(members3.name);
        System.out.println(members4.name);

        System.out.println(Members.numberOfMembers);

        Members.showFriend();


    }
    }
