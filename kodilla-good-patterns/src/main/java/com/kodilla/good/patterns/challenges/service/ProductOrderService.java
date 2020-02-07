package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.service.controller.SellRequest;
import com.kodilla.good.patterns.challenges.service.information.InformationService;
import com.kodilla.good.patterns.challenges.service.repository.Repository;
import com.kodilla.good.patterns.challenges.service.repository.SellDto;
import com.kodilla.good.patterns.challenges.service.selling.SellService;

public class ProductOrderService {

    private InformationService informationService;
    private SellService sellService;
    private Repository repository;


    public ProductOrderService(final InformationService informationService,
                               final SellService sellService,
                               final Repository repository) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.repository = repository;
    }

    public SellDto process(final SellRequest sellRequest) {
        boolean isSold = sellService.sell(sellRequest.getUser(), sellRequest.getDateOfOrder(), sellRequest.getDeliveryAddress(),
                sellRequest.getProduct());

        if(isSold && sellRequest.onStock()) {
            informationService.inform(sellRequest.getUser());
            repository.createRental(sellRequest.getUser(), sellRequest.getProduct(), sellRequest.getDateOfOrder(), sellRequest.getDeliveryAddress());
            return new SellDto(sellRequest.getUser(), sellRequest.getProduct(), true);
        } else {
            return new SellDto(sellRequest.getUser(), sellRequest.getProduct(),  false);
        }
    }

}
