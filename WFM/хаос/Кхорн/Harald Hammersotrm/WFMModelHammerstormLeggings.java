// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelHammerstormLeggings extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer Right Leg_r1;
	private final ModelRenderer Right_Leg_r2;
	private final ModelRenderer Right_Leg_r3;
	private final ModelRenderer Right_Leg_r4;
	private final ModelRenderer rightLeg;
	private final ModelRenderer Left Leg_r1;
	private final ModelRenderer Left_Leg_r2;
	private final ModelRenderer Left_Leg_r3;
	private final ModelRenderer Right_Leg_r5;

	public WFMModelHammerstormLeggings() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.5F, true);

		Right Leg_r1 = new ModelRenderer(this);
		Right Leg_r1.setPos(2.1071F, 1.3104F, 0.0F);
		leftLeg.addChild(Right Leg_r1);
		setRotationAngle(Right Leg_r1, 0.0F, 0.0F, -0.2618F);
		Right Leg_r1.texOffs(45, 1).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, 0.5F, false);

		Right_Leg_r2 = new ModelRenderer(this);
		Right_Leg_r2.setPos(2.1071F, 3.3104F, 0.0F);
		leftLeg.addChild(Right_Leg_r2);
		setRotationAngle(Right_Leg_r2, 0.0F, 0.0F, -0.2182F);
		Right_Leg_r2.texOffs(45, 1).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, 0.4F, false);

		Right_Leg_r3 = new ModelRenderer(this);
		Right_Leg_r3.setPos(0.0F, 2.9F, 1.0F);
		leftLeg.addChild(Right_Leg_r3);
		setRotationAngle(Right_Leg_r3, 0.0F, 0.0F, -0.0436F);
		Right_Leg_r3.texOffs(45, 1).addBox(0.0F, 1.0F, -3.5F, 4.0F, 3.0F, 5.0F, 0.3F, false);

		Right_Leg_r4 = new ModelRenderer(this);
		Right_Leg_r4.setPos(0.0F, -1.0F, 0.0F);
		leftLeg.addChild(Right_Leg_r4);
		setRotationAngle(Right_Leg_r4, 0.0F, 0.0F, -0.0436F);
		Right_Leg_r4.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.7F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-3.0F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.5F, false);

		Left Leg_r1 = new ModelRenderer(this);
		Left Leg_r1.setPos(-2.1071F, 1.3104F, 0.0F);
		rightLeg.addChild(Left Leg_r1);
		setRotationAngle(Left Leg_r1, 0.0F, 0.0F, 0.2618F);
		Left Leg_r1.texOffs(45, 1).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, 0.5F, true);

		Left_Leg_r2 = new ModelRenderer(this);
		Left_Leg_r2.setPos(0.0F, 2.9F, 1.0F);
		rightLeg.addChild(Left_Leg_r2);
		setRotationAngle(Left_Leg_r2, 0.0F, 0.0F, 0.0436F);
		Left_Leg_r2.texOffs(45, 1).addBox(-4.0F, 1.0F, -3.5F, 4.0F, 3.0F, 5.0F, 0.3F, true);

		Left_Leg_r3 = new ModelRenderer(this);
		Left_Leg_r3.setPos(-2.1071F, 3.3104F, 0.0F);
		rightLeg.addChild(Left_Leg_r3);
		setRotationAngle(Left_Leg_r3, 0.0F, 0.0F, 0.2182F);
		Left_Leg_r3.texOffs(45, 1).addBox(-2.0F, -1.5F, -2.5F, 4.0F, 3.0F, 5.0F, 0.4F, true);

		Right_Leg_r5 = new ModelRenderer(this);
		Right_Leg_r5.setPos(0.0F, -1.0F, 0.0F);
		rightLeg.addChild(Right_Leg_r5);
		setRotationAngle(Right_Leg_r5, 0.0F, 0.0F, 0.0436F);
		Right_Leg_r5.texOffs(0, 0).addBox(-3.0F, 1.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.7F, true);
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