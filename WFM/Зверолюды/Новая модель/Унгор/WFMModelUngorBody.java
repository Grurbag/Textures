// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelUngorBody extends EntityModel<Entity> {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer leftArmArmour;
	private final ModelRenderer leftArm4;
	private final ModelRenderer rightArmArmour;
	private final ModelRenderer rightArm4;

	public WFMModelUngorBody() {
		texWidth = 64;
		texHeight = 64;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setPos(0.0F, 4.5F, 0.25F);
		bodyArmour.texOffs(11, 39).addBox(-4.0F, -0.5F, -3.25F, 8.0F, 6.0F, 6.0F, 0.5F, false);
		bodyArmour.texOffs(33, 53).addBox(-4.0F, -4.5F, -2.25F, 8.0F, 4.0F, 5.0F, 0.5F, false);
		bodyArmour.texOffs(0, 16).addBox(-4.0F, -0.5F, -3.25F, 8.0F, 6.0F, 6.0F, 0.4F, false);
		bodyArmour.texOffs(0, 30).addBox(-4.0F, -4.5F, -2.25F, 8.0F, 4.0F, 5.0F, 0.4F, false);

		leftArmArmour = new ModelRenderer(this);
		leftArmArmour.setPos(4.0F, 1.0F, 0.0F);
		leftArmArmour.texOffs(29, 16).addBox(0.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.5F, false);
		leftArmArmour.texOffs(48, 16).addBox(0.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.4F, false);

		leftArm4 = new ModelRenderer(this);
		leftArm4.setPos(25.0F, 23.0F, 1.0F);
		leftArmArmour.addChild(leftArm4);
		leftArm4.texOffs(30, 26).addBox(-24.0F, -19.0F, -2.5F, 3.0F, 8.0F, 4.0F, 0.5F, false);
		leftArm4.texOffs(50, 26).addBox(-24.0F, -19.0F, -2.5F, 3.0F, 8.0F, 4.0F, 0.4F, false);

		rightArmArmour = new ModelRenderer(this);
		rightArmArmour.setPos(-4.0F, 1.0F, 0.0F);
		rightArmArmour.texOffs(29, 16).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.5F, true);
		rightArmArmour.texOffs(48, 16).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 5.0F, 5.0F, 0.4F, true);

		rightArm4 = new ModelRenderer(this);
		rightArm4.setPos(19.0F, 23.0F, 0.0F);
		rightArmArmour.addChild(rightArm4);
		rightArm4.texOffs(30, 26).addBox(-23.0F, -19.0F, -1.5F, 3.0F, 8.0F, 4.0F, 0.5F, true);
		rightArm4.texOffs(50, 26).addBox(-23.0F, -19.0F, -1.5F, 3.0F, 8.0F, 4.0F, 0.4F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bodyArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}