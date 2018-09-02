package hello;

public class RestError {

    private final long id;
    private final String content;
    private static final String template = "Вот такая %s!";

    public RestError(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return String.format(template, content);
    }
}