import entity.*;

public class Main {
    public static void main(String[] args) {
        Palace palace = new Palace();

        // Создаем персонажей
        King king = new King("Король Артур");
        Queen queen = new Queen("Королева Гвиневра");
        Princess princess = new Princess("Эйприл");
        MaidServant maid = new MaidServant("Злая служанка");
        InvitedKing invitedKing = new InvitedKing("Криспин");
        Trotti trotti = new Trotti("Тротти");

        // Добавляем персонажей во дворец
        palace.addPerson(king);
        palace.addPerson(queen);
        palace.addPerson(princess);
        palace.addPerson(maid);
        palace.addPerson(invitedKing);
        palace.addPerson(trotti);

        // Запускаем сценарий события
        palace.simulateEvent();
    }
}
