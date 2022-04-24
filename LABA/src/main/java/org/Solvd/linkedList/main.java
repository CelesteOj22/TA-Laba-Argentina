package org.Solvd.linkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {
    private static final Logger LOGGER = LogManager.getLogger(main.class);
    public static void main(String args[]) {
        LOGGER.info("Start");
        SimpleLinkedList n1=new SimpleLinkedList();
        n1.insertFirst(2);
        n1.insertFirst(1);
        n1.insertLast(3);
        n1.insertLast(4);

        LOGGER.info("We list from main");
        n1.toList();

        LOGGER.info("delete an element");
        try {
            n1.delete(2);
            n1.delete(5);
        } catch (EmptyListException e) {
            LOGGER.error(e.getMessage());
            LOGGER.info(e.getMessage());
        }

        LOGGER.info("we list again");
        n1.toList();

    }
}
