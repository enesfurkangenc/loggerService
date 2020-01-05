package com.loggerService.loggerService.Models;

import java.util.List;

/**
 * DocumentCashList
 */
public class DocumentCashList {

    private List<DocumentCash> DocumentLists;
    private Boolean Status;
    private String Message;

    public List<DocumentCash> getDocumentLists() {
        return DocumentLists;
    }

    public void setDocumentLists(List<DocumentCash> documentLists) {
        DocumentLists = documentLists;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    
}