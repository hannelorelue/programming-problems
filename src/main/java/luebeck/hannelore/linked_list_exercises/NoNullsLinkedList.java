package luebeck.hannelore.linked_list_exercises;

import java.lang.Integer;

public class NoNullsLinkedList {

    int size;
    node head, tail;
    private class node {
        int value;
        node next;
        private node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private node createNode(int value) {
        return new node(value);
    }

    private node getPlaceHOlderNode() {
        return new node(Integer.MAX_VALUE);
    }

    private boolean isPlaceholderNode(node n ) {
        return n.value == Integer.MAX_VALUE;
    }

    public NoNullsLinkedList() {
        head = getPlaceHOlderNode();
        tail = head;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add_first (int value) {
        node n = new node(value);

        if(isPlaceholderNode(head)) {
            tail = n;
        }

        n.next = head;
        head = n;
        size++;
    }

    public void remove_first(){
        if (getSize() > 0) {
            //node current = head;
            head = head.next;
            if(getSize()==1) {
                tail = head;
            }
            size--;
        }
    }

    public void add_last(int value) {
        node n = new node(value);
        if (isPlaceholderNode(head) && isPlaceholderNode(tail)) {
            head = n;
            n.next = tail;
            tail = n;
        } else {
            node pn = tail.next;
            tail.next = n;
            n.next = pn;
            tail = n;
        }
        size++;
    }

    public void remove_last() {
        if (getSize() > 0) {
            if (getSize() ==1) {
                node current = head;
                head = current.next;
                tail = current.next;
                size--;
            } else {
                node prev = head;
                for (int i = 0; i < getSize() -2; i++){
                    prev = prev.next;
                }
                node current = prev.next;
                prev.next = current.next;
                tail = prev;
                size--;
            }

        } else {
            System.out.println("Error: List is empty");
        }
    }

    public void insert_at(int index, int value) {
        if(index == 0 || getSize() == 0) {
            add_first(value);
        } else if(index > 0 && index < getSize()) {
            node n = new node(value);
            node current = head;
            for(int i = 0; i< index - 1; ++i) {
                current = current.next;
            }
            node temp = current.next;
            current.next = n;
            n.next = (temp);
            size++;
        } else {
            System.out.println("Invalid index");
        }
    }

    public void remove_at(int index) {
        if(index >= 0 && index < getSize()) {
            if(index == 0) {
                remove_first();
            } else if(index == getSize()-1) {
                remove_last();
            } else {
                node prev = head;
                for(int i = 0; i< index-1; ++i)
                    prev = prev.next;
                node current = prev.next;
                prev.next = current.next;
                size--;
            }
        }
        else
            System.out.println("Invalid index");
    }

}
