// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSaurus extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer greben;
	private final ModelRenderer greben_r1;
	private final ModelRenderer horngreben;
	private final ModelRenderer horngreben2;
	private final ModelRenderer horngreben3;
	private final ModelRenderer horngreben4;
	private final ModelRenderer horngreben5;
	private final ModelRenderer horngreben6;
	private final ModelRenderer horngreben7;
	private final ModelRenderer horngreben8;
	private final ModelRenderer horngreben9;
	private final ModelRenderer jawTop;
	private final ModelRenderer horn;
	private final ModelRenderer jawBot;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer hornback4;
	private final ModelRenderer hornback;
	private final ModelRenderer hornback2;
	private final ModelRenderer hornback3;
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

	public WFMModelLizardmenSaurus() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -5.0F, -4.0F);
		head.texOffs(82, 0).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		greben = new ModelRenderer(this);
		greben.setPos(0.0F, -5.0F, -5.0F);
		head.addChild(greben);
		

		greben_r1 = new ModelRenderer(this);
		greben_r1.setPos(0.0F, 0.0F, 0.0F);
		greben.addChild(greben_r1);
		setRotationAngle(greben_r1, 0.2618F, 0.0F, 0.0F);
		greben_r1.texOffs(76, 17).addBox(-4.5F, -1.158F, -0.0603F, 9.0F, 1.0F, 8.0F, 0.0F, false);

		horngreben = new ModelRenderer(this);
		horngreben.setPos(-1.0F, -2.0705F, 7.7274F);
		greben.addChild(horngreben);
		setRotationAngle(horngreben, 0.2618F, 0.0F, 0.0F);
		horngreben.texOffs(74, 0).addBox(-0.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		horngreben2 = new ModelRenderer(this);
		horngreben2.setPos(1.0F, -1.0F, 0.0F);
		horngreben.addChild(horngreben2);
		setRotationAngle(horngreben2, 0.3054F, 0.0F, 0.0F);
		horngreben2.texOffs(74, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		horngreben3 = new ModelRenderer(this);
		horngreben3.setPos(0.0F, 0.0F, 2.0F);
		horngreben2.addChild(horngreben3);
		horngreben3.texOffs(74, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		horngreben4 = new ModelRenderer(this);
		horngreben4.setPos(2.0F, -1.1046F, 7.9862F);
		greben.addChild(horngreben4);
		setRotationAngle(horngreben4, 0.2823F, 0.3786F, 0.1068F);
		horngreben4.texOffs(74, 0).addBox(-0.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		horngreben5 = new ModelRenderer(this);
		horngreben5.setPos(1.0F, -1.0F, 0.0F);
		horngreben4.addChild(horngreben5);
		setRotationAngle(horngreben5, 0.3054F, 0.0F, 0.0F);
		horngreben5.texOffs(74, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		horngreben6 = new ModelRenderer(this);
		horngreben6.setPos(0.0F, 0.0F, 2.0F);
		horngreben5.addChild(horngreben6);
		horngreben6.texOffs(74, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		horngreben7 = new ModelRenderer(this);
		horngreben7.setPos(-3.5774F, -0.8701F, 7.1108F);
		greben.addChild(horngreben7);
		setRotationAngle(horngreben7, 0.2875F, -0.4205F, -0.1201F);
		horngreben7.texOffs(74, 0).addBox(-0.5F, -2.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		horngreben8 = new ModelRenderer(this);
		horngreben8.setPos(1.0F, -1.0F, 0.0F);
		horngreben7.addChild(horngreben8);
		setRotationAngle(horngreben8, 0.3054F, 0.0F, 0.0F);
		horngreben8.texOffs(74, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		horngreben9 = new ModelRenderer(this);
		horngreben9.setPos(0.0F, 0.0F, 2.0F);
		horngreben8.addChild(horngreben9);
		horngreben9.texOffs(74, 13).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		jawTop = new ModelRenderer(this);
		jawTop.setPos(0.0F, -3.0F, -5.0F);
		head.addChild(jawTop);
		jawTop.texOffs(78, 26).addBox(-2.5F, -2.0F, -5.5F, 5.0F, 4.0F, 7.0F, 0.0F, false);
		jawTop.texOffs(78, 38).addBox(-2.5F, -3.0F, -4.5F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		horn = new ModelRenderer(this);
		horn.setPos(0.0F, -2.0F, -5.0F);
		jawTop.addChild(horn);
		horn.texOffs(101, 48).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		horn.texOffs(110, 49).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		jawBot = new ModelRenderer(this);
		jawBot.setPos(-1.0F, 0.0F, -5.0F);
		head.addChild(jawBot);
		jawBot.texOffs(83, 54).addBox(-0.5F, -2.0F, -5.0F, 3.0F, 4.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 9.0F, 0.0F);
		body.texOffs(24, 0).addBox(-5.0F, -16.0F, -3.0F, 10.0F, 16.0F, 6.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setPos(0.0F, -15.0F, -3.0F);
		body.addChild(neck);
		neck.texOffs(0, 0).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -2.0F, 3.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.texOffs(20, 46).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 5.0F, 9.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(0.0F, 0.0F, 6.0F);
		tail.addChild(tail2);
		setRotationAngle(tail2, 0.2182F, 0.0F, 0.0F);
		tail2.texOffs(21, 33).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 4.0F, 9.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setPos(-1.0F, 0.0F, 7.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.2618F, 0.0F, 0.0F);
		tail3.texOffs(21, 22).addBox(0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 8.0F, 0.0F, false);

		hornback4 = new ModelRenderer(this);
		hornback4.setPos(0.0F, -0.4567F, 1.2961F);
		tail.addChild(hornback4);
		setRotationAngle(hornback4, -1.0908F, 0.0F, 0.0F);
		hornback4.texOffs(86, 48).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		hornback4.texOffs(95, 49).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hornback = new ModelRenderer(this);
		hornback.setPos(0.0F, -15.0F, 0.0F);
		body.addChild(hornback);
		setRotationAngle(hornback, -1.5708F, 0.0F, 0.0F);
		hornback.texOffs(86, 48).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		hornback.texOffs(95, 49).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hornback2 = new ModelRenderer(this);
		hornback2.setPos(0.0F, -13.0F, 2.0F);
		body.addChild(hornback2);
		setRotationAngle(hornback2, -2.3562F, 0.0F, 0.0F);
		hornback2.texOffs(86, 48).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		hornback2.texOffs(95, 49).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		hornback3 = new ModelRenderer(this);
		hornback3.setPos(0.0F, -8.0F, 2.0F);
		body.addChild(hornback3);
		setRotationAngle(hornback3, -2.3562F, 0.0F, 0.0F);
		hornback3.texOffs(86, 48).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		hornback3.texOffs(95, 49).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -4.0F, 0.0F);
		leftArm.texOffs(56, 0).addBox(1.0F, -2.0F, -2.5F, 4.0F, 16.0F, 5.0F, 0.0F, true);

		leftWeaponPoint = new ModelRenderer(this);
		leftWeaponPoint.setPos(1.5F, 4.0F, 0.0F);
		leftArm.addChild(leftWeaponPoint);
		leftWeaponPoint.texOffs(3, 2).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, -4.0F, 0.0F);
		rightArm.texOffs(56, 0).addBox(-4.0F, -2.0F, -2.5F, 4.0F, 16.0F, 5.0F, 0.0F, false);

		rightWeaponPoint = new ModelRenderer(this);
		rightWeaponPoint.setPos(-0.5F, 4.0F, 0.0F);
		rightArm.addChild(rightWeaponPoint);
		rightWeaponPoint.texOffs(3, 2).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg5);
		setRotationAngle(leftLeg5, -0.7418F, 0.0F, 0.0F);
		leftLeg5.texOffs(0, 12).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(2.0F, 3.0F, 0.0F);
		leftLeg5.addChild(leftLeg2);
		setRotationAngle(leftLeg2, 1.4835F, 0.0F, 0.0F);
		leftLeg2.texOffs(1, 26).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 7.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		setRotationAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
		leftLeg3.texOffs(0, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setPos(0.0F, 5.0F, -1.5F);
		leftLeg3.addChild(leftLeg6);
		setRotationAngle(leftLeg6, -0.0436F, 0.0F, 0.0F);
		leftLeg6.texOffs(0, 48).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

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
		rightLeg5.texOffs(0, 12).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.0F, true);

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg5.addChild(rightLeg6);
		setRotationAngle(rightLeg6, 1.4835F, 0.0F, 0.0F);
		rightLeg6.texOffs(1, 26).addBox(-1.9F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, true);

		rightLeg7 = new ModelRenderer(this);
		rightLeg7.setPos(0.0F, 7.0F, 0.0F);
		rightLeg6.addChild(rightLeg7);
		setRotationAngle(rightLeg7, -0.6981F, 0.0F, 0.0F);
		rightLeg7.texOffs(0, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setPos(0.0F, 5.0F, -1.5F);
		rightLeg7.addChild(leftLeg4);
		setRotationAngle(leftLeg4, -0.0436F, 0.0F, 0.0F);
		leftLeg4.texOffs(0, 48).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);

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