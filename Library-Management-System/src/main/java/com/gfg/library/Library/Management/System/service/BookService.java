package com.gfg.library.Library.Management.System.service;

import com.gfg.library.Library.Management.System.BookDAO.AuthorDAO;
import com.gfg.library.Library.Management.System.BookDAO.BookDAO;
import com.gfg.library.Library.Management.System.exceptions.BookAlreadyPresent;
import com.gfg.library.Library.Management.System.exceptions.BookNotFoundException;
import com.gfg.library.Library.Management.System.model.Book;
import com.gfg.library.Library.Management.System.request.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDAO bookDAO;

    @Autowired
    AuthorDAO authorDAO;

    public Book createBook(CreateBookRequest request) {
        String bookId = request.getBookId();
        String bookName = request.getBookName();
        String bookType = request.getBookType().toString();
        String authorEmail = request.getAuthorEmail();
        try {
            // check if book exists in the database;
            int status = bookDAO.findBookById(bookId);
            if (status > 0) {
                throw new BookAlreadyPresent("Book is Already present in the database");
            }
        }
        catch (Exception ex){
            System.out.println("Exception: "+ex);
        }

        int result = bookDAO.createBookInDatabase(bookId,bookName, bookType, authorEmail);
        if (result<=0){
            return null;
        }
        Book bookResult = CreateBookRequest.toBook(request);

        // Need to insert the author information in the database
        // 1. Need to check if the author exists in the database
       // int authorExist = authorDAO.findAuthorById(authorEmail);
        //if (authorExist<=0){
            // Author doesn't exist, creating a author
            authorDAO.createAuthor(CreateBookRequest.toAuthor(request));
       // }

        return bookResult;
    }
}
