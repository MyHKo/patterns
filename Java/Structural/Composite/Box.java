class Box extends Item {
    ArrayList<Item> productList;

    public Box() {}

    public void put(Item product) {
        this.productList.add(product)
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(int i = 0; i < productList.length(); i++){
            price += productList.get(i).getPrice();
        }
    }
}
