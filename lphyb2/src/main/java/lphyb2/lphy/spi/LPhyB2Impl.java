package lphyb2.lphy.spi;

import lphy.base.spi.LPhyBaseImpl;
import lphy.core.model.BasicFunction;
import lphy.core.model.GenerativeDistribution;

import java.util.Arrays;
import java.util.List;

public class LPhyB2Impl extends LPhyBaseImpl {

    /**
     * Required by ServiceLoader.
     */
    public LPhyB2Impl() {    }

    @Override
    public List<Class<? extends GenerativeDistribution>> declareDistributions() {
        return Arrays.asList(  );
    }

    @Override
    public List<Class<? extends BasicFunction>> declareFunctions() {
        return Arrays.asList(  );
    }

    public String getExtensionName() {
        return "LPhy beast2";
    }
}

