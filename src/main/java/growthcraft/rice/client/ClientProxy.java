package growthcraft.rice.client;

import growthcraft.rice.common.CommonProxy;
import growthcraft.rice.common.Init;

public class ClientProxy extends CommonProxy {
    @Override
    public void init() {
        super.init();
        Init.registerItemColorHandlers();
        registerSpecialRenders();
    }

    @Override
    public void postRegisterItems() {
        super.postRegisterItems();
        registerModelBakeryVariants();
    }

    public void registerModelBakeryVariants() {
        Init.registerItemVariants();
    }

    public void registerSpecialRenders() {

    }
}
