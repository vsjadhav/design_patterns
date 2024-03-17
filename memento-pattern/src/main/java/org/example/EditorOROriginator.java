package org.example;

public class EditorOROriginator {
    private String content = "";
    private String title = "";
    private HistoryORCaretaker history = new HistoryORCaretaker();

    public EditorOROriginator(){
        history.push(new StateORMemento());
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        history.push(new StateORMemento(this.content, title));
        this.content = content;
    }

    public void setTitle(String title) {
        history.push(new StateORMemento(content, this.title));
        this.title = title;
    }

    public void undo(){
        StateORMemento prevState = history.pop();
        this.content = prevState.getContent();
        this.title = prevState.getTitle();
    }

    public void print(){
        System.out.println("content: "+content +"   title: "+title);
    }
}
