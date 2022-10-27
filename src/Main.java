import uc1setstakebet.SetStakeBet;
import uc2checkwinorloss.CheckWin;
import uc3resign4day.ResignFortheDay;
import uc4check20days.TwentyDaysPlay;
import uc5totaldaywonlost.TotalDayWonLoss;
import uc6checkluckyunlucky.LuckyUnluckyDay;
import uc7continueorstop.ContinueorStop;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Gambling ");
        SetStakeBet set = new SetStakeBet();
        set.setStakeBet();
        CheckWin check = new CheckWin();
        check.checkWin();
        ResignFortheDay r = new ResignFortheDay();
        r.resignDay();
        TwentyDaysPlay t = new TwentyDaysPlay();
        t.twentyDaysOfPlay();
        TotalDayWonLoss td = new TotalDayWonLoss();
        td.twentyDaysOfPlay();
        LuckyUnluckyDay l = new LuckyUnluckyDay();
        l.checkLuck();
        ContinueorStop cs = new ContinueorStop();
        cs.continueStopPlay();
    }
}