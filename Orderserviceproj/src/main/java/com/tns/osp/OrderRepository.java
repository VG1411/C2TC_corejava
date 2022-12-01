package com.tns.osp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.osp.Order;
@Repository

public interface OrderRepository extends JpaRepository<Order, Integer > {

}
