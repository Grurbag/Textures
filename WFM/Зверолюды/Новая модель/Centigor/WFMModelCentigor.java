// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCentigor extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer head;
	private final ModelRenderer mouth;
	private final ModelRenderer borodka_r1;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer horn_left4;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_right4;
	private final ModelRenderer griva;
	private final ModelRenderer leftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer rightLeg;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer RightLeg_r4;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer leftLegBack;
	private final ModelRenderer RightLeg_r5;
	private final ModelRenderer leftLeg5;
	private final ModelRenderer RightLeg_r6;
	private final ModelRenderer leftLeg6;
	private final ModelRenderer rightLegBack;
	private final ModelRenderer RightLeg_r7;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer RightLeg_r8;
	private final ModelRenderer rightLeg6;

	public WFMModelCentigor() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, -1.3333F, 3.3333F);
		body.texOffs(12, 39).addBox(-4.0F, -3.6667F, -5.3333F, 8.0F, 6.0F, 5.0F, 0.0F, false);
		body.texOffs(30, 51).addBox(-5.0F, -9.6667F, -6.3333F, 10.0F, 6.0F, 7.0F, 0.0F, false);
		body.texOffs(64, 32).addBox(-5.0F, 2.3333F, -5.3333F, 10.0F, 10.0F, 22.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(-1.0F, 3.3333F, 16.6667F);
		body.addChild(tail);
		setRotationAngle(tail, 0.1745F, 0.0F, 0.0F);
		tail.texOffs(114, 36).addBox(-0.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -8.6667F, -3.3333F);
		body.addChild(leftArm);
		leftArm.texOffs(29, 16).addBox(1.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, false);

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(3.0F, 8.5F, 0.5F);
		leftArm.addChild(leftArm2);
		leftArm2.texOffs(30, 26).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, -8.6667F, -3.3333F);
		body.addChild(rightArm);
		rightArm.texOffs(29, 16).addBox(-4.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, true);

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(-3.0F, 8.5F, 0.5F);
		rightArm.addChild(rightArm2);
		rightArm2.texOffs(30, 26).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -8.6667F, -4.3333F);
		body.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.3F, false);

		mouth = new ModelRenderer(this);
		mouth.setPos(0.0F, -2.5041F, -6.1234F);
		head.addChild(mouth);
		setRotationAngle(mouth, 0.2182F, 0.0F, 0.0F);
		

		borodka_r1 = new ModelRenderer(this);
		borodka_r1.setPos(0.0F, 4.1034F, -1.8892F);
		mouth.addChild(borodka_r1);
		setRotationAngle(borodka_r1, -0.0873F, 0.0F, 0.0F);
		borodka_r1.texOffs(58, 11).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setPos(0.0F, -0.3251F, -0.9381F);
		mouth.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.3927F, 0.0F, 0.0F);
		teeth_r1.texOffs(0, 16).addBox(-2.5F, 0.1667F, -2.5F, 5.0F, 3.0F, 4.0F, -0.6F, false);
		teeth_r1.texOffs(0, 16).addBox(-2.5F, -2.8333F, -2.5F, 5.0F, 3.0F, 4.0F, -0.6F, false);
		teeth_r1.texOffs(0, 25).addBox(-3.0F, -3.8333F, -2.5F, 6.0F, 7.0F, 7.0F, -0.5F, false);

		ear_left = new ModelRenderer(this);
		ear_left.setPos(4.0F, -4.0F, -1.0F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, -0.4363F, 0.0F);
		ear_left.texOffs(0, 0).addBox(0.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		ear_right = new ModelRenderer(this);
		ear_right.setPos(-4.0F, -4.0F, -1.0F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, -3.1416F, -0.6109F, 3.1416F);
		ear_right.texOffs(0, 0).addBox(-0.0001F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		horn_left = new ModelRenderer(this);
		horn_left.setPos(-4.0F, -7.0F, 0.0F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.7821F, -0.5921F, -0.0787F);
		horn_left.texOffs(112, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		horn_left2 = new ModelRenderer(this);
		horn_left2.setPos(0.0F, 0.0F, 2.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, -0.3927F, 0.0F, 0.0F);
		horn_left2.texOffs(116, 8).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

		horn_left3 = new ModelRenderer(this);
		horn_left3.setPos(-1.0F, 0.0F, 3.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, -0.3927F, 0.0F, 0.0F);
		horn_left3.texOffs(118, 15).addBox(1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		horn_left4 = new ModelRenderer(this);
		horn_left4.setPos(0.0F, 0.0F, 3.0F);
		horn_left3.addChild(horn_left4);
		horn_left4.texOffs(120, 23).addBox(1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		horn_right = new ModelRenderer(this);
		horn_right.setPos(3.0F, -7.0F, 0.0F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.6862F, 0.6702F, -0.0834F);
		horn_right.texOffs(112, 0).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);

		horn_right2 = new ModelRenderer(this);
		horn_right2.setPos(0.0F, 0.0F, 2.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, -0.3927F, 0.0F, 0.0F);
		horn_right2.texOffs(116, 8).addBox(-0.5F, -2.0F, 0.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

		horn_right3 = new ModelRenderer(this);
		horn_right3.setPos(-1.0F, 0.0F, 3.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, -0.3927F, 0.0F, 0.0F);
		horn_right3.texOffs(118, 15).addBox(1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);

		horn_right4 = new ModelRenderer(this);
		horn_right4.setPos(0.0F, 0.0F, 3.0F);
		horn_right3.addChild(horn_right4);
		horn_right4.texOffs(120, 23).addBox(1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		griva = new ModelRenderer(this);
		griva.setPos(0.0F, -5.0F, 2.0F);
		head.addChild(griva);
		griva.texOffs(80, -8).addBox(-2.0F, -2.0F, 0.0F, 0.0F, 17.0F, 8.0F, 0.0F, false);
		griva.texOffs(80, -8).addBox(2.0F, -2.0F, 0.0F, 0.0F, 17.0F, 8.0F, 0.0F, false);
		griva.texOffs(80, -8).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 17.0F, 8.0F, 0.0F, false);
		griva.texOffs(80, -8).addBox(1.0F, -2.0F, 0.0F, 0.0F, 17.0F, 8.0F, 0.0F, false);
		griva.texOffs(80, -8).addBox(0.0F, -2.0F, 0.0F, 0.0F, 17.0F, 8.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 9.0F, 0.0F);
		

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.1745F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(48, 17).addBox(0.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(28.0F, 15.0F, 0.0F);
		leftLeg.addChild(leftLeg2);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(-25.0F, -9.0F, 0.0F);
		leftLeg2.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.48F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 0.0F, -1.0F);
		leftLeg2.addChild(leftLeg3);
		leftLeg3.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 9.0F, 0.0F);
		

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.1745F, 0.0F, 0.0F);
		RightLeg_r3.texOffs(48, 17).addBox(-4.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(24.0F, 15.0F, 0.0F);
		rightLeg.addChild(rightLeg2);
		

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setPos(-25.0F, -9.0F, 0.0F);
		rightLeg2.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.48F, 0.0F, 0.0F);
		RightLeg_r4.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, true);

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(0.0F, 0.0F, -1.0F);
		rightLeg2.addChild(rightLeg3);
		rightLeg3.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		leftLegBack = new ModelRenderer(this);
		leftLegBack.setPos(1.0F, 9.0F, 17.0F);
		

		RightLeg_r5 = new ModelRenderer(this);
		RightLeg_r5.setPos(0.0F, 0.0F, 0.0F);
		leftLegBack.addChild(RightLeg_r5);
		setRotationAngle(RightLeg_r5, -0.1745F, 0.0F, 0.0F);
		RightLeg_r5.texOffs(48, 17).addBox(0.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(28.0F, 15.0F, 0.0F);
		leftLegBack.addChild(leftLeg5);
		

		RightLeg_r6 = new ModelRenderer(this);
		RightLeg_r6.setPos(-25.0F, -9.0F, 0.0F);
		leftLeg5.addChild(RightLeg_r6);
		setRotationAngle(RightLeg_r6, 0.48F, 0.0F, 0.0F);
		RightLeg_r6.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setPos(0.0F, 0.0F, -1.0F);
		leftLeg5.addChild(leftLeg6);
		leftLeg6.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightLegBack = new ModelRenderer(this);
		rightLegBack.setPos(-1.0F, 9.0F, 17.0F);
		

		RightLeg_r7 = new ModelRenderer(this);
		RightLeg_r7.setPos(0.0F, 0.0F, 0.0F);
		rightLegBack.addChild(RightLeg_r7);
		setRotationAngle(RightLeg_r7, -0.1745F, 0.0F, 0.0F);
		RightLeg_r7.texOffs(48, 17).addBox(-4.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		rightLeg5 = new ModelRenderer(this);
		rightLeg5.setPos(24.0F, 15.0F, 0.0F);
		rightLegBack.addChild(rightLeg5);
		

		RightLeg_r8 = new ModelRenderer(this);
		RightLeg_r8.setPos(-25.0F, -9.0F, 0.0F);
		rightLeg5.addChild(RightLeg_r8);
		setRotationAngle(RightLeg_r8, 0.48F, 0.0F, 0.0F);
		RightLeg_r8.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, true);

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setPos(0.0F, 0.0F, -1.0F);
		rightLeg5.addChild(rightLeg6);
		rightLeg6.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}