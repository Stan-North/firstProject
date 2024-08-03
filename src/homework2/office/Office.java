package homework2.office;

public class Office {
    Boss boss;
    Manager manager;
    Security security;
    Secretary secretary;

    public Office(Boss boss, Manager manager, Security security, Secretary secretary) {
        this.boss = boss;
        this.manager = manager;
        this.security = security;
        this.secretary = secretary;
    }

    public void workDay() {
        boss.hurryUp(manager);
        manager.shout();
        security.askMoney();
        secretary.askTowWait(boss, manager, security);
    }
}
