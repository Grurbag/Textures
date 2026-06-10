// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelMinotaurBoots extends EntityModel<Entity> {
	private final ModelRenderer bootsRightArmour;
	private final ModelRenderer legRight7;
	private final ModelRenderer legRight8;
	private final ModelRenderer bootsLeftArmour;
	private final ModelRenderer legLeft7;
	private final ModelRenderer legLeft8;

	public WFMModelMinotaurBoots() {
		texWidth = 128;
		texHeight = 128;

		bootsRightArmour = new ModelRenderer(this);
		bootsRightArmour.setPos(-6.0F, 5.0F, 0.0F);
		setRotationAngle(bootsRightArmour, -0.3491F, 0.0F, 0.0F);
		

		legRight7 = new ModelRenderer(this);
		legRight7.setPos(0.0F, 7.0F, 0.0F);
		bootsRightArmour.addChild(legRight7);
		setRotationAngle(legRight7, 1.0472F, 0.0F, 0.0F);
		legRight7.texOffs(101, 20).addBox(-2.0F, -1.1233F, -1.5912F, 7.0F, 9.0F, 7.0F, 0.5F, true);

		legRight8 = new ModelRenderer(this);
		legRight8.setPos(-1.0F, 5.766F, 1.3572F);
		legRight7.addChild(legRight8);
		setRotationAngle(legRight8, -0.6981F, 0.0F, 0.0F);
		legRight8.texOffs(104, 36).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 10.0F, 6.0F, 0.5F, true);

		bootsLeftArmour = new ModelRenderer(this);
		bootsLeftArmour.setPos(3.0F, 5.0F, 0.0F);
		setRotationAngle(bootsLeftArmour, -0.3491F, 0.0F, 0.0F);
		

		legLeft7 = new ModelRenderer(this);
		legLeft7.setPos(0.0F, 7.0F, 0.0F);
		bootsLeftArmour.addChild(legLeft7);
		setRotationAngle(legLeft7, 1.0472F, 0.0F, 0.0F);
		legLeft7.texOffs(101, 20).addBox(-2.0F, -1.1233F, -1.5912F, 7.0F, 9.0F, 7.0F, 0.5F, false);

		legLeft8 = new ModelRenderer(this);
		legLeft8.setPos(-1.0F, 5.766F, 1.3572F);
		legLeft7.addChild(legLeft8);
		setRotationAngle(legLeft8, -0.6981F, 0.0F, 0.0F);
		legLeft8.texOffs(104, 36).addBox(-0.5F, -1.0F, -4.0F, 6.0F, 10.0F, 6.0F, 0.5F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bootsRightArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bootsLeftArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}