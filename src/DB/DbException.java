package DB;

public class DbException extends Throwable {
    private static final long serialVersionUID = 1L;

    public DbException(String msg) {
        super(msg);
    }
}
