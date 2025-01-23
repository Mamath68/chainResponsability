public class SoldatSupport implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(PresidentialOrder order) {
        if (order.getGrade() == EGrade.SOLDAT) {
            order.setConclusion("A vos ordres caporal. Je commence de ce pas");
        } else {
            if (next != null) {
                next.handleRequest(order);
            } else {
                order.setConclusion("On as pas vraiment le choix, n'est-ce-pas ?");
            }
        }
    }
}
