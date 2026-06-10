// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBullCentaurBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLegFront;
	private final ModelRenderer leftLegFrontArmour;
	private final ModelRenderer leftLegBack;
	private final ModelRenderer leftLegFrontArmour4;
	private final ModelRenderer rightLegFront;
	private final ModelRenderer leftLegFrontArmour2;
	private final ModelRenderer rightLegFront2;
	private final ModelRenderer leftLegFrontArmour3;

	public WFMModelBullCentaurBoots() {
		texWidth = 128;
		texHeight = 128;

		leftLegFront = new ModelRenderer(this);
		leftLegFront.setPos(7.0F, 8.0F, -3.5F);
		leftLegFront.texOffs(102, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, false);

		leftLegFrontArmour = new ModelRenderer(this);
		leftLegFrontArmour.setPos(-3.0F, -2.0F, 0.5F);
		leftLegFront.addChild(leftLegFrontArmour);
		leftLegFrontArmour.texOffs(0, 0).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.3F, false);
		leftLegFrontArmour.texOffs(104, 103).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.5F, false);

		leftLegBack = new ModelRenderer(this);
		leftLegBack.setPos(7.0F, 8.0F, 18.5F);
		leftLegBack.texOffs(72, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, false);

		leftLegFrontArmour4 = new ModelRenderer(this);
		leftLegFrontArmour4.setPos(-3.0F, -2.0F, 0.5F);
		leftLegBack.addChild(leftLegFrontArmour4);
		leftLegFrontArmour4.texOffs(0, 0).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.3F, false);
		leftLegFrontArmour4.texOffs(104, 103).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.5F, false);

		rightLegFront = new ModelRenderer(this);
		rightLegFront.setPos(-5.0F, 8.0F, -3.5F);
		rightLegFront.texOffs(102, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, true);

		leftLegFrontArmour2 = new ModelRenderer(this);
		leftLegFrontArmour2.setPos(-3.0F, -2.0F, 0.5F);
		rightLegFront.addChild(leftLegFrontArmour2);
		leftLegFrontArmour2.texOffs(0, 0).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.3F, false);
		leftLegFrontArmour2.texOffs(104, 103).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.5F, false);

		rightLegFront2 = new ModelRenderer(this);
		rightLegFront2.setPos(-5.0F, 8.0F, 18.5F);
		rightLegFront2.texOffs(72, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, true);

		leftLegFrontArmour3 = new ModelRenderer(this);
		leftLegFrontArmour3.setPos(-3.0F, -2.0F, 0.5F);
		rightLegFront2.addChild(leftLegFrontArmour3);
		leftLegFrontArmour3.texOffs(0, 0).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.3F, false);
		leftLegFrontArmour3.texOffs(104, 103).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftLegFront.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegFront.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegFront2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}