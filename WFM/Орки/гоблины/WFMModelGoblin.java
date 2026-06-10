// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGoblin extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer leftHand;
	private final ModelRenderer rightHand;
	private final ModelRenderer legLeft;
	private final ModelRenderer legLeft2;
	private final ModelRenderer legLeft3;
	private final ModelRenderer legRight;
	private final ModelRenderer legRight2;
	private final ModelRenderer legLeft4;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer nose2;
	private final ModelRenderer earLeft;
	private final ModelRenderer earRight;
	private final ModelRenderer jaw;
	private final ModelRenderer jaw2;
	private final ModelRenderer brovLeft;
	private final ModelRenderer brovRight;

	public WFMModelGoblin() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 10.0F, 1.0F);
		body.texOffs(16, 18).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 10.0F, 4.0F, -0.1F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, -10.0F, -1.0F);
		body.addChild(body2);
		body2.texOffs(15, 15).addBox(-4.0F, 3.0F, -3.0F, 8.0F, 5.0F, 5.0F, 0.1F, false);

		leftHand = new ModelRenderer(this);
		leftHand.setPos(5.0F, 6.0F, -1.0F);
		leftHand.texOffs(40, 16).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.0F, true);

		rightHand = new ModelRenderer(this);
		rightHand.setPos(-5.0F, 6.0F, -1.0F);
		rightHand.texOffs(40, 16).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.0F, false);

		legLeft = new ModelRenderer(this);
		legLeft.setPos(1.9F, 13.0F, 2.0F);
		setRotationAngle(legLeft, -0.3054F, 0.0F, 0.0F);
		legLeft.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		legLeft2 = new ModelRenderer(this);
		legLeft2.setPos(0.0F, 3.1388F, -0.9021F);
		legLeft.addChild(legLeft2);
		setRotationAngle(legLeft2, 0.4363F, 0.0F, 0.0F);
		legLeft2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);

		legLeft3 = new ModelRenderer(this);
		legLeft3.setPos(0.0F, 0.0F, 0.0F);
		legLeft2.addChild(legLeft3);
		setRotationAngle(legLeft3, -0.1309F, 0.0F, 0.0F);
		legLeft3.texOffs(0, 42).addBox(-1.4F, 7.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.0F, true);

		legRight = new ModelRenderer(this);
		legRight.setPos(-2.1F, 13.0F, 2.0F);
		setRotationAngle(legRight, -0.3054F, 0.0F, 0.0F);
		legRight.texOffs(0, 16).addBox(-2.0F, 1.0926F, -2.6014F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		legRight2 = new ModelRenderer(this);
		legRight2.setPos(0.0F, 3.1388F, -0.9021F);
		legRight.addChild(legRight2);
		setRotationAngle(legRight2, 0.4363F, 0.0F, 0.0F);
		legRight2.texOffs(1, 30).addBox(-1.4F, 3.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		legLeft4 = new ModelRenderer(this);
		legLeft4.setPos(-1.0F, 0.0F, 0.0F);
		legRight2.addChild(legLeft4);
		setRotationAngle(legLeft4, -0.1309F, 0.0F, 0.0F);
		legLeft4.texOffs(0, 42).addBox(-1.4F, 7.0F, -4.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 4.0F, -2.0F);
		head.texOffs(0, 0).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, 0.0F, -6.0F);
		head.addChild(nose);
		setRotationAngle(nose, 0.1745F, 0.0F, 0.0F);
		nose.texOffs(52, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);

		nose2 = new ModelRenderer(this);
		nose2.setPos(0.0F, 0.0F, 0.0F);
		nose.addChild(nose2);
		nose2.texOffs(60, 8).addBox(-0.5F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		earLeft = new ModelRenderer(this);
		earLeft.setPos(4.0F, -1.0F, -2.0F);
		head.addChild(earLeft);
		setRotationAngle(earLeft, 0.0F, 0.6545F, 0.0F);
		earLeft.texOffs(24, -6).addBox(0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

		earRight = new ModelRenderer(this);
		earRight.setPos(-4.0F, -1.0F, -2.0F);
		head.addChild(earRight);
		setRotationAngle(earRight, 0.0F, -0.6545F, 0.0F);
		earRight.texOffs(24, -6).addBox(0.0F, -4.0F, 0.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setPos(0.0F, 4.0F, -5.0F);
		head.addChild(jaw);
		setRotationAngle(jaw, 0.3054F, 0.0F, 0.0F);
		jaw.texOffs(18, 39).addBox(-3.5F, -2.0F, -1.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);

		jaw2 = new ModelRenderer(this);
		jaw2.setPos(0.0F, -1.0F, 0.0F);
		jaw.addChild(jaw2);
		jaw2.texOffs(18, 47).addBox(-3.5F, -2.0F, -1.0F, 7.0F, 2.0F, 4.0F, -0.2F, false);

		brovLeft = new ModelRenderer(this);
		brovLeft.setPos(2.5F, -1.5F, -5.5F);
		head.addChild(brovLeft);
		setRotationAngle(brovLeft, 0.0F, 0.0F, -0.1745F);
		brovLeft.texOffs(0, 0).addBox(-1.5F, -1.3F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		brovRight = new ModelRenderer(this);
		brovRight.setPos(-2.5F, -1.5F, -5.5F);
		head.addChild(brovRight);
		setRotationAngle(brovRight, 0.0F, 0.0F, 0.1745F);
		brovRight.texOffs(0, 0).addBox(-1.5F, -1.3F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftHand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightHand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}