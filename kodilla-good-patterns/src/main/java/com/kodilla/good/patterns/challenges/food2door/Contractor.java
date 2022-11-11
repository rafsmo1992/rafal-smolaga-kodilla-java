package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Contractor implements OrderInterface {

    private String contractorName;
    private String isContractorAvaible;

    public Contractor(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getContractorName() {
        return contractorName;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractorName='" + contractorName + '\'' +
                '}';
    }

    public String welcomeToTheShop() {
        if (contractorName != "" && contractorName != null) {
            isContractorAvaible = "Thank you for your purchase! Best Regards: " + contractorName;
        } else {
            isContractorAvaible = "Sorry, this supplier is not our Contractor!";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public String process() {

        if (contractorName != "" && contractorName != null) {
            isContractorAvaible = "Thank you for your purchase! Best Regards " + contractorName + ".";
        } else {
            isContractorAvaible = "Sorry, this supplier is not our Contractor!";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public List orderList() {
        return null;
    }
}