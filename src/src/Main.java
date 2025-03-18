package src;

public class Main {
    public static void main(String[] args) {
        User user = new User("Алёна");
        user.report();

        // Используем новый класс UserPersister, который следует Принципу инверсии зависимостей
        UserPersister persister = new UserPersister(user);
        persister.save();
    }
}