// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNightGoblinBody extends EntityModel<Entity> {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer bodyArmour2;
	private final ModelRenderer leftHandArmour;
	private final ModelRenderer leftHandArmour2;
	private final ModelRenderer shoulderLeft;
	private final ModelRenderer shoulderLeft2;
	private final ModelRenderer rightHandArmour;
	private final ModelRenderer rightHandArmour2;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer shoulderRight2;

	public WFMModelNightGoblinBody() {
		texWidth = 64;
		texHeight = 64;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setPos(0.0F, 10.0F, 1.0F);
		bodyArmour.texOffs(16, 25).addBox(-4.0F, -5.0F, -2.0F, 8.0F, 10.0F, 4.0F, 0.49F, false);

		bodyArmour2 = new ModelRenderer(this);
		bodyArmour2.setPos(0.0F, -10.0F, -1.0F);
		bodyArmour.addChild(bodyArmour2);
		bodyArmour2.texOffs(15, 15).addBox(-4.0F, 3.0F, -3.0F, 8.0F, 5.0F, 5.0F, 0.49F, false);

		leftHandArmour = new ModelRenderer(this);
		leftHandArmour.setPos(5.0F, 6.0F, -1.0F);
		leftHandArmour.texOffs(41, 16).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.5F, true);

		leftHandArmour2 = new ModelRenderer(this);
		leftHandArmour2.setPos(0.0F, -3.0F, 0.0F);
		leftHandArmour.addChild(leftHandArmour2);
		leftHandArmour2.texOffs(41, 31).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.3F, true);

		shoulderLeft = new ModelRenderer(this);
		shoulderLeft.setPos(0.0F, 0.0F, 0.0F);
		leftHandArmour.addChild(shoulderLeft);
		setRotationAngle(shoulderLeft, 0.0F, 0.0F, 0.5236F);
		shoulderLeft.texOffs(0, 0).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.3F, true);

		shoulderLeft2 = new ModelRenderer(this);
		shoulderLeft2.setPos(0.0F, 0.0F, 0.0F);
		shoulderLeft.addChild(shoulderLeft2);
		shoulderLeft2.texOffs(0, 9).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.1F, true);

		rightHandArmour = new ModelRenderer(this);
		rightHandArmour.setPos(-5.0F, 6.0F, -1.0F);
		rightHandArmour.texOffs(41, 16).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.5F, false);

		rightHandArmour2 = new ModelRenderer(this);
		rightHandArmour2.setPos(0.0F, -3.0F, 0.0F);
		rightHandArmour.addChild(rightHandArmour2);
		rightHandArmour2.texOffs(41, 31).addBox(-2.0F, 2.0F, -2.0F, 3.0F, 11.0F, 4.0F, 0.3F, false);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(-2.0F, 1.0F, 0.0F);
		rightHandArmour.addChild(shoulderRight);
		setRotationAngle(shoulderRight, 0.0F, 0.0F, -0.5236F);
		shoulderRight.texOffs(0, 0).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.3F, false);

		shoulderRight2 = new ModelRenderer(this);
		shoulderRight2.setPos(0.0F, 0.0F, 0.0F);
		shoulderRight.addChild(shoulderRight2);
		shoulderRight2.texOffs(0, 9).addBox(-1.0F, -2.0F, -3.0F, 4.0F, 3.0F, 6.0F, 0.1F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bodyArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftHandArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightHandArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}