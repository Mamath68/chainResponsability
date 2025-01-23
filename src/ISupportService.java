public interface ISupportService {
    void setNext(ISupportService next);

    void handleRequest(PresidentialOrder order);
}
