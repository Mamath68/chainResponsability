public class Main {
    public static void main(String[] args) {
        ISupportService general = new GeneralSupport();
        ISupportService sergent = new SergentSupport();
        ISupportService caporal = new CaporalSupport();
        ISupportService soldat = new SoldatSupport();

        general.setNext(sergent);
        sergent.setNext(caporal);
        caporal.setNext(soldat);

        PresidentialOrder orderA = new PresidentialOrder(EGrade.GENERAL, "Voici les ordres, nettoyez les barraquements avant la fin de semaine.");
        PresidentialOrder orderB = new PresidentialOrder(EGrade.SERGENT, "N'attendez pas la fin de semaine");
        PresidentialOrder orderC = new PresidentialOrder(EGrade.CAPORAL, "Plus vite que ça.");
        PresidentialOrder orderD = new PresidentialOrder(EGrade.SOLDAT, "Tu te bouge le derche oui!!!");

        general.handleRequest(orderA);
        general.handleRequest(orderB);
        general.handleRequest(orderC);
        general.handleRequest(orderD);

        System.out.println(orderA.getConclusion());
        System.out.println(orderB.getConclusion());
        System.out.println(orderC.getConclusion());
        System.out.println(orderD.getConclusion());

    }
}
