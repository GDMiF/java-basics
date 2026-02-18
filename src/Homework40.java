public class Homework40 {
    public static void main(String[] args) {

    SurveyCorps surveyCorps1 = new SurveyCorps("Eren", 17, 3.2);
    SurveyCorps surveyCorps2 = new SurveyCorps("Mikasa", 17, 3.9);
    SurveyCorps surveyCorps3 = new SurveyCorps("Armin", 16, 4);

        System.out.println(surveyCorps1.name);
        System.out.println(surveyCorps2.name);
        System.out.println(surveyCorps3.name);

        System.out.println(surveyCorps1.isScout);

        surveyCorps1.isScout();
        surveyCorps2.isScout();
        surveyCorps3.isScout();

    }
}
