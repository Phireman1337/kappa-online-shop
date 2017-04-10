package domain;


class Pricing {

    private double list;

    private double msrp;

    private String currency;

    public double getList() {
        return list;
    }

    public void setList(double list) {
        this.list = list;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
