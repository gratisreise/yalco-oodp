package org._24_iterator.ex02;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

// BreadthFirstIterator class
class BreadthFirstIterator implements FileSystemIterator {
    private Queue<FileSystemItem> queue = new LinkedList<>();

    public BreadthFirstIterator(Directory root) {
        queue.offer(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public FileSystemItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        FileSystemItem current = queue.poll();
        if (current instanceof Directory) {
            queue.addAll(((Directory) current).getContents());
        }
        return current;
    }
}