// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBullCentaurBody extends EntityModel<Entity> {
	private final ModelRenderer handRight;
	private final ModelRenderer handLeft;
	private final ModelRenderer body;
	private final ModelRenderer body4;

	public WFMModelBullCentaurBody() {
		texWidth = 128;
		texHeight = 128;

		handRight = new ModelRenderer(this);
		handRight.setPos(-8.0F, -13.0F, -6.0F);
		handRight.texOffs(0, 0).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 19.0F, 6.0F, 0.3F, true);
		handRight.texOffs(104, 103).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 19.0F, 6.0F, 0.5F, true);

		handLeft = new ModelRenderer(this);
		handLeft.setPos(8.0F, -13.0F, -5.0F);
		handLeft.texOffs(0, 0).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.3F, false);
		handLeft.texOffs(104, 103).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.5F, false);

		body = new ModelRenderer(this);
		body.setPos(-0.5F, 2.5F, 7.5F);
		body.texOffs(0, 8).addBox(-8.0F, -5.5F, -15.5F, 17.0F, 19.0F, 31.0F, 0.51F, false);
		body.texOffs(0, 78).addBox(-8.0F, -5.5F, -15.5F, 17.0F, 19.0F, 31.0F, 0.7F, false);

		body4 = new ModelRenderer(this);
		body4.setPos(0.0F, -11.0F, -2.0F);
		body.addChild(body4);
		body4.texOffs(82, 0).addBox(-7.0F, -7.5F, -15.5F, 15.0F, 31.0F, 8.0F, 0.5F, false);
		body4.texOffs(82, 59).addBox(-7.0F, -7.5F, -15.5F, 15.0F, 31.0F, 8.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		handRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		handLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}