public class GeneralSupport implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(PresidentialOrder order) {
        if (order.getGrade() == EGrade.GENERAL) {
            order.setConclusion("Bien monsieurs le présidents. je transmets les ordres.");
        } else {
            if (next != null) {
                next.handleRequest(order);
            }
        }
    }
}
