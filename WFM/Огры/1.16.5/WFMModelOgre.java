// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgre extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jaw;
	private final ModelRenderer beard;
	private final ModelRenderer nose;
	private final ModelRenderer brovLeft;
	private final ModelRenderer brovRight;
	private final ModelRenderer body;
	private final ModelRenderer gut;
	private final ModelRenderer neck;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
	private final ModelRenderer leftLeg;
	private final ModelRenderer feetLeft;
	private final ModelRenderer rightLeg;
	private final ModelRenderer feetRight;

	public WFMModelOgre() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -28.0F, 1.0F);
		head.texOffs(0, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 0.0F, false);
		head.texOffs(72, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 0.3F, false);

		jaw = new ModelRenderer(this);
		jaw.setPos(0.0F, 2.0F, -4.0F);
		head.addChild(jaw);
		jaw.texOffs(45, 120).addBox(-4.0F, -3.0F, -3.0F, 9.0F, 4.0F, 4.0F, 0.0F, false);

		beard = new ModelRenderer(this);
		beard.setPos(0.0F, 3.0F, -3.0F);
		jaw.addChild(beard);
		beard.texOffs(0, 85).addBox(-4.0F, -2.0F, 0.0F, 9.0F, 9.0F, 0.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(1.0F, -3.0F, -7.0F);
		head.addChild(nose);
		nose.texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		nose.texOffs(4, 1).addBox(-2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		nose.texOffs(4, 3).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		brovLeft = new ModelRenderer(this);
		brovLeft.setPos(2.0F, -5.0F, -6.0F);
		head.addChild(brovLeft);
		setRotationAngle(brovLeft, 0.0F, 0.0F, -0.1745F);
		brovLeft.texOffs(0, 5).addBox(0.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		brovRight = new ModelRenderer(this);
		brovRight.setPos(-1.0F, -5.0F, -6.0F);
		head.addChild(brovRight);
		setRotationAngle(brovRight, 0.0F, 0.0F, 0.1745F);
		brovRight.texOffs(0, 5).addBox(-3.0F, -1.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setPos(1.0F, 1.0F, 3.0F);
		body.texOffs(54, 0).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.0F, false);

		gut = new ModelRenderer(this);
		gut.setPos(0.0F, 0.0F, -8.0F);
		body.addChild(gut);
		gut.texOffs(87, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -25.0F, 0.0F);
		body.addChild(neck);
		neck.texOffs(74, 62).addBox(-9.0F, -4.0F, -5.0F, 17.0F, 4.0F, 10.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-11.0F, -19.0F, 4.0F);
		rightArm.texOffs(1, 50).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.0F, true);

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(-4.0F, 21.0F, -1.0F);
		rightArm.addChild(rightArm2);
		rightArm2.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(12.0F, -19.0F, 4.0F);
		leftArm.texOffs(1, 50).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.0F, false);

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(4.0F, 21.0F, -1.0F);
		leftArm.addChild(leftArm2);
		leftArm2.texOffs(4, 2).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 2.0F, 3.0F);
		leftLeg.texOffs(0, 0).addBox(0.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.0F, false);

		feetLeft = new ModelRenderer(this);
		feetLeft.setPos(0.0F, 0.0F, -4.0F);
		leftLeg.addChild(feetLeft);
		feetLeft.texOffs(0, 37).addBox(1.0F, 16.0F, -5.0F, 9.0F, 6.0F, 5.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 2.0F, 3.0F);
		rightLeg.texOffs(0, 0).addBox(-11.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.0F, true);

		feetRight = new ModelRenderer(this);
		feetRight.setPos(-11.0F, 0.0F, -4.0F);
		rightLeg.addChild(feetRight);
		feetRight.texOffs(0, 37).addBox(1.0F, 16.0F, -5.0F, 9.0F, 6.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}