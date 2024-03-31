package com.gfg.library.Library.Management.System.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    int authorId;
    String authorName;
    String authorEmail;
    String phoneNo;
    List<Book> bookList;
}
