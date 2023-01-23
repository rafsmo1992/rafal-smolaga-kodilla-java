package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author 1", "Title 1", 2011, "a1"));
        books.add(new Book("Author 2", "Title 2", 2012, "b1"));
        books.add(new Book("Author 3", "Title 3", 2003, "c1"));
        books.add(new Book("Author 4", "Title 4", 1544, "d1"));
        books.add(new Book("Author 5", "Title 5", 1945, "e1"));
        books.add(new Book("Author 6", "Title 6", 2019, "f1"));
        books.add(new Book("Author 7", "Title 7", 2025, "g1"));
        books.add(new Book("Author 8", "Title 8", 1756, "h1"));
        books.add(new Book("Author 9", "Title 9", 2023, "i1"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int mediana = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2011, mediana);
    }
}