package entity;

import exception.InvalidActionException;
import exception.RoyalRuntimeException;
import record.OutfitDetails;

import java.util.ArrayList;
import java.util.List;

public class Palace {
    private List<Person> people;

    public Palace() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (person == null) {
            throw new RoyalRuntimeException("Попытка добавить null в дворец.");
        }
        people.add(person);
        System.out.println(person.getName() + " зашел(а) во дворец.");
    }

    // Метод, имитирующий развитие событий, описанных в заданном отрывке
    public void simulateEvent() {
        System.out.println("\n=== Начало королевского события ===");

        // Определяем основных персонажей
        King king = null;
        Queen queen = null;
        Princess princess = null;
        MaidServant maid = null;
        InvitedKing invitedKingTemp = null;
        Trotti trotti = null;

        // Выбираем персонажей из списка
        for (Person p : people) {
            if (p instanceof King && !(p instanceof InvitedKing)) {
                king = (King) p;
            } else if (p instanceof Queen) {
                queen = (Queen) p;
            } else if (p instanceof Princess) {
                princess = (Princess) p;
            } else if (p instanceof MaidServant) {
                maid = (MaidServant) p;
            } else if (p instanceof InvitedKing) {
                invitedKingTemp = (InvitedKing) p;
            } else if (p instanceof Trotti) {
                trotti = (Trotti) p;
            }
        }

        // Создаем финальную копию для использования во внутреннем классе
        final InvitedKing finalInvitedKing = invitedKingTemp;

        // Король приглашает прибытие короля Криспина
        if (king != null && finalInvitedKing != null) {
            king.inviteKing(finalInvitedKing);
        }

        // Королева проводит свои действия: скупает материю, нашивает наряды и сжигает оставшийся материал
        if (queen != null) {
            queen.buyMaterial("материю");
            OutfitDetails outfitDetails = new OutfitDetails("современный", "шелк");
            queen.sewOutfitsForTrotti(5, outfitDetails);
            queen.burnRemainingMaterial("материю");
        }

        // Тротти надевает один из новых нарядов
        if (trotti != null && queen != null && !queen.getOutfits().isEmpty()) {
            try {
                trotti.wearOutfit(queen.getOutfits().get(0));
            } catch (InvalidActionException e) {
                System.out.println(e.getMessage());
            }
        }

        // Принцесса изначально надевает старый наряд
        if (princess != null) {
            Outfit oldOutfit = new Outfit(new OutfitDetails("старый", "хлопок"), false);
            try {
                princess.wearOutfit(oldOutfit);
            } catch (InvalidActionException e) {
                System.out.println(e.getMessage());
            }
        }

        // Локальный класс для моделирования прибытия короля Криспина
        class Arrival {
            public void performArrival() {
                if (finalInvitedKing != null) {
                    finalInvitedKing.act();
                } else {
                    System.out.println("Прибытие короля Криспина задерживается.");
                }
            }
        }

        Arrival arrival = new Arrival();
        arrival.performArrival();

        // Королева подговаривает злую служанку на злодеяние
        if (queen != null && maid != null && princess != null) {
            System.out.println(queen.getName() + " подговаривает " + maid.getName() + " на злодеяние.");
            try {
                maid.ruinOutfit(princess);
            } catch (InvalidActionException e) {
                System.out.println(e.getMessage());
            }
        }

        // Анонимный класс для комментария наблюдателя
        Runnable observerComment = new Runnable() {
            @Override
            public void run() {
                System.out.println("Наблюдатель: Принцесса вынуждена скрыться – печальное зрелище.");
            }
        };
        observerComment.run();

        // Принцесса прячется после утраты наряда
        if (princess != null) {
            princess.hide();
        }

        System.out.println("=== Конец королевского события ===\n");
    }
}
