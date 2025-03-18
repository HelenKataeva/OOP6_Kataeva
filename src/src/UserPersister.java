package src;

// Выносим логику сохранения в новый класс (Принцип единственной ответственности)
// Реализуем интерфейс Persistable для сохранения пользователей (Принцип разделения интерфейсов)
public class UserPersister implements Persistable {
    private final User user;

    public UserPersister(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Сохранение пользователя: " + user.getName());
    }
}