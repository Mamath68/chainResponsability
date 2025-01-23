public class CaporalSupport implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(PresidentialOrder order) {
        if (order.getGrade() == EGrade.CAPORAL) {
            order.setConclusion("A vos ordres mon sergent. je ferais transmettre les ordres.");
        } else {
            if (next != null) {
                next.handleRequest(order);
            }
        }
    }
}
