package lv.lesson12.service;

import lv.lesson12.Product;

public class ProductServiceImpTest {


    private ProductServiceImpl service;

    @Before
    public  void setUp() {
        service = new ProductServiceImpl();
    }
}
