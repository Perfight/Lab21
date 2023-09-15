public class Main{
    public static void main(String[] args) {

        Group gr1 = new Group(" ");
        Group gr2 = new Group(" ");
        Group gr3 = new Group(" ");
        Group gr4 = new Group(" ");

        User us1 = new User("user 1");
        User us2 = new User("user 2");

        gr1.addObserver(us1);
        gr1.addObserver(us2);
        gr2.addObserver(us1);
        gr2.addObserver(us2);
        gr3.addObserver(us1);
        gr4.addObserver(us2);

        gr1.sendNotification("Новая запись в сообществе");
        gr2.sendNotification("Новости дня");
        gr3.sendNotification("Ученые обнаружили новый...");
        gr4.sendNotification("Пройди онлайн курсы SkillBox...");
    }
}
