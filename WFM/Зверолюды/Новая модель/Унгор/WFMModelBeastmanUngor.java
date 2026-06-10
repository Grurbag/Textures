// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBeastmanUngor extends EntityModel<Entity> {
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer head;
	private final ModelRenderer mouth;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_right;
	private final ModelRenderer brov;
	private final ModelRenderer brov2;
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
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

	public WFMModelBeastmanUngor() {
		texWidth = 64;
		texHeight = 64;

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, -1.0F, 0.0F);
		rightArm.texOffs(29, 16).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, true);

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(19.0F, 23.0F, 0.0F);
		rightArm.addChild(rightArm2);
		rightArm2.texOffs(30, 26).addBox(-23.0F, -19.0F, -1.5F, 3.0F, 8.0F, 4.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -2.0F, -1.0F);
		head.texOffs(0, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.3F, false);

		mouth = new ModelRenderer(this);
		mouth.setPos(0.0F, 2.4959F, -2.1234F);
		head.addChild(mouth);
		mouth.texOffs(58, 0).addBox(-1.5F, -1.9743F, -2.9851F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		ear_left = new ModelRenderer(this);
		ear_left.setPos(4.0F, 0.0F, -1.0F);
		head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, -0.4363F, 0.0F);
		ear_left.texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		ear_right = new ModelRenderer(this);
		ear_right.setPos(-4.0F, 0.0F, -1.0F);
		head.addChild(ear_right);
		setRotationAngle(ear_right, -3.1416F, -0.6109F, 3.1416F);
		ear_right.texOffs(0, 0).addBox(0.0F, -5.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		horn_left = new ModelRenderer(this);
		horn_left.setPos(2.0F, -7.0F, -5.0F);
		head.addChild(horn_left);
		setRotationAngle(horn_left, 0.5672F, 0.0F, 0.0F);
		horn_left.texOffs(0, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		horn_right = new ModelRenderer(this);
		horn_right.setPos(-2.0F, -7.0F, -5.0F);
		head.addChild(horn_right);
		setRotationAngle(horn_right, 0.5672F, 0.0F, 0.0F);
		horn_right.texOffs(0, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		brov = new ModelRenderer(this);
		brov.setPos(2.0F, -3.5F, -5.3F);
		head.addChild(brov);
		setRotationAngle(brov, 0.0F, 0.0F, -0.2182F);
		brov.texOffs(0, 5).addBox(-1.0F, -1.3F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		brov2 = new ModelRenderer(this);
		brov2.setPos(-2.0F, -3.5F, -5.3F);
		head.addChild(brov2);
		setRotationAngle(brov2, 0.0F, 0.0F, 0.2182F);
		brov2.texOffs(0, 5).addBox(-1.0F, -1.3F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 8.0F, 0.0F);
		body.texOffs(11, 39).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 6.0F, 6.0F, 0.0F, false);
		body.texOffs(33, 53).addBox(-4.0F, -10.0F, -2.0F, 8.0F, 4.0F, 5.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -9.0F, 0.0F);
		body.addChild(leftArm);
		leftArm.texOffs(29, 16).addBox(0.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.0F, false);

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(24.0F, 23.0F, 1.0F);
		leftArm.addChild(leftArm2);
		leftArm2.texOffs(30, 26).addBox(-23.0F, -19.0F, -2.5F, 3.0F, 8.0F, 4.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(0.0F, 9.0F, 0.0F);
		

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, -0.1745F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(48, 17).addBox(0.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(0.0F, 6.0F, 0.0F);
		leftLeg.addChild(leftLeg2);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(3.0F, 0.0F, 0.0F);
		leftLeg2.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.48F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 3.0F, -1.0F);
		leftLeg2.addChild(leftLeg3);
		leftLeg3.texOffs(48, 39).addBox(0.0F, 0.4351F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(0.0F, 9.0F, 0.0F);
		

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.1745F, 0.0F, 0.0F);
		RightLeg_r3.texOffs(48, 17).addBox(-4.1F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(0.0F, 6.0F, 0.0F);
		rightLeg.addChild(rightLeg2);
		

		RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setPos(-1.0F, 0.0F, 0.0F);
		rightLeg2.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.48F, 0.0F, 0.0F);
		RightLeg_r4.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, true);

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(0.0F, 3.0F, -1.0F);
		rightLeg2.addChild(rightLeg3);
		rightLeg3.texOffs(48, 39).addBox(-4.0F, 0.4351F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}