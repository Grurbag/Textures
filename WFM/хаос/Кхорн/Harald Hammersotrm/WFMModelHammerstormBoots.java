// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelHammerstormBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer Right Leg_r1;
	private final ModelRenderer rightLeg;
	private final ModelRenderer Right_Leg_r2;

	public WFMModelHammerstormBoots() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 16).addBox(-1.5F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.3F, true);
		leftLeg.texOffs(18, 16).addBox(-1.5F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.4F, true);

		Right Leg_r1 = new ModelRenderer(this);
		Right Leg_r1.setPos(1.0F, 11.5F, -2.0F);
		leftLeg.addChild(Right Leg_r1);
		setRotationAngle(Right Leg_r1, 0.0873F, 0.0F, 0.0F);
		Right Leg_r1.texOffs(0, 37).addBox(-1.5F, -2.0F, -2.35F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		Right Leg_r1.texOffs(0, 32).addBox(-2.5F, -1.0F, -1.35F, 5.0F, 2.0F, 2.0F, 0.0F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-3.5F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.3F, false);
		rightLeg.texOffs(18, 16).addBox(-3.5F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.4F, false);

		Right_Leg_r2 = new ModelRenderer(this);
		Right_Leg_r2.setPos(-0.7F, 11.5F, -2.0F);
		rightLeg.addChild(Right_Leg_r2);
		setRotationAngle(Right_Leg_r2, 0.0873F, 0.0F, 0.0F);
		Right_Leg_r2.texOffs(0, 37).addBox(-1.5F, -2.0F, -2.35F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		Right_Leg_r2.texOffs(0, 32).addBox(-2.55F, -1.0F, -1.35F, 5.0F, 2.0F, 2.0F, 0.0F, false);
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