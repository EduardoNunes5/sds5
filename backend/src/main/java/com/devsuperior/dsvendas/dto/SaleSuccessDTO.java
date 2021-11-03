package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO {
    private static final Long serialVersionUID = 1L;

    private String sellerName;
    private Long visits;
    private Long deals;

    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visits = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }
}
