// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfRangerLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer LeftLeg_r1;
	private final ModelRenderer pounch;
	private final ModelRenderer rightLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer RightLeg_r3;
	private final ModelRenderer mug;

	public WFMModelDwarfRangerLegs() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.65F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(-3.8F, 1.0F, 0.0F);
		leftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.0436F);
		RightLeg_r1.texOffs(32, 0).addBox(3.0F, 1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 1.3F, true);

		LeftLeg_r1 = new ModelRenderer(this);
		LeftLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		leftLeg.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, 0.0F, 0.0F, -0.0436F);
		LeftLeg_r1.texOffs(16, 0).addBox(-1.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.1F, true);

		pounch = new ModelRenderer(this);
		pounch.setPos(3.0F, 4.0F, -4.0F);
		leftLeg.addChild(pounch);
		setRotationAngle(pounch, -0.126F, -0.0594F, -0.1642F);
		pounch.texOffs(0, 57).addBox(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		pounch.texOffs(4, 53).addBox(-0.9F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pounch.texOffs(3, 48).addBox(-1.4F, -6.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.65F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, 1.0F, 0.0F);
		rightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(32, 0).addBox(-3.0F, 1.0F, -2.0F, 4.0F, 11.0F, 4.0F, 1.3F, false);

		RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setPos(0.0F, -1.0F, 0.0F);
		rightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, 0.0F, 0.0F, 0.0436F);
		RightLeg_r3.texOffs(16, 0).addBox(-3.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.1F, false);

		mug = new ModelRenderer(this);
		mug.setPos(-3.0219F, 1.3281F, -3.0F);
		rightLeg.addChild(mug);
		setRotationAngle(mug, 2.0713F, -0.2094F, -1.342F);
		mug.texOffs(44, 52).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 7.0F, 5.0F, -0.5F, false);
		mug.texOffs(48, 41).addBox(-2.4781F, -3.0F, -1.5F, 4.0F, 6.0F, 4.0F, -0.5F, false);
		mug.texOffs(58, 35).addBox(1.0F, -2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mug.texOffs(58, 35).addBox(1.0F, 2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mug.texOffs(60, 29).addBox(2.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}