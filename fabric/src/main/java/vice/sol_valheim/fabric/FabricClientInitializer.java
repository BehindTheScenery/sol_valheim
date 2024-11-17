package vice.sol_valheim.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import vice.sol_valheim.SOLValheim;
import vice.sol_valheim.SOLValheimClient;

public class FabricClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SOLValheimClient.init();
        ItemTooltipCallback.EVENT.register(SOLValheim::addTooltip);
    }
}