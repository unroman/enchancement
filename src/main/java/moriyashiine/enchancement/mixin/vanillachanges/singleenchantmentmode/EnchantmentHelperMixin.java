/*
 * All Rights Reserved (c) MoriyaShiine
 */

package moriyashiine.enchancement.mixin.vanillachanges.singleenchantmentmode;

import moriyashiine.enchancement.common.ModConfig;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {
	@Inject(method = "set", at = @At("HEAD"), cancellable = true)
	private static void enchancement$singleEnchantmentMode(Map<Enchantment, Integer> enchantments, ItemStack stack, CallbackInfo ci) {
		if (ModConfig.singleEnchantmentMode && stack.hasEnchantments()) {
			ci.cancel();
		}
	}
}
