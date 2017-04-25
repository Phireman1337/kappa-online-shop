package mongo;


class ShippingDetail {

    private double weight;

    private double width;

    private double height;

    private double depth;

    public ShippingDetail(double weight, double width, double height, double depth) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
