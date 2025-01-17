package boazy.learn.designpattern.factory.factorymethod;

import boazy.learn.designpattern.factory.House82Impl;
import boazy.learn.designpattern.factory.IHouse;

/**
 * 工厂方法模式（82栋房子工厂）
 *
 * @author boazy
 * @date 2018/8/5
 */
public class House82FactoryMethod implements HouseFactoryMethod {
    @Override
    public IHouse createInstance() {
        return new House82Impl();
    }
}
