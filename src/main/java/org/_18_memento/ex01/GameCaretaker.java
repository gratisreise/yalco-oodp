package org._18_memento.ex01;

import java.util.ArrayList;
import java.util.List;

// Caretaker
class GameCaretaker {
    private List<GameMemento> mementoList = new ArrayList<>();

    public void add(GameMemento state) {
        mementoList.add(state);
    }

    public GameMemento get(int index) {
        return mementoList.get(index);
    }
}