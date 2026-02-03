public class Main13 {
    public static void main(String[] args) {

        String name = "Password";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("i");
//        int lastIndex = name.lastIndexOf("f");
//
//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("i","l");

//        if(name.isEmpty()){
//            System.out.println("Your name is empty");
//        } else {
//            System.out.println("Hello " + name);
//        }

//        if(name.contains("M")){
//            System.out.println("Nice name");
//        } else {
//            System.out.println("Nice try");
//        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        } else {
            System.out.println("Hello " + name);
        }

    }
}
