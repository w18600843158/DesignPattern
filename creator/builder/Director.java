package creator.builder;

/**
 * 指挥者,指挥创建
 */
public class Director {
    /**
     * 根据一个Builder, 建房子
     * @param builder
     * @return
     */
    public Product constructProduct(ConcreteBuilder builder) {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();

        // 生成产品并返回
        return builder.buildProduct();
    }
}
