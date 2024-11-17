package vice.sol_valheim.mixin;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.SynchedEntityData;
import org.apache.commons.lang3.ObjectUtils;
import org.spongepowered.asm.mixin.Mixin;
import vice.sol_valheim.extenders.SynchedEntityDataExtender;

@Mixin(SynchedEntityData.class)
public abstract class SynchedEntityDataMixin implements SynchedEntityDataExtender {
    // There was 1.19.2 code, we support only 1.20.1+ right now. Deprecated and removed in 1.21.
}
