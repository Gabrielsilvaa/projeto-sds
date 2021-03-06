package com.gabriel.dsvendas.service;

import com.gabriel.dsvendas.dto.SaleDTO;
import com.gabriel.dsvendas.dto.SaleSuccessDTO;
import com.gabriel.dsvendas.dto.SaleSumDTO;
import com.gabriel.dsvendas.entity.Sale;
import com.gabriel.dsvendas.repository.SaleRepository;
import com.gabriel.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupBySaller(){
       return saleRepository.amountGroupBySaller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupBySaller(){
        return saleRepository.successGroupBySaller();
    }

}
