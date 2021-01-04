import static org.mockito.Mockito.*;

import knights.Knight;
import knights.Minstrel;
import knights.Quest;
import org.junit.Test;


public class KnightTest {
    @Test
    public void  knightShouldEmbarkOnQuest() throws Exception {
        Quest mockQuest1 = mock(Quest.class);
        Minstrel mockQuest2 = mock(Minstrel.class);
        Knight knight = new Knight(mockQuest1, mockQuest2);

        knight.embarkOnQuest();

        verify(mockQuest1, times(1)).embark();
    }
}
