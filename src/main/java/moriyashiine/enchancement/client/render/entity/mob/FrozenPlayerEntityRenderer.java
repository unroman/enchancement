/*
 * All Rights Reserved (c) MoriyaShiine
 */

package moriyashiine.enchancement.client.render.entity.mob;

import moriyashiine.enchancement.common.entity.mob.FrozenPlayerEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FrozenPlayerEntityRenderer extends BipedEntityRenderer<FrozenPlayerEntity, BipedEntityModel<FrozenPlayerEntity>> {
	public final BipedEntityModel<FrozenPlayerEntity> defaultModel, slimModel;

	public FrozenPlayerEntityRenderer(EntityRendererFactory.Context ctx) {
		super(ctx, new BipedEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER)), 0.5F);
		defaultModel = model;
		slimModel = new BipedEntityModel<>(ctx.getPart(EntityModelLayers.PLAYER_SLIM));
	}

	@Override
	public Identifier getTexture(FrozenPlayerEntity entity) {
		return DefaultSkinHelper.getTexture();
	}
}
