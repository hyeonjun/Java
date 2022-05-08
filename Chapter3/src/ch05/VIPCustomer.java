package ch05;

public class VIPCustomer extends Customer {
    private int agentId;
    private double salesRatio;

    public VIPCustomer() {}

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        this.agentId = agentId;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int) (price - price * salesRatio);
    }

    @Override
    public String info() {
        return super.info() +", " + " 담당 상담원 번호는 " + agentId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }
}
