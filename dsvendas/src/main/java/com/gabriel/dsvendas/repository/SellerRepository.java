package com.gabriel.dsvendas.repository;

import com.gabriel.dsvendas.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
