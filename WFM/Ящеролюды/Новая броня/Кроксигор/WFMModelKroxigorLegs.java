// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKroxigorLegs extends EntityModel<Entity> {
	private final ModelRenderer rightLeg;
	private final ModelRenderer legRight4;
	private final ModelRenderer legRight5;
	private final ModelRenderer leftLeg;
	private final ModelRenderer legLeft4;
	private final ModelRenderer legLeft5;

	public WFMModelKroxigorLegs() {
		texWidth = 256;
		texHeight = 256;

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-2.0F, 2.0F, 0.0F);
		

		legRight4 = new ModelRenderer(this);
		legRight4.setPos(-5.0F, 3.0F, 0.0F);
		rightLeg.addChild(legRight4);
		setRotationAngle(legRight4, -0.6545F, 0.0F, 0.0F);
		legRight4.texOffs(68, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.5F, true);
		legRight4.texOffs(34, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.7F, true);

		legRight5 = new ModelRenderer(this);
		legRight5.setPos(2.0F, 4.8166F, 1.8455F);
		legRight4.addChild(legRight5);
		setRotationAngle(legRight5, 1.309F, 0.0F, 0.0F);
		legRight5.texOffs(72, 24).addBox(-4.0F, -1.8886F, -3.4389F, 7.0F, 9.0F, 8.0F, 0.5F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 2.0F, 0.0F);
		

		legLeft4 = new ModelRenderer(this);
		legLeft4.setPos(2.0F, 3.0F, 0.0F);
		leftLeg.addChild(legLeft4);
		setRotationAngle(legLeft4, -0.6545F, 0.0F, 0.0F);
		legLeft4.texOffs(68, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.5F, false);
		legLeft4.texOffs(34, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.7F, false);

		legLeft5 = new ModelRenderer(this);
		legLeft5.setPos(2.0F, 4.8166F, 1.8455F);
		legLeft4.addChild(legLeft5);
		setRotationAngle(legLeft5, 1.309F, 0.0F, 0.0F);
		legLeft5.texOffs(72, 24).addBox(-4.0F, -1.8886F, -3.4389F, 7.0F, 9.0F, 8.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}