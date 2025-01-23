public class SergentSupport implements ISupportService {
    private ISupportService next = null;

    @Override
    public void setNext(ISupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(PresidentialOrder order) {
        if (order.getGrade() == EGrade.SERGENT) {
            order.setConclusion("à vos ordres mon général, je transmets les ordres");
        } else {
            if (next != null) {
                next.handleRequest(order);
            }
        }
    }
}
