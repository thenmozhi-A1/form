package com.example.form.repository;

import com.example.form.entity.SubscriptionForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionFormRepository extends JpaRepository<SubscriptionForm, Long> {
}
