package hello;

public class Greeting {

    private final long id;
    private final String content;
    private static final String template = "Вроде %s!";

    public Greeting(long id, String content) {
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