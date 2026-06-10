// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelVampireBloodKnightHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer wingLeft;
	private final ModelRenderer wingRight;
	private final ModelRenderer dragon;
	private final ModelRenderer dragon_r1;
	private final ModelRenderer dragon_r2;

	public WFMModelVampireBloodKnightHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 22).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		wingLeft = new ModelRenderer(this);
		wingLeft.setPos(1.0F, -6.6428F, -4.766F);
		head.addChild(wingLeft);
		setRotationAngle(wingLeft, -0.6863F, -0.1396F, -0.1682F);
		wingLeft.texOffs(0, 51).addBox(0.0F, -13.0F, 0.0F, 14.0F, 13.0F, 0.0F, 0.0F, false);
		wingLeft.texOffs(60, 42).addBox(3.0F, -6.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 42).addBox(8.0F, -8.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 42).addBox(11.0F, -8.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 42).addBox(7.0F, -1.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 39).addBox(8.0F, -7.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 39).addBox(8.0F, -9.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 39).addBox(4.0F, -5.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 39).addBox(11.0F, -7.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 39).addBox(11.0F, -9.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 39).addBox(12.0F, -10.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 37).addBox(10.0F, -6.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 37).addBox(8.0F, -6.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 37).addBox(7.0F, -5.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 37).addBox(7.0F, -2.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(6.0F, -2.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(8.0F, -2.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(10.0F, -5.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(4.0F, -4.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(12.0F, -11.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(12.0F, -12.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(9.0F, -4.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(7.0F, -4.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 33).addBox(5.0F, -3.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(2.0F, -7.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 35).addBox(7.0F, -10.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 33).addBox(7.0F, -3.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 33).addBox(9.0F, -3.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingLeft.texOffs(60, 33).addBox(12.0F, -13.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wingRight = new ModelRenderer(this);
		wingRight.setPos(-1.0F, -6.6428F, -4.766F);
		head.addChild(wingRight);
		setRotationAngle(wingRight, -0.6942F, 0.1454F, 0.1062F);
		wingRight.texOffs(0, 51).addBox(-14.0F, -13.0F, 0.0F, 14.0F, 13.0F, 0.0F, 0.0F, true);
		wingRight.texOffs(60, 35).addBox(-5.0F, -4.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-7.0F, -2.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-9.0F, -2.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-11.0F, -5.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-10.0F, -4.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-8.0F, -4.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-8.0F, -10.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-13.0F, -11.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 35).addBox(-13.0F, -12.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 42).addBox(-4.0F, -6.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 42).addBox(-8.0F, -1.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 42).addBox(-9.0F, -8.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 42).addBox(-12.0F, -8.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 39).addBox(-5.0F, -5.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 39).addBox(-9.0F, -7.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 39).addBox(-9.0F, -9.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 39).addBox(-12.0F, -9.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 39).addBox(-12.0F, -7.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 37).addBox(-8.0F, -5.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 37).addBox(-9.0F, -6.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 37).addBox(-11.0F, -6.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 37).addBox(-13.0F, -10.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 33).addBox(-13.0F, -13.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 33).addBox(-10.0F, -3.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 33).addBox(-8.0F, -3.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wingRight.texOffs(60, 33).addBox(-6.0F, -3.0F, -0.434F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		dragon = new ModelRenderer(this);
		dragon.setPos(0.0F, -7.0F, -8.0F);
		head.addChild(dragon);
		

		dragon_r1 = new ModelRenderer(this);
		dragon_r1.setPos(0.0F, -1.0F, 0.0F);
		dragon.addChild(dragon_r1);
		setRotationAngle(dragon_r1, 0.0F, -0.2182F, 0.0F);
		dragon_r1.texOffs(38, 40).addBox(0.0F, -10.0F, 0.0F, 0.0F, 10.0F, 13.0F, 0.0F, false);

		dragon_r2 = new ModelRenderer(this);
		dragon_r2.setPos(0.0F, -1.0F, 0.0F);
		dragon.addChild(dragon_r2);
		setRotationAngle(dragon_r2, 0.0F, 0.2182F, 0.0F);
		dragon_r2.texOffs(38, 40).addBox(0.0F, -10.0F, 0.0F, 0.0F, 10.0F, 13.0F, 0.0F, false);
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