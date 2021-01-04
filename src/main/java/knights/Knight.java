package knights;

public class Knight {
    private Quest quest;
    private Minstrel minstrel;

    public Knight(Quest quest, Minstrel minstrel){
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public Knight(SlayDragonQuest slayDragonQuest) {
    }

    public void embarkOnQuest() throws Exception{
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
