package mongo;

/**
 * Class that represents the pricing detail for a product.
 * All prices are in US dollars.
 */
class PricingDetail {

    private double listPrice;

    private double MSRP;

    public PricingDetail(double listPrice, double msrp) {
        this.listPrice = listPrice;
        this.MSRP = msrp;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getMSRP() {
        return MSRP;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }
}
