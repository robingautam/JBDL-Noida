package com.gfg.library.Library.Management.System.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    int id;
    int bookId;
    String bookName;
    int cost;
    BookType bookType;
    Author author;

}
