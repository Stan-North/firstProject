package homework2.office;

public class Secretary {
    public void askTowWait(Boss boss, Manager manager, Security security) {
        System.out.println(boss.getName() + " не волнуйтесь, " + manager.getName() + " все успеет. "
                + security.getName() + " - подождите!");
    }
}
