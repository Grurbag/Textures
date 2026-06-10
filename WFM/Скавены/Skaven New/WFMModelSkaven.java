// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkaven extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer earRight_r1;
	private final ModelRenderer earLeft_r1;
	private final ModelRenderer jaw_top;
	private final ModelRenderer jaw_bot;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer teeth_mouth_r1;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Body;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLegFur_r1;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer leftLeg_r2;
	private final ModelRenderer tail;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer rightLeg_r2;
	private final ModelRenderer rightLegFur_r1;
	private final ModelRenderer rightArm;

	public WFMModelSkaven() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 4.0F, -5.0F);
		head.texOffs(0, 0).addBox(-3.5F, -4.0F, -6.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);
		head.texOffs(16, 45).addBox(-3.5F, -4.0F, -6.0F, 7.0F, 6.0F, 6.0F, 0.2F, false);

		earRight_r1 = new ModelRenderer(this);
		earRight_r1.setPos(-3.5F, -2.5F, -2.0F);
		head.addChild(earRight_r1);
		setRotationAngle(earRight_r1, 0.2182F, -0.3054F, 0.0F);
		earRight_r1.texOffs(22, 0).addBox(-0.5F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		earLeft_r1 = new ModelRenderer(this);
		earLeft_r1.setPos(4.5F, -2.5F, -2.0F);
		head.addChild(earLeft_r1);
		setRotationAngle(earLeft_r1, 0.2182F, 0.3054F, 0.0F);
		earLeft_r1.texOffs(41, -4).addBox(-0.5F, -1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		jaw_top = new ModelRenderer(this);
		jaw_top.setPos(0.0F, -1.6667F, -8.0333F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1745F, 0.0F, 0.0F);
		jaw_top.texOffs(44, 0).addBox(-2.5F, -1.9333F, -2.4667F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		jaw_top.texOffs(20, 0).addBox(-1.0F, -2.3333F, -2.9667F, 2.0F, 2.0F, 2.0F, -0.2F, false);
		jaw_top.texOffs(1, 0).addBox(-1.0F, 0.6667F, -2.3667F, 2.0F, 3.0F, 0.0F, 0.0F, false);
		jaw_top.texOffs(29, 7).addBox(-2.0F, 0.6667F, -2.4667F, 4.0F, 1.0F, 5.0F, 0.0F, false);

		jaw_bot = new ModelRenderer(this);
		jaw_bot.setPos(0.0F, 1.5F, -6.0F);
		head.addChild(jaw_bot);
		

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setPos(0.0F, 0.0F, -3.0F);
		jaw_bot.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.3054F, 0.0F, 0.0F);
		teeth_r1.texOffs(0, 4).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		teeth_mouth_r1 = new ModelRenderer(this);
		teeth_mouth_r1.setPos(0.0F, -1.0F, 0.0F);
		jaw_bot.addChild(teeth_mouth_r1);
		setRotationAngle(teeth_mouth_r1, 0.3054F, 0.0F, 0.0F);
		teeth_mouth_r1.texOffs(29, 0).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 0.0F, 0.0F);
		jaw_bot.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3054F, 0.0F, 0.0F);
		Head_r1.texOffs(46, 8).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 7.0F, -2.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.texOffs(16, 13).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.texOffs(16, 29).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.2F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, 4.0F, -4.0F);
		leftArm.texOffs(40, 15).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		leftArm.texOffs(40, 38).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, true);
		leftArm.texOffs(40, 25).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.5F, true);
		leftArm.texOffs(42, 48).addBox(0.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.3F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(3.0F, 12.0F, 0.0F);
		setRotationAngle(leftLeg, 0.1745F, 0.0F, 0.0F);
		

		leftLegFur_r1 = new ModelRenderer(this);
		leftLegFur_r1.setPos(-6.1F, -1.0F, 0.0F);
		leftLeg.addChild(leftLegFur_r1);
		setRotationAngle(leftLegFur_r1, -0.4363F, 0.0F, 0.0F);
		leftLegFur_r1.texOffs(0, 41).addBox(4.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.2F, true);
		leftLegFur_r1.texOffs(0, 13).addBox(4.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setPos(0.0F, 11.606F, -3.9278F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, -0.1745F, 0.0F, 0.0F);
		leftLeg_r1.texOffs(0, 36).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		leftLeg_r2 = new ModelRenderer(this);
		leftLeg_r2.setPos(-0.1F, 5.0F, -3.0F);
		leftLeg.addChild(leftLeg_r2);
		setRotationAngle(leftLeg_r2, 0.0873F, 0.0F, 0.0F);
		leftLeg_r2.texOffs(0, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, -0.5F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 12.0F, 1.0F);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.texOffs(0, 60).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		tail.texOffs(8, 42).addBox(0.0F, -3.0F, 2.0F, 0.0F, 7.0F, 15.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-3.0F, 12.0F, 0.0F);
		setRotationAngle(rightLeg, 0.1745F, 0.0F, 0.0F);
		

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setPos(0.0F, 11.606F, -3.9278F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.1745F, 0.0F, 0.0F);
		rightLeg_r1.texOffs(0, 36).addBox(-2.0F, -0.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);

		rightLeg_r2 = new ModelRenderer(this);
		rightLeg_r2.setPos(-0.1F, 5.0F, -3.0F);
		rightLeg.addChild(rightLeg_r2);
		setRotationAngle(rightLeg_r2, 0.0873F, 0.0F, 0.0F);
		rightLeg_r2.texOffs(0, 25).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, -0.5F, true);

		rightLegFur_r1 = new ModelRenderer(this);
		rightLegFur_r1.setPos(-0.1F, -1.0F, 0.0F);
		rightLeg.addChild(rightLegFur_r1);
		setRotationAngle(rightLegFur_r1, -0.4363F, 0.0F, 0.0F);
		rightLegFur_r1.texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.2F, true);
		rightLegFur_r1.texOffs(0, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, 4.0F, -4.0F);
		rightArm.texOffs(40, 15).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		rightArm.texOffs(40, 25).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.5F, true);
		rightArm.texOffs(40, 38).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, true);
		rightArm.texOffs(42, 48).addBox(-4.0F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.3F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}