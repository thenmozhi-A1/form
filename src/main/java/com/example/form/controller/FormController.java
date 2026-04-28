package com.example.form.controller;

import com.example.form.entity.SubscriptionForm;
import com.example.form.entity.SubscriptionFormDTO;
import com.example.form.repository.SubscriptionFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forms")
@CrossOrigin(origins = "*") // Allow React Frontend from any local IP
public class FormController {

    @Autowired
    private SubscriptionFormRepository repository;

    @PostMapping
    public ResponseEntity<SubscriptionForm> submitForm(@RequestBody SubscriptionFormDTO dto) {
        SubscriptionForm form = new SubscriptionForm();
        
        // Map DTO to Entity
        form.setDate(dto.getDate());
        form.setCity(dto.getCity());
        form.setCompanyName(dto.getCompanyName());
        form.setAddress(dto.getAddress());
        form.setAddressLine2(dto.getAddressLine2());
        form.setContactPerson(dto.getContactPerson());
        form.setPinCode(dto.getPinCode());
        form.setEmailId(dto.getEmailId());
        form.setPhone(dto.getPhone());
        form.setGst(dto.getGst());
        form.setTotal(dto.getTotal());
        form.setGstAmount(dto.getGstAmount());
        form.setGrandTotal(dto.getGrandTotal());
        form.setDomainName(dto.getDomainName());
        form.setAmountReceived(dto.getAmountReceived());
        form.setAmountBalance(dto.getAmountBalance());
        form.setPaymentAmountWords(dto.getPaymentAmountWords());
        form.setBankName(dto.getBankName());
        form.setChequeNumber(dto.getChequeNumber());
        form.setChequeDate(dto.getChequeDate());
        form.setPaymentMode(dto.getPaymentMode());
        form.setCustomerSig(dto.getCustomerSig());
        form.setExecutiveSig(dto.getExecutiveSig());
        
        // Nested Subscription details
        if (dto.getSubscription() != null) {
            form.setWebsiteSEO(dto.getSubscription().getWebsiteSEO());
            form.setKeywords(dto.getSubscription().getKeywords());
            form.setAdditionalPlans(dto.getSubscription().getAdditionalPlans());
        }

        SubscriptionForm savedForm = repository.save(form);
        return ResponseEntity.ok(savedForm);
    }
}
