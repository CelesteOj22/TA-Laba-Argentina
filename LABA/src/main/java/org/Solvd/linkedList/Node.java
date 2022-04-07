package org.Solvd.linkedList;

public class Node{
        private int element;
        private Node next;

        public Node (int elem, Node next){
            this.element = elem;
            this.next = next;
        }
        public int getElement(){
            return this.element;
        }
        public Node getNext(){
            return this.next;
        }
        public void setElement(int elem){
            this.element = elem;
        }
        public void setNext(Node next){
            this.next = next;
        }
}



