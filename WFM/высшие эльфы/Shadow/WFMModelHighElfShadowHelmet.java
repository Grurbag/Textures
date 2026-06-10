// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelHighElfShadowHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public WFMModelHighElfShadowHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -2.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 1.0F, false);
		Head.texOffs(14, 45).addBox(-5.0F, -2.0F, -6.0F, 10.0F, 5.0F, 11.0F, 0.2F, false);
		Head.texOffs(32, 18).addBox(-4.0F, -13.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		Head.texOffs(56, 61).addBox(-1.5F, -13.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.1F, false);
		Head.texOffs(56, 57).addBox(-1.5F, -15.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.1F, false);
		Head.texOffs(56, 55).addBox(-1.5F, -16.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.1F, false);
		Head.texOffs(35, 28).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Head.texOffs(39, 36).addBox(-2.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Head.texOffs(42, 41).addBox(-1.0F, -17.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.texOffs(0, 51).addBox(-3.5F, -10.0F, -5.2F, 7.0F, 13.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}