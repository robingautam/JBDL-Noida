package com.gfg.library.Library.Management.System.service;

import com.gfg.library.Library.Management.System.controllers.TransactionDAO;
import com.gfg.library.Library.Management.System.request.BookTransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionDAO transactionDAO;


    public boolean issueBook(BookTransactionRequest request){

        // Add Builder pattern and then pass the object

        int row= transactionDAO.issueBookToStudent(request);
        if (row>0){
            return true;
        }
        return false;
    }
}
