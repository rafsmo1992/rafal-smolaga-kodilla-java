package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private Contractor contractor;
    private String product;
    private int quantity;


    public OrderDTO buyProcess(String contractorName, OrderDTO orderDTO) {

        CollectionContractors collectionContractors = new CollectionContractors();
        Contractor contractor = collectionContractors.getContractor(contractorName);

        contractor.orderList();


        if (contractor != null && contractor.getContractorName() != "") {
            System.out.println("Thank you for placing an order in " + contractor.getContractorName() + ". You have ordered " + orderDTO.productName + " in an amount of " + orderDTO.productQuantity + ".");
            contractor.process();
            return new OrderDTO("Bread", 12);
        } else {
            System.out.println("Please, select the valid supplier!");
            return null;
        }

    }
}