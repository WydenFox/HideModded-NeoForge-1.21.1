package github.ciluqwq.hidemodded.mixin.client;

import github.ciluqwq.hidemodded.Config;
import net.minecraft.util.ModCheck;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ModCheck.class)
public class HideModdedMixin {
    @Inject(method = "shouldReportAsModified", at = @At("HEAD"), cancellable = true)
    private void hidemodded$onShouldReportAsModified(CallbackInfoReturnable<Boolean> cir) {
        if (Config.shouldHideModded()) {
            cir.setReturnValue(false);
        }
    }
}
