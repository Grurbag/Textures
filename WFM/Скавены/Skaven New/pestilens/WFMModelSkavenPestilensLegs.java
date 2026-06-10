// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenPestilensLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer platbe_r1;
	private final ModelRenderer leftLegFur_r1;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer rightLeg;
	private final ModelRenderer platbe_r2;
	private final ModelRenderer rightLegFur_r1;
	private final ModelRenderer rightLeg_r1;

	public WFMModelSkavenPestilensLegs() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(3.0F, 12.0F, 0.0F);
		setRotationAngle(leftLeg, 0.1745F, 0.0F, 0.0F);
		

		platbe_r1 = new ModelRenderer(this);
		platbe_r1.setPos(-0.1F, -1.0152F, -0.1736F);
		leftLeg.addChild(platbe_r1);
		setRotationAngle(platbe_r1, -0.218F, -0.0094F, -0.0426F);
		platbe_r1.texOffs(42, 46).addBox(-2.4F, 0.0F, -4.0F, 5.0F, 12.0F, 6.0F, 0.7F, false);

		leftLegFur_r1 = new ModelRenderer(this);
		leftLegFur_r1.setPos(-0.1F, -1.0152F, -0.1736F);
		leftLeg.addChild(leftLegFur_r1);
		setRotationAngle(leftLegFur_r1, -0.436F, -0.0184F, -0.0395F);
		leftLegFur_r1.texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.7F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setPos(-0.1F, -1.0152F, -0.1736F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, -0.4363F, 0.0F, 0.0F);
		leftLeg_r1.texOffs(0, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.25F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-3.0F, 12.0F, 0.0F);
		setRotationAngle(rightLeg, 0.1745F, 0.0F, 0.0F);
		

		platbe_r2 = new ModelRenderer(this);
		platbe_r2.setPos(0.9F, -1.0608F, -0.6946F);
		rightLeg.addChild(platbe_r2);
		setRotationAngle(platbe_r2, -0.218F, 0.0057F, 0.0433F);
		platbe_r2.texOffs(42, 46).addBox(-3.399F, 0.0435F, -3.519F, 5.0F, 12.0F, 6.0F, 0.7F, true);

		rightLegFur_r1 = new ModelRenderer(this);
		rightLegFur_r1.setPos(-0.1F, -0.8299F, -0.128F);
		rightLeg.addChild(rightLegFur_r1);
		setRotationAngle(rightLegFur_r1, -0.436F, 0.0184F, 0.0395F);
		rightLegFur_r1.texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.7F, true);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setPos(-0.1F, -0.8299F, -0.128F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.4363F, 0.0F, 0.0F);
		rightLeg_r1.texOffs(0, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.25F, true);
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