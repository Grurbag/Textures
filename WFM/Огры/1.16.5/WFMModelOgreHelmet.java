// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;

	public WFMModelOgreHelmet() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -28.0F, 1.0F);
		head.texOffs(0, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 0.5F, false);
		head.texOffs(72, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 1.1F, false);
		head.texOffs(0, 93).addBox(-4.5F, -12.0F, -5.5F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		head.texOffs(2, 83).addBox(-4.0F, -13.0F, -5.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}