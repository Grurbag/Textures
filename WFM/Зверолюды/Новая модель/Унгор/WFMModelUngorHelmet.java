// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelUngorHelmet extends EntityModel<Entity> {
	private final ModelRenderer headArmour;

	public WFMModelUngorHelmet() {
		texWidth = 64;
		texHeight = 64;

		headArmour = new ModelRenderer(this);
		headArmour.setPos(0.0F, 0.0F, -1.0F);
		headArmour.texOffs(0, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.4F, false);
		headArmour.texOffs(32, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		headArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}