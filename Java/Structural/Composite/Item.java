class Item implements ComponentInterface {
    private int price;

    public Item(int price) {
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }
}