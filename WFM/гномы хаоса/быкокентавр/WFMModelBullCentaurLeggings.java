// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBullCentaurLeggings extends EntityModel<Entity> {
	private final ModelRenderer body;

	public WFMModelBullCentaurLeggings() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(-0.5F, 2.5F, 7.5F);
		body.texOffs(0, 8).addBox(-8.0F, -5.5F, -15.5F, 17.0F, 19.0F, 31.0F, 0.51F, false);
		body.texOffs(0, 78).addBox(-8.0F, -5.5F, -15.5F, 17.0F, 19.0F, 31.0F, 0.7F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}