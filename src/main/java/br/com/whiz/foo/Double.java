package br.com.whiz.foo;

public class Double {

    private final long id;
    private final String content;

    public Double(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
