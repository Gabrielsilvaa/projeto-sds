package com.gabriel.dsvendas.repository;

import com.gabriel.dsvendas.entity.Sale;
import com.gabriel.dsvendas.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
