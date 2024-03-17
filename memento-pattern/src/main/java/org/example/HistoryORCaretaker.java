package org.example;

import java.util.ArrayList;

public class HistoryORCaretaker {
    private ArrayList<StateORMemento> history = new ArrayList<>();

    public HistoryORCaretaker(){}
    public void push(StateORMemento state){
        history.add(state);
    }

    public StateORMemento pop(){
        int lastIndex = history.size() -1;
        StateORMemento lastState = history.get(lastIndex);
        if (lastIndex > 0)
            history.remove(lastState);
        return lastState;
    }
}
