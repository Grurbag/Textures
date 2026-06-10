// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBestigorBoots extends EntityModel<Entity> {
	private final ModelRenderer rightBoot;
	private final ModelRenderer rightLegArmour3;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer leftBoot;
	private final ModelRenderer leftLegArmour3;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer leftLeg2;

	public WFMModelBestigorBoots() {
		texWidth = 64;
		texHeight = 64;

		rightBoot = new ModelRenderer(this);
		rightBoot.setPos(-0.1F, 6.9544F, -0.5209F);
		

		rightLegArmour3 = new ModelRenderer(this);
		rightLegArmour3.setPos(24.1F, 17.0456F, 0.5209F);
		rightBoot.addChild(rightLegArmour3);
		

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(-25.0F, -9.0F, 0.0F);
		rightLegArmour3.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.48F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.5F, true);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(0.0F, 0.0F, -1.0F);
		rightLegArmour3.addChild(rightLeg2);
		rightLeg2.texOffs(0, -5).addBox(-26.0F, -7.0F, -5.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
		rightLeg2.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.5F, true);

		leftBoot = new ModelRenderer(this);
		leftBoot.setPos(-0.1F, 6.9544F, -0.5209F);
		

		leftLegArmour3 = new ModelRenderer(this);
		leftLegArmour3.setPos(28.1F, 17.0456F, 0.5209F);
		leftBoot.addChild(leftLegArmour3);
		

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(-25.0F, -9.0F, 0.0F);
		leftLegArmour3.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.48F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(50, 29).addBox(-2.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.5F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(0.0F, 0.0F, -1.0F);
		leftLegArmour3.addChild(leftLeg2);
		leftLeg2.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.5F, false);
		leftLeg2.texOffs(0, -5).addBox(-26.0F, -7.0F, -5.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}