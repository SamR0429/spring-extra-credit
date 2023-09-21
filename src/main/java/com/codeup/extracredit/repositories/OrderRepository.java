package com.codeup.extracredit.repositories;

import com.codeup.extracredit.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
