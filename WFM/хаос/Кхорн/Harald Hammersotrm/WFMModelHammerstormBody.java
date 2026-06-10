// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelHammerstormBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer belt;
	private final ModelRenderer cape;
	private final ModelRenderer cape2;
	private final ModelRenderer cape3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rightArm;
	private final ModelRenderer Left Arm_r1;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer Left_Arm_r2;
	private final ModelRenderer Left_Arm_r3;
	private final ModelRenderer leftArm;
	private final ModelRenderer Right Arm_r1;
	private final ModelRenderer shoulderLeft;
	private final ModelRenderer Right_Arm_r2;
	private final ModelRenderer Right_Arm_r3;

	public WFMModelHammerstormBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 12.0F, 0.0F);
		body.texOffs(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.69F, false);
		body.texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.9F, false);

		belt = new ModelRenderer(this);
		belt.setPos(0.0F, 10.25F, -3.5F);
		body.addChild(belt);
		setRotationAngle(belt, 0.0F, 0.0F, 0.7854F);
		belt.texOffs(36, 0).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 1.0F, 3.0F);
		body.addChild(cape);
		cape.texOffs(24, 14).addBox(-6.0F, -2.0F, 0.0F, 12.0F, 9.0F, 1.0F, 0.0F, false);
		cape.texOffs(0, 22).addBox(-6.0F, -1.0F, 1.4F, 12.0F, 8.0F, 0.0F, 0.0F, false);
		cape.texOffs(0, 39).addBox(-6.0F, -2.0F, 1.6F, 12.0F, 9.0F, 0.0F, 0.0F, false);
		cape.texOffs(24, 49).addBox(-8.0F, -2.0F, 0.5F, 2.0F, 9.0F, 0.0F, 0.0F, false);
		cape.texOffs(24, 49).addBox(6.0F, -2.0F, 0.5F, 2.0F, 9.0F, 0.0F, 0.0F, true);

		cape2 = new ModelRenderer(this);
		cape2.setPos(0.0F, 7.0F, 1.0F);
		cape.addChild(cape2);
		cape2.texOffs(24, 14).addBox(-6.0F, 0.0F, -1.0F, 12.0F, 9.0F, 1.0F, 0.0F, false);
		cape2.texOffs(0, 22).addBox(-6.0F, 0.0F, 0.4F, 12.0F, 8.0F, 0.0F, 0.0F, false);
		cape2.texOffs(24, 49).addBox(-8.0F, 0.0F, -0.5F, 2.0F, 9.0F, 0.0F, 0.0F, false);
		cape2.texOffs(24, 49).addBox(6.0F, 0.0F, -0.5F, 2.0F, 9.0F, 0.0F, 0.0F, true);

		cape3 = new ModelRenderer(this);
		cape3.setPos(0.0F, 8.0F, 0.0F);
		cape2.addChild(cape3);
		cape3.texOffs(24, 14).addBox(-6.0F, 1.0F, -1.0F, 12.0F, 7.0F, 1.0F, 0.0F, false);
		cape3.texOffs(0, 30).addBox(-6.0F, 0.0F, 0.4F, 12.0F, 9.0F, 0.0F, 0.0F, false);
		cape3.texOffs(24, 49).addBox(-8.0F, 0.0F, -0.5F, 2.0F, 9.0F, 0.0F, 0.0F, false);
		cape3.texOffs(24, 49).addBox(6.0F, 0.0F, -0.5F, 2.0F, 9.0F, 0.0F, 0.0F, true);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-2.0F, 4.0F, 0.6F);
		cape3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.texOffs(24, 49).addBox(4.0F, -5.0F, -1.0F, 2.0F, 9.0F, 0.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(1.0F, 4.0F, 0.5F);
		cape3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.texOffs(24, 49).addBox(4.0F, -5.0F, -1.0F, 2.0F, 9.0F, 0.0F, 0.0F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 14.0F, 0.0F);
		rightArm.texOffs(46, 20).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.49F, true);
		rightArm.texOffs(24, 28).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.69F, true);

		Left Arm_r1 = new ModelRenderer(this);
		Left Arm_r1.setPos(-2.6061F, 0.81F, 0.0F);
		rightArm.addChild(Left Arm_r1);
		setRotationAngle(Left Arm_r1, 0.0F, 0.0F, -0.0436F);
		Left Arm_r1.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, true);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(-3.2479F, -0.4674F, 0.0F);
		rightArm.addChild(shoulderRight);
		

		Left_Arm_r2 = new ModelRenderer(this);
		Left_Arm_r2.setPos(0.0F, 0.0F, 0.0F);
		shoulderRight.addChild(Left_Arm_r2);
		setRotationAngle(Left_Arm_r2, 0.0F, 0.0F, -0.1309F);
		Left_Arm_r2.texOffs(34, 36).addBox(-4.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.1F, true);
		Left_Arm_r2.texOffs(24, 50).addBox(-4.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.3F, true);

		Left_Arm_r3 = new ModelRenderer(this);
		Left_Arm_r3.setPos(3.0F, 1.0F, 0.0F);
		shoulderRight.addChild(Left_Arm_r3);
		setRotationAngle(Left_Arm_r3, 0.0F, 0.0F, -0.1309F);
		Left_Arm_r3.texOffs(26, 4).addBox(-3.0F, -3.5F, -4.0F, 5.0F, 9.0F, 0.0F, 0.0F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 14.0F, 0.0F);
		leftArm.texOffs(46, 20).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.49F, false);
		leftArm.texOffs(24, 28).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.69F, false);

		Right Arm_r1 = new ModelRenderer(this);
		Right Arm_r1.setPos(2.1061F, 0.81F, 0.0F);
		leftArm.addChild(Right Arm_r1);
		setRotationAngle(Right Arm_r1, 0.0F, 0.0F, 0.0436F);
		Right Arm_r1.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, false);

		shoulderLeft = new ModelRenderer(this);
		shoulderLeft.setPos(3.2479F, -0.4674F, 0.0F);
		leftArm.addChild(shoulderLeft);
		

		Right_Arm_r2 = new ModelRenderer(this);
		Right_Arm_r2.setPos(-3.0F, 1.0F, 0.0F);
		shoulderLeft.addChild(Right_Arm_r2);
		setRotationAngle(Right_Arm_r2, 0.0F, 0.0F, 0.1309F);
		Right_Arm_r2.texOffs(26, 4).addBox(-2.0F, -3.5F, -4.0F, 5.0F, 9.0F, 0.0F, 0.0F, false);

		Right_Arm_r3 = new ModelRenderer(this);
		Right_Arm_r3.setPos(0.0F, 0.0F, 0.0F);
		shoulderLeft.addChild(Right_Arm_r3);
		setRotationAngle(Right_Arm_r3, 0.0F, 0.0F, 0.1309F);
		Right_Arm_r3.texOffs(34, 36).addBox(-3.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.1F, false);
		Right_Arm_r3.texOffs(24, 50).addBox(-3.0F, -3.5F, -4.0F, 7.0F, 6.0F, 8.0F, 0.3F, false);
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