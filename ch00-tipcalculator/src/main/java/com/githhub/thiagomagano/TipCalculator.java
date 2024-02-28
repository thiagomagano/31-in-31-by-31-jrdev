package com.githhub.thiagomagano;

public class TipCalculator {
        double billAmount;
        
        int tipRate;
        
        double tipValue;
        
        double billTotal;

        public double calculateTip(double billAmount, int tipRate){
            double tipRatePercentage = tipRate / 100.00;
            return billAmount * tipRatePercentage;
        }

        public double calculateTotalBill(double billAmount, double tipValue){
            return billAmount + tipValue;
        }
        
        public TipCalculator(double billAmount, int tipRate) {
            this.billAmount = billAmount;
            this.tipRate = tipRate;
            this.tipValue = calculateTip(billAmount, tipRate);
            this.billTotal = calculateTotalBill(billAmount, this.tipValue);
        }
            
}
