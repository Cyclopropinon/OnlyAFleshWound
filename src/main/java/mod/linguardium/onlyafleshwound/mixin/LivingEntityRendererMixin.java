package mod.linguardium.onlyafleshwound.mixin;

import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LivingEntityRenderer.class)
public class LivingEntityRendererMixin {
	@ModifyArg(method="getOverlay",at=@At(value="INVOKE",target="Lnet/minecraft/client/render/OverlayTexture;getV(Z)I"))
	private static boolean notHurtOverlay(boolean original) {
		return false;
	}
}