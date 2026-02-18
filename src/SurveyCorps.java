public class SurveyCorps {

    String name;
    int age;
    double score;
    boolean isScout;

    SurveyCorps(String name, int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
        this.isScout = true;
    }

    void isScout(){
        System.out.println(this.name + " is future scout");
    }

}
