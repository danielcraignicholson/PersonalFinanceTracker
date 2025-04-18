package com.github.danielcraignicholson;

public class Bills {

  private double mortgage;
  private double propertyManagement;
  private double serviceCharge;
  private double creditCard;
  private double lifeInsurance;
  private double spotify;
  private double currentAccount;
  private double total;

  public double getMortgage() {
    return mortgage;
  }

  public void setMortgage(double mortgage) {
    this.mortgage = mortgage;
  }

  public double getPropertyManagement() {
    return propertyManagement;

  }

  public void setPropertyManagement(double propertyManagement) {
    this.propertyManagement = propertyManagement;
  }

  public double getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(double serviceCharge) {
    this.serviceCharge = serviceCharge;

  }

  public double getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(double creditCard) {
    this.creditCard = creditCard;
  }

  public double getLifeInsurance() {
    return lifeInsurance;
  }

  public void setLifeInsurance(double lifeInsurance) {
    this.lifeInsurance = lifeInsurance;
  }

  public double getSpotify() {
    return spotify;
  }

  public void setSpotify(double spotify) {
    this.spotify = spotify;

  }

  public double getCurrentAccount() {
    return currentAccount;
  }

  public void setCurrentAccount(double currentAccount) {
    this.currentAccount = currentAccount;

  }

  public double getTotal() {
    total =
        mortgage
            + propertyManagement
            + serviceCharge
            + creditCard
            + lifeInsurance
            + spotify
            + currentAccount;
    return total;
  }
}
