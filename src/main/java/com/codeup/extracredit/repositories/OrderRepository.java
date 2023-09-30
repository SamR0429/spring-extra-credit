package com.codeup.extracredit.repositories;

import com.codeup.extracredit.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository <Order, Long> {

    @Query("from Order o where o.id like ?1")
    Order getOrderById(long id);

}
