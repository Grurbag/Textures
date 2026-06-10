// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNecropolisKnightBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer rightLeg;
	private final ModelRenderer RightLeg_r2;

	public WFMModelNecropolisKnightBoots() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.75F, 6.5F, -3.0F);
		leftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.124F, 0.1231F, -0.7777F);
		RightLeg_r1.texOffs(0, 0).addBox(-1.5F, -2.5F, -0.5F, 4.0F, 4.0F, 1.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(-0.95F, 6.5F, -3.0F);
		rightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.124F, 0.1231F, -0.7777F);
		RightLeg_r2.texOffs(0, 0).addBox(-1.5F, -2.5F, -0.5F, 4.0F, 4.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}