package com.githhub.thiagomagano;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculator {
        double billAmount;
        
        int tipRate;
        
        double tipValue;
        
        double billTotal;

        public double calculateTip(double billAmount, int tipRate){
            double tipRatePercentage = tipRate / 100.00;
            return toNextCent(billAmount * tipRatePercentage);
        }

        public double calculateTotalBill(double billAmount, double tipValue){
            return billAmount + tipValue;
        }

        public double toNextCent(double value) {
            return Math.round(value * 100) / 100.0;
        }

        public BigDecimal toBigDecimal(double value) {
             BigDecimal bd = BigDecimal.valueOf(value);
             bd = bd.setScale(2, RoundingMode.HALF_UP);

             return bd;
        }
        
        public TipCalculator(double billAmount, int tipRate) {
            this.billAmount = billAmount;
            this.tipRate = tipRate;
            this.tipValue = calculateTip(billAmount, tipRate);
            this.billTotal = calculateTotalBill(billAmount, this.tipValue);
        }
            
}
