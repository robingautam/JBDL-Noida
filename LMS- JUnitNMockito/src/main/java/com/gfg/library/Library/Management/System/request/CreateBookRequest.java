package com.gfg.library.Library.Management.System.request;

import com.gfg.library.Library.Management.System.model.Author;
import com.gfg.library.Library.Management.System.model.Book;
import com.gfg.library.Library.Management.System.model.BookType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateBookRequest {
    String bookId;
    String bookName;
    BookType bookType;
    String authorName;
    String authorEmail;
    String authorNumber;

    public static Book toBook(CreateBookRequest request){
        Book book = Book.builder().bookName(request.getBookName())
                .bookId(Integer.parseInt(request.getBookId()))
                .bookType(request.getBookType()).build();
        return book;
    }

    public static Author toAuthor(CreateBookRequest request){
        Author author = Author.builder().authorEmail(request.getAuthorEmail())
                .authorName(request.getAuthorName()).phoneNo(request.getAuthorNumber()).build();
        return author;
    }
}
