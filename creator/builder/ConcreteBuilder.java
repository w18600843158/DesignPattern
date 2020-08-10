package creator.builder;

public class ConcreteBuilder implements Builder {
    private Product product;

    ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildBasic() {
        product.setBasic("打好基础");
    }

    @Override
    public void buildWalls() {
        product.setWall("砌墙");
    }

    @Override
    public void roofed() {
        product.setRoofed("封顶大吉");
    }

    // 返回生成的产品

    @Override
    public Product buildProduct() {
        return product;
    }

}
