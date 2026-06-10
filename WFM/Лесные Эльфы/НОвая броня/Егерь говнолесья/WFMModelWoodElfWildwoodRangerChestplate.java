// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfWildwoodRangerChestplate extends EntityModel<Entity> {
	private final ModelRenderer rightArm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer body;
	private final ModelRenderer gem_r1;
	private final ModelRenderer gem_r2;
	private final ModelRenderer cape;
	private final ModelRenderer leftArm;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer shoulderLeft;
	private final ModelRenderer RightArm_r1;

	public WFMModelWoodElfWildwoodRangerChestplate() {
		texWidth = 64;
		texHeight = 64;

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-3.0F, 9.0F, 0.0F);
		rightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, -2.3562F, 0.0F, 2.8362F);
		cube_r1.texOffs(0, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-3.0F, 7.0F, 0.0F);
		rightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, -2.3562F, 0.0F, 2.8362F);
		cube_r2.texOffs(10, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-3.0F, 5.0F, 0.0F);
		rightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.3562F, 0.0F, 2.8362F);
		cube_r3.texOffs(20, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(10.0F, 0.0F, 0.0F);
		rightArm.addChild(shoulderRight);
		

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-11.2479F, -0.4674F, 0.0F);
		shoulderRight.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.texOffs(40, 43).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);
		LeftArm_r1.texOffs(40, 32).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		gem_r1 = new ModelRenderer(this);
		gem_r1.setPos(0.0F, 1.7F, -2.0F);
		body.addChild(gem_r1);
		setRotationAngle(gem_r1, 0.0F, 0.0F, -0.7854F);
		gem_r1.texOffs(0, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		gem_r2 = new ModelRenderer(this);
		gem_r2.setPos(0.0F, 9.7F, -2.0F);
		body.addChild(gem_r2);
		setRotationAngle(gem_r2, 0.0F, 0.0F, -0.7854F);
		gem_r2.texOffs(0, 32).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 0.0F, 3.0F);
		body.addChild(cape);
		cape.texOffs(40, 0).addBox(-6.0F, 0.0F, 0.0F, 12.0F, 23.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(0, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(3.0F, 5.0F, 0.0F);
		leftArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.3054F);
		cube_r4.texOffs(20, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(3.0F, 7.0F, 0.0F);
		leftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.3054F);
		cube_r5.texOffs(10, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(3.0F, 9.0F, 0.0F);
		leftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.3054F);
		cube_r6.texOffs(0, 56).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

		shoulderLeft = new ModelRenderer(this);
		shoulderLeft.setPos(0.0F, 0.0F, 0.0F);
		leftArm.addChild(shoulderLeft);
		

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(1.0F, -0.5F, 0.0F);
		shoulderLeft.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r1.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}