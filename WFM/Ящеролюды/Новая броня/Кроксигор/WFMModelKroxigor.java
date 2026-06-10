// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKroxigor extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jawTop;
	private final ModelRenderer jawTop_r1;
	private final ModelRenderer jawBot;
	private final ModelRenderer browRight;
	private final ModelRenderer bone2;
	private final ModelRenderer browRight2;
	private final ModelRenderer bone3;
	private final ModelRenderer body;
	private final ModelRenderer body1;
	private final ModelRenderer body2;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer rightArm3;
	private final ModelRenderer rightWeaponPoint;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm1;
	private final ModelRenderer leftArm2;
	private final ModelRenderer leftWeaponPoint;
	private final ModelRenderer rightLeg;
	private final ModelRenderer legRight1;
	private final ModelRenderer legRight2;
	private final ModelRenderer legRight3;
	private final ModelRenderer feetRight;
	private final ModelRenderer feetRight_r1;
	private final ModelRenderer fingerRight;
	private final ModelRenderer fingerRight2;
	private final ModelRenderer fingerRight3;
	private final ModelRenderer leftLeg;
	private final ModelRenderer legLeft1;
	private final ModelRenderer legLeft2;
	private final ModelRenderer legLeft3;
	private final ModelRenderer feetLeft;
	private final ModelRenderer feetLeft_r1;
	private final ModelRenderer fingerLeft;
	private final ModelRenderer fingerLeft2;
	private final ModelRenderer fingerLeft3;

	public WFMModelKroxigor() {
		texWidth = 256;
		texHeight = 256;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -13.0F, -14.0F);
		head.texOffs(216, 0).addBox(-6.0F, -6.0F, -5.0F, 12.0F, 11.0F, 8.0F, -0.3F, false);

		jawTop = new ModelRenderer(this);
		jawTop.setPos(0.0F, 2.0F, -3.0F);
		head.addChild(jawTop);
		jawTop.texOffs(208, 22).addBox(-4.5F, -7.0F, -14.0F, 9.0F, 8.0F, 15.0F, -0.3F, false);

		jawTop_r1 = new ModelRenderer(this);
		jawTop_r1.setPos(0.0F, -4.0F, -13.5F);
		jawTop.addChild(jawTop_r1);
		setRotationAngle(jawTop_r1, -0.0873F, 0.0F, 0.0F);
		jawTop_r1.texOffs(147, 45).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 1.0F, 15.0F, -0.29F, false);

		jawBot = new ModelRenderer(this);
		jawBot.setPos(0.0F, 1.0F, -3.0F);
		head.addChild(jawBot);
		setRotationAngle(jawBot, 0.0436F, 0.0F, 0.0F);
		jawBot.texOffs(161, 23).addBox(-4.0F, -4.0F, -13.0F, 8.0F, 8.0F, 14.0F, -0.3F, false);
		jawBot.texOffs(181, 45).addBox(-4.0F, 2.1F, -13.0F, 8.0F, 0.0F, 14.0F, -0.29F, false);

		browRight = new ModelRenderer(this);
		browRight.setPos(4.0F, -4.0F, -2.5F);
		head.addChild(browRight);
		setRotationAngle(browRight, 0.0F, 0.0F, -0.5236F);
		browRight.texOffs(230, 52).addBox(-1.0F, -0.5F, -4.5F, 4.0F, 1.0F, 9.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(3.0F, -0.5F, 0.5F);
		browRight.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.7418F);
		bone2.texOffs(239, 72).addBox(0.0F, 0.0F, -5.0F, 4.0F, 0.0F, 9.0F, 0.0F, false);

		browRight2 = new ModelRenderer(this);
		browRight2.setPos(-4.0F, -4.0F, -2.5F);
		head.addChild(browRight2);
		setRotationAngle(browRight2, 3.1416F, 0.0F, -2.618F);
		browRight2.texOffs(230, 79).addBox(-1.0F, -0.5F, -4.5F, 4.0F, 1.0F, 9.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(3.0F, -0.5F, 0.5F);
		browRight2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.7418F);
		bone3.texOffs(239, 99).addBox(0.0F, 0.0F, -5.0F, 4.0F, 0.0F, 9.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 1.0F, 0.0F);
		

		body1 = new ModelRenderer(this);
		body1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(body1);
		setRotationAngle(body1, 0.2618F, 0.0F, 0.0F);
		body1.texOffs(0, 0).addBox(-9.5F, -20.0F, -6.0F, 19.0F, 12.0F, 13.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, 3.0F, 0.0F);
		body1.addChild(body2);
		body2.texOffs(0, 26).addBox(-7.5F, -11.0F, -5.0F, 15.0F, 10.0F, 11.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -17.1206F, -0.684F);
		body1.addChild(neck);
		setRotationAngle(neck, -0.3491F, 0.0F, 0.0F);
		neck.texOffs(157, 0).addBox(-8.0F, -4.0F, -7.0F, 16.0F, 12.0F, 10.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 2.3404F, 2.9917F);
		body1.addChild(tail);
		setRotationAngle(tail, -1.0908F, 0.0F, 0.0F);
		tail.texOffs(107, 0).addBox(-4.5F, -5.0F, -5.0F, 9.0F, 8.0F, 15.0F, 0.0F, false);
		tail.texOffs(0, 237).addBox(4.5F, -8.0F, -5.0F, 0.0F, 3.0F, 15.0F, 0.0F, false);
		tail.texOffs(0, 237).addBox(-4.5F, -8.0F, -5.0F, 0.0F, 3.0F, 15.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(0.0F, 0.0F, 9.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.2182F, 0.0F, 0.0F);
		tail2.texOffs(110, 24).addBox(-3.5F, -4.0F, -2.0F, 7.0F, 7.0F, 13.0F, 0.0F, false);
		tail2.texOffs(33, 240).addBox(-3.5F, -7.0F, -2.0F, 0.0F, 3.0F, 13.0F, 0.0F, false);
		tail2.texOffs(33, 240).addBox(3.5F, -7.0F, -2.0F, 0.0F, 3.0F, 13.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setPos(0.0F, 0.0F, 12.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.3491F, 0.0F, 0.0F);
		tail3.texOffs(111, 46).addBox(-2.5F, -4.0746F, -3.6868F, 5.0F, 6.0F, 13.0F, 0.0F, false);
		tail3.texOffs(59, 240).addBox(-2.5F, -7.0746F, -3.6868F, 0.0F, 3.0F, 13.0F, 0.0F, false);
		tail3.texOffs(59, 240).addBox(2.5F, -7.0746F, -3.6868F, 0.0F, 3.0F, 13.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setPos(0.0F, 0.0F, 9.0F);
		tail3.addChild(tail4);
		tail4.texOffs(116, 68).addBox(-1.5F, -3.0746F, -3.6868F, 3.0F, 5.0F, 7.0F, 0.0F, false);
		tail4.texOffs(88, 247).addBox(-1.5F, -5.0746F, -3.6868F, 0.0F, 2.0F, 7.0F, 0.0F, false);
		tail4.texOffs(88, 247).addBox(1.5F, -5.0746F, -3.6868F, 0.0F, 2.0F, 7.0F, 0.0F, false);

		tail5 = new ModelRenderer(this);
		tail5.setPos(0.0F, 0.0F, 3.0F);
		tail4.addChild(tail5);
		tail5.texOffs(117, 86).addBox(-0.5F, -2.0746F, -3.6868F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		tail5.texOffs(103, 247).addBox(0.0F, -4.0746F, -3.6868F, 0.0F, 2.0F, 7.0F, 0.0F, false);
		tail5.texOffs(103, 247).addBox(-1.0F, -4.0746F, -3.6868F, 0.0F, 2.0F, 7.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-9.5F, -12.0F, -6.0F);
		

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(0.0F, 0.0F, 0.0F);
		rightArm.addChild(rightArm2);
		rightArm2.texOffs(0, 52).addBox(-6.5F, -5.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.0F, true);

		rightArm3 = new ModelRenderer(this);
		rightArm3.setPos(-2.5F, 5.5391F, 0.0F);
		rightArm2.addChild(rightArm3);
		rightArm3.texOffs(8, 75).addBox(-3.2898F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.0F, true);

		rightWeaponPoint = new ModelRenderer(this);
		rightWeaponPoint.setPos(0.2102F, 0.0F, -4.0F);
		rightArm3.addChild(rightWeaponPoint);
		rightWeaponPoint.texOffs(23, 83).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(9.5F, -12.0F, -6.0F);
		

		leftArm1 = new ModelRenderer(this);
		leftArm1.setPos(2.0F, -5.0F, 0.0F);
		leftArm.addChild(leftArm1);
		leftArm1.texOffs(0, 52).addBox(-4.5F, 0.0F, -5.0F, 9.0F, 11.0F, 10.0F, 0.0F, false);

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(-0.5F, 10.5391F, 0.0F);
		leftArm1.addChild(leftArm2);
		leftArm2.texOffs(8, 75).addBox(-3.2898F, -3.0F, -4.0F, 7.0F, 16.0F, 8.0F, 0.0F, false);

		leftWeaponPoint = new ModelRenderer(this);
		leftWeaponPoint.setPos(1.7102F, 6.0F, -4.0F);
		leftArm2.addChild(leftWeaponPoint);
		leftWeaponPoint.texOffs(23, 83).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-2.0F, 2.0F, 0.0F);
		

		legRight1 = new ModelRenderer(this);
		legRight1.setPos(-5.0F, 3.0F, 0.0F);
		rightLeg.addChild(legRight1);
		setRotationAngle(legRight1, -0.6545F, 0.0F, 0.0F);
		legRight1.texOffs(68, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.0F, true);

		legRight2 = new ModelRenderer(this);
		legRight2.setPos(2.0F, 4.8165F, 1.8455F);
		legRight1.addChild(legRight2);
		setRotationAngle(legRight2, 1.309F, 0.0F, 0.0F);
		legRight2.texOffs(72, 24).addBox(-4.0F, -1.8886F, -3.4389F, 7.0F, 9.0F, 8.0F, 0.0F, true);

		legRight3 = new ModelRenderer(this);
		legRight3.setPos(-3.0F, 5.0007F, -0.4905F);
		legRight2.addChild(legRight3);
		setRotationAngle(legRight3, -0.6981F, 0.0F, 0.0F);
		legRight3.texOffs(75, 41).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, 0.0F, true);

		feetRight = new ModelRenderer(this);
		feetRight.setPos(0.0F, 10.0F, 0.0F);
		legRight3.addChild(feetRight);
		

		feetRight_r1 = new ModelRenderer(this);
		feetRight_r1.setPos(0.0F, 0.0F, 0.0F);
		feetRight.addChild(feetRight_r1);
		setRotationAngle(feetRight_r1, 0.0436F, 0.0F, 0.0F);
		feetRight_r1.texOffs(71, 61).addBox(-1.0F, -4.0F, -6.0F, 7.0F, 4.0F, 7.0F, 0.0F, false);

		fingerRight = new ModelRenderer(this);
		fingerRight.setPos(-1.0F, 0.0F, -6.0F);
		feetRight.addChild(fingerRight);
		fingerRight.texOffs(57, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fingerRight.texOffs(46, 25).addBox(-0.5F, -1.8172F, -2.355F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		fingerRight.texOffs(52, 26).addBox(-0.5F, -0.8172F, -3.355F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		fingerRight2 = new ModelRenderer(this);
		fingerRight2.setPos(2.0F, 0.0F, -7.0F);
		feetRight.addChild(fingerRight2);
		fingerRight2.texOffs(57, 26).addBox(-0.5F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fingerRight2.texOffs(46, 25).addBox(0.0F, -1.8172F, -2.355F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		fingerRight2.texOffs(52, 26).addBox(0.0F, -0.8172F, -3.355F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		fingerRight3 = new ModelRenderer(this);
		fingerRight3.setPos(6.0F, 0.0F, -6.0F);
		feetRight.addChild(fingerRight3);
		fingerRight3.texOffs(57, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fingerRight3.texOffs(46, 25).addBox(-0.5F, -1.8172F, -2.355F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		fingerRight3.texOffs(52, 26).addBox(-0.5F, -0.8172F, -3.355F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 2.0F, 0.0F);
		

		legLeft1 = new ModelRenderer(this);
		legLeft1.setPos(2.0F, 3.0F, 0.0F);
		leftLeg.addChild(legLeft1);
		setRotationAngle(legLeft1, -0.6545F, 0.0F, 0.0F);
		legLeft1.texOffs(68, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.0F, false);

		legLeft2 = new ModelRenderer(this);
		legLeft2.setPos(2.0F, 4.8165F, 1.8455F);
		legLeft1.addChild(legLeft2);
		setRotationAngle(legLeft2, 1.309F, 0.0F, 0.0F);
		legLeft2.texOffs(72, 24).addBox(-4.0F, -1.8886F, -3.4389F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		legLeft3 = new ModelRenderer(this);
		legLeft3.setPos(-3.0F, 5.0007F, -0.4905F);
		legLeft2.addChild(legLeft3);
		setRotationAngle(legLeft3, -0.6981F, 0.0F, 0.0F);
		legLeft3.texOffs(75, 41).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, 0.0F, false);

		feetLeft = new ModelRenderer(this);
		feetLeft.setPos(0.0F, 10.0F, 0.0F);
		legLeft3.addChild(feetLeft);
		

		feetLeft_r1 = new ModelRenderer(this);
		feetLeft_r1.setPos(0.0F, 0.0F, 0.0F);
		feetLeft.addChild(feetLeft_r1);
		setRotationAngle(feetLeft_r1, 0.0436F, 0.0F, 0.0F);
		feetLeft_r1.texOffs(71, 61).addBox(-1.0F, -4.0F, -6.0F, 7.0F, 4.0F, 7.0F, 0.0F, true);

		fingerLeft = new ModelRenderer(this);
		fingerLeft.setPos(-1.0F, 0.0F, -6.0F);
		feetLeft.addChild(fingerLeft);
		fingerLeft.texOffs(57, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fingerLeft.texOffs(46, 25).addBox(-0.5F, -1.8172F, -2.355F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		fingerLeft.texOffs(52, 26).addBox(-0.5F, -0.8172F, -3.355F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		fingerLeft2 = new ModelRenderer(this);
		fingerLeft2.setPos(3.0F, 0.0F, -7.0F);
		feetLeft.addChild(fingerLeft2);
		fingerLeft2.texOffs(57, 26).addBox(-1.5F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fingerLeft2.texOffs(46, 25).addBox(-1.0F, -1.8172F, -2.355F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		fingerLeft2.texOffs(52, 26).addBox(-1.0F, -0.8172F, -3.355F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		fingerLeft3 = new ModelRenderer(this);
		fingerLeft3.setPos(6.0F, 0.0F, -6.0F);
		feetLeft.addChild(fingerLeft3);
		fingerLeft3.texOffs(57, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		fingerLeft3.texOffs(46, 25).addBox(-0.5F, -1.8172F, -2.355F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		fingerLeft3.texOffs(52, 26).addBox(-0.5F, -0.8172F, -3.355F, 1.0F, 1.0F, 1.0F, 0.0F, true);
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
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}