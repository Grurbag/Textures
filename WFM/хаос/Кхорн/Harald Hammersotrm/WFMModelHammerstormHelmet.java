// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelHammerstormHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer hornFront3;
	private final ModelRenderer hornFront4;
	private final ModelRenderer hornFront;
	private final ModelRenderer hornFront2;
	private final ModelRenderer spike;
	private final ModelRenderer hornRight;
	private final ModelRenderer hornRight2;
	private final ModelRenderer hornRight3;
	private final ModelRenderer hornRight4;
	private final ModelRenderer hornRight5;
	private final ModelRenderer hornLeft;
	private final ModelRenderer hornLeft2;
	private final ModelRenderer hornLeft3;
	private final ModelRenderer hornLeft4;
	private final ModelRenderer hornLeft5;

	public WFMModelHammerstormHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 23.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 16).addBox(-4.5F, -9.0F, -5.1F, 9.0F, 10.0F, 0.0F, 0.0F, false);
		head.texOffs(0, 55).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		hornFront3 = new ModelRenderer(this);
		hornFront3.setPos(-4.4122F, -2.2855F, -3.6847F);
		head.addChild(hornFront3);
		setRotationAngle(hornFront3, 0.9473F, -1.0984F, -2.9421F);
		hornFront3.texOffs(18, 24).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		hornFront3.texOffs(18, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);

		hornFront4 = new ModelRenderer(this);
		hornFront4.setPos(0.0F, -1.75F, 0.0F);
		hornFront3.addChild(hornFront4);
		setRotationAngle(hornFront4, -0.2618F, 0.0F, 0.0F);
		hornFront4.texOffs(20, 30).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hornFront = new ModelRenderer(this);
		hornFront.setPos(2.0F, -9.5F, -4.25F);
		head.addChild(hornFront);
		setRotationAngle(hornFront, 0.6713F, -0.2068F, 0.231F);
		hornFront.texOffs(18, 24).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		hornFront.texOffs(18, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.3F, false);

		hornFront2 = new ModelRenderer(this);
		hornFront2.setPos(0.0F, -3.5F, 0.0F);
		hornFront.addChild(hornFront2);
		setRotationAngle(hornFront2, -0.2618F, 0.0F, 0.0F);
		hornFront2.texOffs(20, 30).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		spike = new ModelRenderer(this);
		spike.setPos(0.0F, -10.0F, 0.0F);
		head.addChild(spike);
		setRotationAngle(spike, 0.0F, 0.7854F, 0.0F);
		spike.texOffs(27, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		spike.texOffs(35, 25).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		spike.texOffs(37, 21).addBox(-0.5F, -8.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		spike.texOffs(34, 30).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(-4.0F, -9.0F, 0.5F);
		head.addChild(hornRight);
		setRotationAngle(hornRight, 0.0F, 0.0F, -0.9163F);
		hornRight.texOffs(52, 55).addBox(-2.0F, -5.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.3F, true);
		hornRight.texOffs(46, 50).addBox(-5.2359F, -5.0534F, -0.5F, 3.0F, 5.0F, 0.0F, 0.0F, true);
		hornRight.texOffs(36, 57).addBox(-2.5F, -2.25F, -2.5F, 4.0F, 3.0F, 4.0F, 0.0F, true);

		hornRight2 = new ModelRenderer(this);
		hornRight2.setPos(-0.7359F, -4.0534F, -0.5F);
		hornRight.addChild(hornRight2);
		setRotationAngle(hornRight2, 0.0F, 0.0F, 0.9163F);
		hornRight2.texOffs(52, 47).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, true);
		hornRight2.texOffs(46, 50).addBox(-4.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, true);

		hornRight3 = new ModelRenderer(this);
		hornRight3.setPos(0.0F, -4.5F, 0.0F);
		hornRight2.addChild(hornRight3);
		setRotationAngle(hornRight3, 0.0F, 0.0F, 0.7854F);
		hornRight3.texOffs(56, 39).addBox(-0.8566F, -5.7952F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		hornRight3.texOffs(46, 50).addBox(-3.75F, -4.5F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, true);

		hornRight4 = new ModelRenderer(this);
		hornRight4.setPos(0.0923F, -4.7011F, 0.0F);
		hornRight3.addChild(hornRight4);
		setRotationAngle(hornRight4, 0.0F, 0.0F, -0.6545F);
		hornRight4.texOffs(56, 32).addBox(-0.8566F, -4.7952F, -1.0F, 2.0F, 5.0F, 2.0F, -0.1F, true);

		hornRight5 = new ModelRenderer(this);
		hornRight5.setPos(0.6434F, -4.2952F, 0.0F);
		hornRight4.addChild(hornRight5);
		setRotationAngle(hornRight5, 0.0F, 0.0F, -0.1309F);
		hornRight5.texOffs(46, 25).addBox(-6.5F, -3.0F, 0.0F, 9.0F, 5.0F, 0.0F, 0.0F, true);

		hornLeft = new ModelRenderer(this);
		hornLeft.setPos(4.0F, -9.0F, 0.5F);
		head.addChild(hornLeft);
		setRotationAngle(hornLeft, 0.0F, 0.0F, 0.9163F);
		hornLeft.texOffs(52, 55).addBox(-1.0F, -5.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.3F, false);
		hornLeft.texOffs(46, 50).addBox(2.2359F, -5.0534F, -0.5F, 3.0F, 5.0F, 0.0F, 0.0F, false);
		hornLeft.texOffs(36, 57).addBox(-1.5F, -2.25F, -2.5F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		hornLeft2 = new ModelRenderer(this);
		hornLeft2.setPos(0.7359F, -4.0534F, -0.5F);
		hornLeft.addChild(hornLeft2);
		setRotationAngle(hornLeft2, 0.0F, 0.0F, -0.9163F);
		hornLeft2.texOffs(52, 47).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		hornLeft2.texOffs(46, 50).addBox(1.5F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		hornLeft3 = new ModelRenderer(this);
		hornLeft3.setPos(0.0F, -4.5F, 0.0F);
		hornLeft2.addChild(hornLeft3);
		setRotationAngle(hornLeft3, 0.0F, 0.0F, -0.7854F);
		hornLeft3.texOffs(56, 39).addBox(-1.1434F, -5.7952F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		hornLeft3.texOffs(46, 50).addBox(0.75F, -4.5F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		hornLeft4 = new ModelRenderer(this);
		hornLeft4.setPos(-0.0923F, -4.7011F, 0.0F);
		hornLeft3.addChild(hornLeft4);
		setRotationAngle(hornLeft4, 0.0F, 0.0F, 0.6545F);
		hornLeft4.texOffs(56, 32).addBox(-1.1434F, -4.7952F, -1.0F, 2.0F, 5.0F, 2.0F, -0.1F, false);

		hornLeft5 = new ModelRenderer(this);
		hornLeft5.setPos(-0.6434F, -4.2952F, 0.0F);
		hornLeft4.addChild(hornLeft5);
		setRotationAngle(hornLeft5, 0.0F, 0.0F, 0.1309F);
		hornLeft5.texOffs(46, 25).addBox(-2.5F, -3.0F, 0.0F, 9.0F, 5.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}