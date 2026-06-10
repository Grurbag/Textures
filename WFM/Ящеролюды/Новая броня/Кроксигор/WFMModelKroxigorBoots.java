// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKroxigorBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer legLeft6;
	private final ModelRenderer legLeft7;
	private final ModelRenderer legLeft8;
	private final ModelRenderer rightLeg;
	private final ModelRenderer legRight6;
	private final ModelRenderer legRight7;
	private final ModelRenderer legRight8;

	public WFMModelKroxigorBoots() {
		texWidth = 256;
		texHeight = 256;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 2.0F, 0.0F);
		

		legLeft6 = new ModelRenderer(this);
		legLeft6.setPos(2.0F, 3.0F, 0.0F);
		leftLeg.addChild(legLeft6);
		setRotationAngle(legLeft6, -0.6545F, 0.0F, 0.0F);
		legLeft6.texOffs(68, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.0F, false);

		legLeft7 = new ModelRenderer(this);
		legLeft7.setPos(2.0F, 4.8166F, 1.8455F);
		legLeft6.addChild(legLeft7);
		setRotationAngle(legLeft7, 1.309F, 0.0F, 0.0F);
		legLeft7.texOffs(72, 24).addBox(-4.0F, -1.8886F, -3.4389F, 7.0F, 9.0F, 8.0F, 0.0F, false);

		legLeft8 = new ModelRenderer(this);
		legLeft8.setPos(-3.0F, 5.0007F, -0.4905F);
		legLeft7.addChild(legLeft8);
		setRotationAngle(legLeft8, -0.6981F, 0.0F, 0.0F);
		legLeft8.texOffs(75, 41).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, 0.49F, false);
		legLeft8.texOffs(49, 41).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, 0.7F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-2.0F, 2.0F, 0.0F);
		

		legRight6 = new ModelRenderer(this);
		legRight6.setPos(-5.0F, 3.0F, 0.0F);
		rightLeg.addChild(legRight6);
		setRotationAngle(legRight6, -0.6545F, 0.0F, 0.0F);
		legRight6.texOffs(68, 0).addBox(-2.5F, -6.9397F, -4.342F, 8.0F, 15.0F, 9.0F, 0.0F, true);

		legRight7 = new ModelRenderer(this);
		legRight7.setPos(2.0F, 4.8166F, 1.8455F);
		legRight6.addChild(legRight7);
		setRotationAngle(legRight7, 1.309F, 0.0F, 0.0F);
		legRight7.texOffs(72, 24).addBox(-4.0F, -1.8886F, -3.4389F, 7.0F, 9.0F, 8.0F, 0.0F, true);

		legRight8 = new ModelRenderer(this);
		legRight8.setPos(-3.0F, 5.0007F, -0.4905F);
		legRight7.addChild(legRight8);
		setRotationAngle(legRight8, -0.6981F, 0.0F, 0.0F);
		legRight8.texOffs(75, 41).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, 0.49F, true);
		legRight8.texOffs(49, 41).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, 0.7F, true);
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