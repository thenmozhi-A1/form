package com.example.form.entity;

import lombok.Data;
import java.util.List;

@Data
public class SubscriptionFormDTO {
    private String date;
    private String city;
    private String companyName;
    private String address;
    private String addressLine2;
    private String contactPerson;
    private String pinCode;
    private String emailId;
    private String phone;
    private String gst;
    private String total;
    private String gstAmount;
    private String grandTotal;
    private String domainName;
    private String amountReceived;
    private String amountBalance;
    private String paymentAmountWords;
    private String bankName;
    private String chequeNumber;
    private String chequeDate;
    private String paymentMode;
    private String customerSig;
    private String executiveSig;
    
    private SubscriptionDetails subscription;

    @Data
    public static class SubscriptionDetails {
        private String websiteSEO;
        private String keywords;
        private List<String> additionalPlans;
    }
}
