package com.loggerService.loggerService.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * DocumentCash
 */
@Entity
@Table(name = "document_cash")
public class DocumentCash {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "document_name")
    private String Document_Name;

    @Column(name = "document_type")
    private String Document_Type;

    @Column(name = "document_price")
    private Integer Document_Price;

    public DocumentCash(String document_Name, String document_Type, Integer document_Price) {
        Document_Name = document_Name;
        Document_Type = document_Type;
        Document_Price = document_Price;
    }

    public String getDocument_Name() {
        return Document_Name;
    }

    public void setDocument_Name(String document_Name) {
        Document_Name = document_Name;
    }

    public String getDocument_Type() {
        return Document_Type;
    }

    public void setDocument_Type(String document_Type) {
        Document_Type = document_Type;
    }

    public Integer getDocument_Price() {
        return Document_Price;
    }

    public void setDocument_Price(Integer document_Price) {
        Document_Price = document_Price;
    }

    @Override
    public String toString() {
        return "DocumentCash [Document_Name=" + Document_Name + ", Document_Price=" + Document_Price
                + ", Document_Type=" + Document_Type + ", Id=" + Id + "]";
    }



}