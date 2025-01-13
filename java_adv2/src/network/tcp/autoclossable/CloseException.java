package network.tcp.autoclossable;

public class CloseException extends Exception{

    public CloseException(String message) {
        super(message);
    }
}
