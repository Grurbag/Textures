// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCentigorLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLegBack;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer leftLeg5;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer rightLegBack;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer leftLeg;
	private final ModelRenderer RightLeg_r5;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer RightLeg_r6;
	private final ModelRenderer rightLeg;
	private final ModelRenderer RightLeg_r7;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer RightLeg_r8;

	public WFMModelCentigorLegs() {
		texWidth = 128;
		texHeight = 64;

		leftLegBack = new ModelRenderer(this);
		leftLegBack.setPos(1.0F, 9.0F, 0.0F);
		

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, 0.0F, 17.0F);
		leftLegBack.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.1745F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(48, 17).addBox(-0.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(28.0F, 15.0F, 0.0F);
		leftLegBack.addChild(leftLeg5);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(-25.0F, -9.0F, 17.0F);
		leftLeg5.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.48F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.5F, false);

		rightLegBack = new ModelRenderer(this);
		rightLegBack.setPos(-1.0F, 9.0F, 17.0F);
		

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(0.0F, 0.0F, 0.0F);
		rightLegBack.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.1745F, 0.0F, 0.0F);
		RightLeg_r3.texOffs(48, 17).addBox(-4.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, true);

		rightLeg5 = new ModelRenderer(this);
		rightLeg5.setPos(24.0F, 15.0F, 0.0F);
		rightLegBack.addChild(rightLeg5);
		

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setPos(-25.0F, -9.0F, 0.0F);
		rightLeg5.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.48F, 0.0F, 0.0F);
		RightLeg_r4.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.5F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 9.0F, 0.0F);
		

		RightLeg_r5 = new ModelRenderer(this);
		RightLeg_r5.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(RightLeg_r5);
		setRotationAngle(RightLeg_r5, -0.1745F, 0.0F, 0.0F);
		RightLeg_r5.texOffs(48, 17).addBox(-0.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(28.0F, 15.0F, 0.0F);
		leftLeg.addChild(leftLeg2);
		

		RightLeg_r6 = new ModelRenderer(this);
		RightLeg_r6.setPos(-25.0F, -9.0F, 0.0F);
		leftLeg2.addChild(RightLeg_r6);
		setRotationAngle(RightLeg_r6, 0.48F, 0.0F, 0.0F);
		RightLeg_r6.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.5F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 9.0F, 0.0F);
		

		RightLeg_r7 = new ModelRenderer(this);
		RightLeg_r7.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(RightLeg_r7);
		setRotationAngle(RightLeg_r7, -0.1745F, 0.0F, 0.0F);
		RightLeg_r7.texOffs(48, 17).addBox(-4.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.5F, true);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(24.0F, 15.0F, 0.0F);
		rightLeg.addChild(rightLeg2);
		

		RightLeg_r8 = new ModelRenderer(this);
		RightLeg_r8.setPos(-25.0F, -9.0F, 0.0F);
		rightLeg2.addChild(RightLeg_r8);
		setRotationAngle(RightLeg_r8, 0.48F, 0.0F, 0.0F);
		RightLeg_r8.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.5F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}