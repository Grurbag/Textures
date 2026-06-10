// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSkink extends EntityModel<Entity> {
	private final ModelRenderer skink;
	private final ModelRenderer head;
	private final ModelRenderer greben;
	private final ModelRenderer greben2;
	private final ModelRenderer greben3;
	private final ModelRenderer jawTop;
	private final ModelRenderer jawBot;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftWeaponPoint;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightWeaponPoint;
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

	public WFMModelLizardmenSkink() {
		texWidth = 128;
		texHeight = 64;

		skink = new ModelRenderer(this);
		skink.setPos(0.0F, 1.0F, -5.0F);
		

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		skink.addChild(head);
		head.texOffs(83, 1).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 6.0F, -0.2F, false);

		greben = new ModelRenderer(this);
		greben.setPos(0.0F, -4.0F, -6.0F);
		head.addChild(greben);
		setRotationAngle(greben, -0.2618F, 0.0F, 0.0F);
		greben.texOffs(60, 19).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, -0.2F, false);
		greben.texOffs(50, 40).addBox(0.0F, -12.0F, -1.0F, 0.0F, 12.0F, 12.0F, 0.0F, false);

		greben2 = new ModelRenderer(this);
		greben2.setPos(0.0F, -5.0F, 0.0F);
		greben.addChild(greben2);
		setRotationAngle(greben2, -0.5236F, 0.0F, 0.0F);
		greben2.texOffs(60, 27).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 6.0F, 2.0F, -0.2F, false);

		greben3 = new ModelRenderer(this);
		greben3.setPos(0.0F, -5.0F, 0.0F);
		greben2.addChild(greben3);
		setRotationAngle(greben3, -0.5236F, 0.0F, 0.0F);
		greben3.texOffs(61, 36).addBox(-0.5F, -6.0F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		jawTop = new ModelRenderer(this);
		jawTop.setPos(0.0F, -3.0F, -4.0F);
		head.addChild(jawTop);
		jawTop.texOffs(78, 26).addBox(-2.5F, -2.0F, -5.5F, 5.0F, 5.0F, 7.0F, -0.2F, false);

		jawBot = new ModelRenderer(this);
		jawBot.setPos(-1.0F, 0.0F, -5.0F);
		head.addChild(jawBot);
		jawBot.texOffs(83, 54).addBox(-0.5F, -2.0F, -4.0F, 3.0F, 4.0F, 6.0F, -0.2F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 10.0F, 5.0F);
		skink.addChild(body);
		body.texOffs(30, 3).addBox(-3.5F, -10.0F, -2.0F, 7.0F, 10.0F, 4.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -11.0F, -3.0F);
		body.addChild(neck);
		neck.texOffs(0, 0).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 5.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -2.0F, 3.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.texOffs(23, 47).addBox(-1.5F, -1.0F, -3.0F, 4.0F, 4.0F, 9.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(-1.0F, 0.0F, 6.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.2182F, 0.0F, 0.0F);
		tail2.texOffs(24, 34).addBox(0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 9.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setPos(-1.0F, 0.0F, 7.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.2618F, 0.0F, 0.0F);
		tail3.texOffs(24, 23).addBox(2.0F, 1.0F, -1.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, 0.0F, 3.0F);
		skink.addChild(leftArm);
		leftArm.texOffs(57, 1).addBox(0.0F, -1.0F, -2.5F, 3.0F, 14.0F, 4.0F, 0.0F, true);

		leftWeaponPoint = new ModelRenderer(this);
		leftWeaponPoint.setPos(0.0F, 3.0F, 0.0F);
		leftArm.addChild(leftWeaponPoint);
		leftWeaponPoint.texOffs(3, 2).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, 0.0F, 3.0F);
		skink.addChild(rightArm);
		rightArm.texOffs(57, 1).addBox(-3.0F, -1.0F, -2.5F, 3.0F, 14.0F, 4.0F, 0.0F, false);

		rightWeaponPoint = new ModelRenderer(this);
		rightWeaponPoint.setPos(0.0F, 3.0F, 0.0F);
		rightArm.addChild(rightWeaponPoint);
		rightWeaponPoint.texOffs(3, 2).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 9.0F, 4.5F);
		skink.addChild(leftLeg);
		

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg5);
		setRotationAngle(leftLeg5, -0.7418F, 0.0F, 0.0F);
		leftLeg5.texOffs(2, 14).addBox(-0.5F, -1.0F, -0.5F, 4.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(2.0F, 3.0F, 0.0F);
		leftLeg5.addChild(leftLeg2);
		setRotationAngle(leftLeg2, 1.4835F, 0.0F, 0.0F);
		leftLeg2.texOffs(2, 27).addBox(-2.1F, 1.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 7.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		setRotationAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
		leftLeg3.texOffs(1, 40).addBox(-1.5F, 0.0F, -2.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setPos(0.0F, 5.0F, -1.5F);
		leftLeg3.addChild(leftLeg6);
		setRotationAngle(leftLeg6, -0.0436F, 0.0F, 0.0F);
		leftLeg6.texOffs(1, 49).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		clawsRight = new ModelRenderer(this);
		clawsRight.setPos(-2.0F, 2.0F, -3.0F);
		leftLeg6.addChild(clawsRight);
		clawsRight.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawsRight.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		clawsRight2 = new ModelRenderer(this);
		clawsRight2.setPos(-1.0F, 2.0F, -3.0F);
		leftLeg6.addChild(clawsRight2);
		setRotationAngle(clawsRight2, 0.0F, -0.1745F, 0.0F);
		clawsRight2.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawsRight2.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		clawsRight3 = new ModelRenderer(this);
		clawsRight3.setPos(0.0F, 2.0F, -3.0F);
		leftLeg6.addChild(clawsRight3);
		setRotationAngle(clawsRight3, 0.0F, -0.48F, 0.0F);
		clawsRight3.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawsRight3.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 9.0F, 4.5F);
		skink.addChild(rightLeg);
		

		rightLeg5 = new ModelRenderer(this);
		rightLeg5.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg5);
		setRotationAngle(rightLeg5, -0.7418F, 0.0F, 0.0F);
		rightLeg5.texOffs(2, 14).addBox(-3.5F, -1.0F, -0.5F, 4.0F, 7.0F, 3.0F, 0.0F, true);

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg5.addChild(rightLeg6);
		setRotationAngle(rightLeg6, 1.4835F, 0.0F, 0.0F);
		rightLeg6.texOffs(2, 27).addBox(-0.9F, 1.0F, -2.5F, 3.0F, 7.0F, 3.0F, 0.0F, true);

		rightLeg7 = new ModelRenderer(this);
		rightLeg7.setPos(0.0F, 7.0F, 0.0F);
		rightLeg6.addChild(rightLeg7);
		setRotationAngle(rightLeg7, -0.6981F, 0.0F, 0.0F);
		rightLeg7.texOffs(1, 40).addBox(-0.5F, 0.0F, -2.5F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setPos(0.0F, 5.0F, -1.5F);
		rightLeg7.addChild(leftLeg4);
		setRotationAngle(leftLeg4, -0.0436F, 0.0F, 0.0F);
		leftLeg4.texOffs(1, 49).addBox(-1.0F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		clawsLeft = new ModelRenderer(this);
		clawsLeft.setPos(1.0F, 2.0F, -3.0F);
		leftLeg4.addChild(clawsLeft);
		setRotationAngle(clawsLeft, 0.0F, 0.2182F, 0.0F);
		clawsLeft.texOffs(46, 24).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawsLeft.texOffs(52, 25).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		clawsLeft2 = new ModelRenderer(this);
		clawsLeft2.setPos(1.0F, 2.0F, -3.0F);
		leftLeg4.addChild(clawsLeft2);
		clawsLeft2.texOffs(46, 24).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawsLeft2.texOffs(52, 25).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		clawsLeft3 = new ModelRenderer(this);
		clawsLeft3.setPos(0.0F, 2.0F, -3.0F);
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
		skink.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}