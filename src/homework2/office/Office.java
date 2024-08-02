package homework2.office;

public class Office {

    public void workDay(Boss boss, Manager manager, Security security, Secretary secretary) {
        boss.hurryUp(manager);
        manager.shout();
        security.askMoney();
        secretary.askTowWait(boss, manager, security);
    }
}
