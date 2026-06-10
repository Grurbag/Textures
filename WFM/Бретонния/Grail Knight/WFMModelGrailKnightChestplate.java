// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGrailKnightChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer cape;
	private final ModelRenderer rightArm;
	private final ModelRenderer RightArm_r3;
	private final ModelRenderer leftArm;
	private final ModelRenderer RightArm_r4;

	public WFMModelGrailKnightChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		body.texOffs(0, 18).addBox(-3.5F, 3.0F, -3.0F, 7.0F, 7.0F, 0.0F, 0.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(4.7113F, 3.5498F, -3.75F);
		body.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0036F, -0.001F, 0.1746F);
		RightArm_r1.texOffs(0, 37).addBox(-3.5F, -2.75F, -0.05F, 5.0F, 5.0F, 1.0F, -0.4F, false);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(-4.7113F, 3.5498F, -3.75F);
		body.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0036F, 0.001F, -0.1746F);
		RightArm_r2.texOffs(0, 37).addBox(-1.5F, -2.75F, -0.05F, 5.0F, 5.0F, 1.0F, -0.4F, true);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, -0.5F, 2.8F);
		body.addChild(cape);
		cape.texOffs(40, 43).addBox(-6.0F, -0.5F, 0.0F, 12.0F, 21.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		RightArm_r3 = new ModelRenderer(this);
		RightArm_r3.setPos(-1.0F, -0.5F, 0.0F);
		rightArm.addChild(RightArm_r3);
		setRotationAngle(RightArm_r3, 0.0F, 0.0F, -0.1309F);
		RightArm_r3.texOffs(40, 0).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, -0.15F, true);
		RightArm_r3.texOffs(16, 32).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm_r4 = new ModelRenderer(this);
		RightArm_r4.setPos(1.0F, -0.5F, -4.0F);
		leftArm.addChild(RightArm_r4);
		setRotationAngle(RightArm_r4, 0.0F, 0.0F, 0.1309F);
		RightArm_r4.texOffs(40, 32).addBox(-2.75F, -2.5F, 1.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r4.texOffs(40, 0).addBox(-2.75F, -2.5F, 1.0F, 6.0F, 5.0F, 6.0F, -0.15F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}