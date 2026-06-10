// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelFlagellantLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer repentRightLeg;
	private final ModelRenderer repentRightLeg3;
	private final ModelRenderer rightLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer repentRightLeg2;
	private final ModelRenderer repentRightLeg4;

	public WFMModelFlagellantLegs() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		leftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.0436F);
		RightLeg_r1.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);

		repentRightLeg = new ModelRenderer(this);
		repentRightLeg.setPos(2.0F, 1.0F, 0.0F);
		leftLeg.addChild(repentRightLeg);
		setRotationAngle(repentRightLeg, 0.0F, 0.0F, -0.0436F);
		repentRightLeg.texOffs(0, 28).addBox(0.0F, -2.0F, -3.0F, 0.0F, 7.0F, 6.0F, -1.0F, false);

		repentRightLeg3 = new ModelRenderer(this);
		repentRightLeg3.setPos(0.0F, 1.0F, -2.0F);
		leftLeg.addChild(repentRightLeg3);
		setRotationAngle(repentRightLeg3, 0.0F, 1.5708F, -0.0436F);
		repentRightLeg3.texOffs(0, 28).addBox(0.0F, -2.0F, -3.0F, 0.0F, 12.0F, 6.0F, -1.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		rightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);

		repentRightLeg2 = new ModelRenderer(this);
		repentRightLeg2.setPos(-2.2F, 1.0F, 0.0F);
		rightLeg.addChild(repentRightLeg2);
		setRotationAngle(repentRightLeg2, 0.0F, 0.0F, 0.0436F);
		repentRightLeg2.texOffs(0, 28).addBox(0.0F, -2.0F, -3.0F, 0.0F, 7.0F, 6.0F, -1.0F, false);

		repentRightLeg4 = new ModelRenderer(this);
		repentRightLeg4.setPos(-0.2F, 1.0F, 2.0F);
		rightLeg.addChild(repentRightLeg4);
		setRotationAngle(repentRightLeg4, 0.0F, 1.5708F, 0.0436F);
		repentRightLeg4.texOffs(0, 28).addBox(0.0F, -2.0F, -3.0F, 0.0F, 12.0F, 6.0F, -1.0F, false);
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