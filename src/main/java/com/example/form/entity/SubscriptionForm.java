package com.example.form.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "subscription_forms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    // Pricing
    private String total;
    private String gstAmount;
    private String grandTotal;

    // Subscription details (flattened)
    private String websiteSEO;
    private String keywords;
    private String domainName;
    
    // Form Type and common price fields
    private String formType;
    private String priceRs;
    private String amount;

    // Renewal specific fields
    private String renewalItem1;
    private String renewalItem2;
    private String renewalItem3;
    private String renewalItem4;

    @Convert(converter = StringListConverter.class)
    @Column(name = "additional_plans")
    private List<String> additionalPlans;

    // Payment Info
    private String amountReceived;
    private String amountBalance;
    private String paymentAmountWords;
    private String bankName;
    private String chequeNumber;
    private String chequeDate;
    private String paymentMode;

    // Signatures (Stored as strings/placeholders)
    private String customerSig;
    private String executiveSig;
}
