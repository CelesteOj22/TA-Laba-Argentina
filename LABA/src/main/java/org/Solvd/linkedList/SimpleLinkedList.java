package org.Solvd.linkedList;

public class SimpleLinkedList {
        private Node first;
        private int elem;
        public SimpleLinkedList(){
            first = null;
            elem = 0;
        }

        public void insertFirst (int elem){
            Node newNode = new Node (elem, first);
            first = newNode;
            elem++;
        }

        public void insertLast (int elem){
            Node newNode = new Node(elem, null);
            if (first == null){
                first = newNode;
            }
            else {
                Node current = first;
                while (current.getNext()!= null){
                    current= current.getNext();

                }
                current.setNext(newNode);
                elem++;
            }
        }
    public void delete (int elem) throws EmptyListException{
        if (first == null)
            throw new EmptyListException("Empty List");
        else
        if (first.getElement()== elem){
            first = first.getNext();
            elem--;
        }
        else {
            Node current = first;
            while (current.getNext()!=null && current.getNext().getElement() != elem)
                current = current.getNext();
            if (current.getNext()== null )
                System.out.println ("element "+elem+" is not on the list");
            else{
                current.setNext(current.getNext().getNext());
                elem--;
            }
        }
    }
    public void toList(){
        Node current = first;
        while (current.getNext()!= null){
            System.out.println(current.getElement());
            current = current.getNext();

        }
        System.out.println(current.getElement());
    }
}
