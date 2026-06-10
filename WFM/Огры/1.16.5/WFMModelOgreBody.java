// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer gut2;
	private final ModelRenderer neck2;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public WFMModelOgreBody() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(1.0F, 1.0F, 3.0F);
		body.texOffs(54, 0).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.5F, false);
		body.texOffs(54, 77).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.7F, false);

		gut2 = new ModelRenderer(this);
		gut2.setPos(0.0F, 0.0F, -8.0F);
		body.addChild(gut2);
		gut2.texOffs(87, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.5F, false);
		gut2.texOffs(47, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.7F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -25.0F, 0.0F);
		body.addChild(neck2);
		neck2.texOffs(74, 62).addBox(-9.0F, -4.0F, -5.0F, 17.0F, 4.0F, 10.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(12.0F, -19.0F, 4.0F);
		leftArm.texOffs(1, 50).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.5F, false);
		leftArm.texOffs(0, 85).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.7F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-11.0F, -19.0F, 4.0F);
		rightArm.texOffs(1, 50).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.5F, true);
		rightArm.texOffs(0, 85).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.7F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}