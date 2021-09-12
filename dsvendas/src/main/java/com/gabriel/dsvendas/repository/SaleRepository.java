package com.gabriel.dsvendas.repository;

import com.gabriel.dsvendas.dto.SaleSuccessDTO;
import com.gabriel.dsvendas.dto.SaleSumDTO;
import com.gabriel.dsvendas.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.gabriel.dsvendas.dto.SaleSumDTO(sale.seller, SUM(sale.amount))" +
            "   FROM Sale AS sale GROUP BY sale.seller")
    List<SaleSumDTO> amountGroupBySaller();

    @Query("SELECT new com.gabriel.dsvendas.dto.SaleSuccessDTO(sale.seller, SUM(sale.visited), SUM(sale.deals))" +
            "   FROM Sale AS sale GROUP BY sale.seller")
    List<SaleSuccessDTO> successGroupBySaller();

}
