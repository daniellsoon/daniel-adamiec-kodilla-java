package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
            .forEach(n -> library.getBooks().add(new Book("BookTitle"+n,"BookAuthor"+n, LocalDate.now().minusYears(n))));

        //When
        Library libraryShallowCloned = null;
        try {
            libraryShallowCloned = library.shallowCopy();
            libraryShallowCloned.setName("ShallowLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library libraryDeepCloned = null;
        try {
            libraryDeepCloned = library.deepCopy();
            libraryDeepCloned.setName("DeepLibrary");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(new Book("Book", "Book", LocalDate.now()));

        //Then
        System.out.println("No Cloned Board:");
        System.out.println(library.getBooks().toString());
        Assert.assertEquals(11, library.getBooks().size());

        System.out.println("Shallow Cloned:");
        System.out.println(libraryShallowCloned.getBooks().toString());
        Assert.assertEquals(11, libraryShallowCloned.getBooks().size());

        System.out.println("Deep Cloned:");
        System.out.println(libraryDeepCloned.getBooks().toString());
        Assert.assertEquals( 10, libraryDeepCloned.getBooks().size());

        Assert.assertEquals(library.getBooks(), libraryShallowCloned.getBooks());
        Assert.assertNotEquals(library.getBooks(), libraryDeepCloned.getBooks());
    }
}
