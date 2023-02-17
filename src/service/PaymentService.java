package service;

import payments.PaymentStrategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    private PaymentStrategy strategy;

    public PaymentService(int cost, boolean includeDelivery) {
        this.cost = cost;
        this.includeDelivery = includeDelivery;
    }

    public void processOrder(){
        strategy.pay(getTotal());
    }

    private int getTotal() {
        return includeDelivery ? cost+10 : cost;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
