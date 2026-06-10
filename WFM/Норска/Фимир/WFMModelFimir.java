// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelFimir extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jawTop;
	private final ModelRenderer jawTop_r1;
	private final ModelRenderer jawTop_r2;
	private final ModelRenderer jawBot;
	private final ModelRenderer jawTop_r3;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail_r1;
	private final ModelRenderer tail_r2;
	private final ModelRenderer tail_r3;
	private final ModelRenderer tail_r4;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg5;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer leftLeg6;
	private final ModelRenderer clawsRight;
	private final ModelRenderer clawsRight2;
	private final ModelRenderer clawsRight3;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer rightLeg6;
	private final ModelRenderer rightLeg7;
	private final ModelRenderer leftLeg4;
	private final ModelRenderer clawsLeft;
	private final ModelRenderer clawsLeft2;
	private final ModelRenderer clawsLeft3;

	public WFMModelFimir() {
		texWidth = 128;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -5.0F, -6.0F);
		head.texOffs(100, 0).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		jawTop = new ModelRenderer(this);
		jawTop.setPos(0.0F, -2.0F, -4.0F);
		head.addChild(jawTop);
		jawTop.texOffs(78, 26).addBox(-2.5F, -1.0F, -5.5F, 5.0F, 4.0F, 7.0F, 0.0F, false);

		jawTop_r1 = new ModelRenderer(this);
		jawTop_r1.setPos(0.0F, 2.0F, 1.0F);
		jawTop.addChild(jawTop_r1);
		setRotationAngle(jawTop_r1, -0.3927F, 0.0F, 0.0F);
		jawTop_r1.texOffs(107, 37).addBox(-1.5F, -2.0F, -5.5F, 3.0F, 2.0F, 3.0F, 0.01F, false);

		jawTop_r2 = new ModelRenderer(this);
		jawTop_r2.setPos(0.0F, 4.0F, -1.0F);
		jawTop.addChild(jawTop_r2);
		setRotationAngle(jawTop_r2, -0.3927F, 0.0F, 0.0F);
		jawTop_r2.texOffs(104, 26).addBox(-2.5F, -2.0F, -5.5F, 5.0F, 4.0F, 7.0F, 0.01F, false);

		jawBot = new ModelRenderer(this);
		jawBot.setPos(-1.0F, 1.0F, -4.0F);
		head.addChild(jawBot);
		jawBot.texOffs(81, 52).addBox(-0.5F, -1.0F, -5.01F, 3.0F, 4.0F, 8.0F, 0.0F, false);

		jawTop_r3 = new ModelRenderer(this);
		jawTop_r3.setPos(0.0F, 0.0F, -1.0F);
		jawBot.addChild(jawTop_r3);
		setRotationAngle(jawTop_r3, 0.1745F, 0.0F, 0.0F);
		jawTop_r3.texOffs(106, 52).addBox(-0.5F, -2.0F, -5.0F, 3.0F, 4.0F, 8.0F, 0.01F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 9.0F, 0.0F);
		body.texOffs(31, 0).addBox(-5.0F, -16.0F, -3.0F, 10.0F, 16.0F, 6.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -15.0F, -3.0F);
		body.addChild(neck);
		neck.texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -2.0F, 3.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.texOffs(22, 48).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 5.0F, 7.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(0.0F, 0.0F, 6.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.2182F, 0.0F, 0.0F);
		tail2.texOffs(21, 33).addBox(-1.0F, -2.0F, -4.0F, 3.0F, 4.0F, 9.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setPos(-1.0F, -1.0F, 4.0F);
		tail2.addChild(tail3);
		tail3.texOffs(21, 22).addBox(0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setPos(0.0F, 0.0F, 3.0F);
		tail3.addChild(tail4);
		tail4.texOffs(45, 31).addBox(-0.5F, -1.0F, 1.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
		tail4.texOffs(44, 61).addBox(1.5F, 4.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setPos(-3.0F, 0.0F, 3.0F);
		tail4.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.0F, 0.0F, 1.1345F);
		tail_r1.texOffs(44, 61).addBox(1.5F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tail_r2 = new ModelRenderer(this);
		tail_r2.setPos(2.0F, 5.0F, 2.0F);
		tail4.addChild(tail_r2);
		setRotationAngle(tail_r2, 0.0F, 0.0F, -0.3054F);
		tail_r2.texOffs(44, 61).addBox(1.5F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tail_r3 = new ModelRenderer(this);
		tail_r3.setPos(-2.0F, 5.0F, 2.0F);
		tail4.addChild(tail_r3);
		setRotationAngle(tail_r3, 0.0F, 0.0F, 0.3054F);
		tail_r3.texOffs(44, 61).addBox(1.5F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tail_r4 = new ModelRenderer(this);
		tail_r4.setPos(4.0F, 4.0F, 4.0F);
		tail4.addChild(tail_r4);
		setRotationAngle(tail_r4, 0.0F, 0.0F, -1.0472F);
		tail_r4.texOffs(44, 61).addBox(1.5F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -4.0F, 0.0F);
		leftArm.texOffs(74, 0).addBox(1.0F, -2.0F, -3.5F, 4.0F, 16.0F, 5.0F, 0.0F, true);

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(3.0F, 7.0F, -0.5F);
		leftArm.addChild(leftArm2);
		leftArm2.texOffs(83, 5).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, -4.0F, 0.0F);
		rightArm.texOffs(74, 0).addBox(-4.0F, -2.0F, -3.5F, 4.0F, 16.0F, 5.0F, 0.0F, false);

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(-2.0F, 6.0F, -0.5F);
		rightArm.addChild(rightArm2);
		rightArm2.texOffs(83, 5).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg5);
		setRotationAngle(leftLeg5, -0.7418F, 0.0F, 0.0F);
		leftLeg5.texOffs(0, 18).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(2.0F, 3.0F, 0.0F);
		leftLeg5.addChild(leftLeg2);
		setRotationAngle(leftLeg2, 1.4835F, 0.0F, 0.0F);
		leftLeg2.texOffs(1, 32).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 7.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		setRotationAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
		leftLeg3.texOffs(0, 45).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setPos(0.0F, 5.0F, -1.5F);
		leftLeg3.addChild(leftLeg6);
		setRotationAngle(leftLeg6, -0.0436F, 0.0F, 0.0F);
		leftLeg6.texOffs(0, 54).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		clawsRight = new ModelRenderer(this);
		clawsRight.setPos(-2.0F, 2.0F, -3.0F);
		leftLeg6.addChild(clawsRight);
		clawsRight.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawsRight.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		clawsRight2 = new ModelRenderer(this);
		clawsRight2.setPos(0.0F, 2.0F, -3.0F);
		leftLeg6.addChild(clawsRight2);
		clawsRight2.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawsRight2.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		clawsRight3 = new ModelRenderer(this);
		clawsRight3.setPos(1.0F, 2.0F, -3.0F);
		leftLeg6.addChild(clawsRight3);
		setRotationAngle(clawsRight3, 0.0F, -0.48F, 0.0F);
		clawsRight3.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawsRight3.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg5 = new ModelRenderer(this);
		rightLeg5.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg5);
		setRotationAngle(rightLeg5, -0.7418F, 0.0F, 0.0F);
		rightLeg5.texOffs(0, 18).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg5.addChild(rightLeg6);
		setRotationAngle(rightLeg6, 1.4835F, 0.0F, 0.0F);
		rightLeg6.texOffs(1, 32).addBox(-1.9F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, true);

		rightLeg7 = new ModelRenderer(this);
		rightLeg7.setPos(0.0F, 7.0F, 0.0F);
		rightLeg6.addChild(rightLeg7);
		setRotationAngle(rightLeg7, -0.6981F, 0.0F, 0.0F);
		rightLeg7.texOffs(0, 45).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setPos(0.0F, 5.0F, -1.5F);
		rightLeg7.addChild(leftLeg4);
		setRotationAngle(leftLeg4, -0.0436F, 0.0F, 0.0F);
		leftLeg4.texOffs(0, 54).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);

		clawsLeft = new ModelRenderer(this);
		clawsLeft.setPos(-1.0F, 2.0F, -3.0F);
		leftLeg4.addChild(clawsLeft);
		clawsLeft.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawsLeft.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		clawsLeft2 = new ModelRenderer(this);
		clawsLeft2.setPos(1.0F, 2.0F, -3.0F);
		leftLeg4.addChild(clawsLeft2);
		clawsLeft2.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawsLeft2.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		clawsLeft3 = new ModelRenderer(this);
		clawsLeft3.setPos(-1.0F, 2.0F, -3.0F);
		leftLeg4.addChild(clawsLeft3);
		setRotationAngle(clawsLeft3, 0.0F, 0.48F, 0.0F);
		clawsLeft3.texOffs(46, 24).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawsLeft3.texOffs(52, 25).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}