package org.example;

public class StateORMemento {
    private String content;
    private String title;

    public StateORMemento(){
    }
    public StateORMemento(String content, String title){
        this.content = content;
        this.title = title;
    }

    public StateORMemento setContent(String content) {
        this.content = content;
        return this;
    }

    public StateORMemento setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
}
