// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelEstaliaChestplate extends EntityModel<Entity> {
	private final ModelRenderer rightArm;
	private final ModelRenderer Left Arm_r1;
	private final ModelRenderer Left_Arm_r2;
	private final ModelRenderer Left_Arm_r3;
	private final ModelRenderer leftArm;
	private final ModelRenderer Right Arm_r1;
	private final ModelRenderer Right_Arm_r2;
	private final ModelRenderer body;
	private final ModelRenderer povyazka_r1;

	public WFMModelEstaliaChestplate() {
		texWidth = 64;
		texHeight = 64;

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 14.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -14.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		Left Arm_r1 = new ModelRenderer(this);
		Left Arm_r1.setPos(-1.2479F, -0.4674F, 0.0F);
		rightArm.addChild(Left Arm_r1);
		setRotationAngle(Left Arm_r1, 0.0F, 0.0F, -0.1309F);
		Left Arm_r1.texOffs(40, 32).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		Left_Arm_r2 = new ModelRenderer(this);
		Left_Arm_r2.setPos(-1.1061F, -11.19F, 0.0F);
		rightArm.addChild(Left_Arm_r2);
		setRotationAngle(Left_Arm_r2, 0.0F, 0.0F, -0.0436F);
		Left_Arm_r2.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, true);

		Left_Arm_r3 = new ModelRenderer(this);
		Left_Arm_r3.setPos(-1.2479F, -12.4674F, 0.0F);
		rightArm.addChild(Left_Arm_r3);
		setRotationAngle(Left_Arm_r3, 0.0F, 0.0F, -0.1309F);
		Left_Arm_r3.texOffs(40, 43).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 14.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		Right Arm_r1 = new ModelRenderer(this);
		Right Arm_r1.setPos(1.0F, -0.5F, 0.0F);
		leftArm.addChild(Right Arm_r1);
		setRotationAngle(Right Arm_r1, 0.0F, 0.0F, 0.1309F);
		Right Arm_r1.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		Right Arm_r1.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);

		Right_Arm_r2 = new ModelRenderer(this);
		Right_Arm_r2.setPos(1.1061F, 0.81F, 0.0F);
		leftArm.addChild(Right_Arm_r2);
		setRotationAngle(Right_Arm_r2, 0.0F, 0.0F, 0.0436F);
		Right_Arm_r2.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 12.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		body.texOffs(0, 59).addBox(-1.5F, 12.0F, -3.0F, 3.0F, 3.0F, 2.0F, 0.1F, false);

		povyazka_r1 = new ModelRenderer(this);
		povyazka_r1.setPos(0.0F, 6.0F, 0.25F);
		body.addChild(povyazka_r1);
		setRotationAngle(povyazka_r1, 0.0F, 0.0F, 0.5672F);
		povyazka_r1.texOffs(0, 35).addBox(-1.35F, -9.0F, -3.25F, 3.0F, 17.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}