package db;

public class DatabaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DatabaseException(String message, Exception e) {
        super(message, e);
    }
}
