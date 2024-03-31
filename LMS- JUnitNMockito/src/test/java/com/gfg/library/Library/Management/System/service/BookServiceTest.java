package com.gfg.library.Library.Management.System.service;

import com.gfg.library.Library.Management.System.BookDAO.AuthorDAO;
import com.gfg.library.Library.Management.System.BookDAO.BookDAO;
import com.gfg.library.Library.Management.System.model.Book;
import com.gfg.library.Library.Management.System.model.BookType;
import com.gfg.library.Library.Management.System.request.CreateBookRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
class BookServiceTest {

    @InjectMocks
    BookService bookService;

    @Mock
    BookDAO bookDAO;

    @Mock
    AuthorDAO authorDAO;
    @Test
    void createBook() {
        when(bookDAO.createBookInDatabase(any(),any(),any(),any())).thenReturn(2);
        when(authorDAO.createAuthor(any())).thenReturn(2);
        CreateBookRequest createBookRequest = new CreateBookRequest();
        createBookRequest.setBookName("Java");
        createBookRequest.setBookType(BookType.GENERAL);
        createBookRequest.setBookId("1");
        createBookRequest.setAuthorName("John");
        createBookRequest.setAuthorEmail("john@gmail.com");

        Book expected = bookService.createBook(createBookRequest);

        Assertions.assertEquals("Java", expected.getBookName());
        Assertions.assertEquals("1", Integer.toString(expected.getBookId()));
    }
}