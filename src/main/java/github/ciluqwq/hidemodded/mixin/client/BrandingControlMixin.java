package github.ciluqwq.hidemodded.mixin.client;

import com.google.common.collect.Lists;
import github.ciluqwq.hidemodded.Config;
import net.minecraft.DetectedVersion;
import net.neoforged.fml.ModList;
import net.neoforged.fml.i18n.FMLTranslations;
import net.neoforged.neoforge.forge.snapshots.ForgeSnapshotsMod;
import net.neoforged.neoforge.internal.BrandingControl;
import net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

@Mixin(value = BrandingControl.class, remap = false)
public class BrandingControlMixin {
    @Inject(method = "forEachLine", at = @At("HEAD"), cancellable = true)
    private static void hidemodded$onForEachLine(boolean includeMC, boolean reverse, BiConsumer<Integer, String> lineConsumer, CallbackInfo ci) {
        if (!Config.shouldHideModCounter() && !Config.shouldHideAllBranding()) {
            return;
        }

        ci.cancel();

        List<String> lines = new ArrayList<>();
        if (includeMC) {
            lines.add("Minecraft " + DetectedVersion.BUILT_IN.getName());
        }

        if (!Config.shouldHideAllBranding()) {
            if (Config.shouldHideModCounter()) {
                // Show NeoForge brand without the mod counter
                lines.add(ForgeSnapshotsMod.BRANDING_NAME + ' ' + NeoForgeVersion.getVersion());
            } else {
                int modCount = ModList.get().size();
                lines.add(FMLTranslations.parseMessage("fml.menu.branding", ForgeSnapshotsMod.BRANDING_NAME + ' ' + NeoForgeVersion.getVersion(), modCount));
            }
        }

        if (reverse) {
            lines = Lists.reverse(lines);
        }

        for (int i = 0; i < lines.size(); i++) {
            lineConsumer.accept(i, lines.get(i));
        }
    }

    @Inject(method = "forEachAboveCopyrightLine", at = @At("HEAD"), cancellable = true)
    private static void hidemodded$onForEachAboveCopyrightLine(BiConsumer<Integer, String> lineConsumer, CallbackInfo ci) {
        if (Config.shouldHideAllBranding()) {
            ci.cancel();
        }
    }
}
