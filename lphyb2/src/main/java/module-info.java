/**
 * @author Walter Xie
 */
module lphyb2.lphy {
    requires transitive lphy.core;
    requires transitive lphy.base;



    // declare what service interface the provider intends to use
    uses lphy.core.spi.Extension;
    provides lphy.core.spi.Extension with lphyb2.lphy.spi.LPhyB2Impl;
}