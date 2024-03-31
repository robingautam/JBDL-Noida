package com.gfg.library.Library.Management.System.controllers;

import com.gfg.library.Library.Management.System.request.BookTransactionRequest;
import com.gfg.library.Library.Management.System.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @PostMapping
    @RequestMapping("/book/issue")
    public boolean issueBook(@RequestBody (required = false) BookTransactionRequest bookIssueRequest){
        return transactionService.issueBook(bookIssueRequest);
    }
}
