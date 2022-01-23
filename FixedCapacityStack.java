package com.company.selfprep;

/******************************************************************************
 *  Generic stack implementation with a fixed-size array.
 *
 *  Remark:  bare-bones implementation. Does not do repeated
 *  doubling or null out empty array entries to avoid loitering.
 *
 ******************************************************************************/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FixedCapacityStack<Item> implements Iterable<Item> {

    private final Item[] a;    // holds the items
    private int N;       // number of items in stack

    // create an empty stack with given capacity
    public FixedCapacityStack(int capacity) {
        a = (Item[]) new Object[capacity];   // no generic array creation
        N = 0;
    }

    public boolean isEmpty() {return N == 0;}

    public void push(Item item) {a[N++] = item;}

    public Item pop() {return a[-- N];}

    public Iterator<Item> iterator() {return new ReverseArrayIterator();}

    public class ReverseArrayIterator implements Iterator<Item> {

        private int i = N - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public Item next() {
            if (! hasNext())
                throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}



