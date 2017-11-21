package ru.deft;

import org.junit.Test;
import ru.deft.Glava1.BraveKnight;
import ru.deft.Glava1.Quest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class); // Создание фиктивного объекта Quest
        BraveKnight knight = new BraveKnight(mockQuest); // внедрение
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }
}
