package com.loggerService.loggerService.Controller;

import com.loggerService.loggerService.Models.DocumentCash;
import com.loggerService.loggerService.Models.DocumentCashList;
import com.loggerService.loggerService.Models.ResponseModel;
import com.loggerService.loggerService.Repository.DocumentCashRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DocumentCashController
 */

@RestController
@RequestMapping("/api/documentCashV1")
public class DocumentCashController {

    @Autowired
    private DocumentCashRepository documentRepository;


    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) 
    public ResponseModel insertDocument(@RequestBody DocumentCash documentCash) {
        documentRepository.save(documentCash);
        ResponseModel response = new ResponseModel(true, "Başarıyla kayıt oluşturulmuştur");
        return response;
    }

    @RequestMapping("/getAll")
    public DocumentCashList getAllDocumnet() {
        DocumentCashList cashlist = new DocumentCashList();
        cashlist.setStatus(true);
        cashlist.setMessage("Başarıyla sonuçlanmıştır");
        
        return cashlist;
    }
}