// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMmodelBlackOrcLegs extends EntityModel<Entity> {
	private final ModelRenderer legLeft;
	private final ModelRenderer legLeft_r1;
	private final ModelRenderer legLeft2;
	private final ModelRenderer armourPlateLeft;
	private final ModelRenderer portki3;
	private final ModelRenderer legRight;
	private final ModelRenderer legRight_r1;
	private final ModelRenderer legRight2;
	private final ModelRenderer armourPlate;
	private final ModelRenderer portki;
	private final ModelRenderer portki2;

	public WFMmodelBlackOrcLegs() {
		texWidth = 64;
		texHeight = 64;

		legLeft = new ModelRenderer(this);
		legLeft.setPos(1.0F, 10.0F, 0.0F);
		setRotationAngle(legLeft, 0.0436F, 0.0F, 0.0F);
		

		legLeft_r1 = new ModelRenderer(this);
		legLeft_r1.setPos(6.0F, 2.9981F, -0.0872F);
		legLeft.addChild(legLeft_r1);
		setRotationAngle(legLeft_r1, -0.1309F, 0.0F, 0.0F);
		legLeft_r1.texOffs(0, 14).addBox(-6.5F, -2.9924F, -3.1743F, 6.0F, 7.0F, 6.0F, 0.75F, true);

		legLeft2 = new ModelRenderer(this);
		legLeft2.setPos(6.0F, 1.9981F, -0.0872F);
		legLeft.addChild(legLeft2);
		legLeft2.texOffs(0, 27).addBox(-6.0F, 4.0019F, -3.4128F, 5.0F, 8.0F, 5.0F, 0.75F, true);

		armourPlateLeft = new ModelRenderer(this);
		armourPlateLeft.setPos(8.75F, 4.5F, -0.25F);
		legLeft.addChild(armourPlateLeft);
		setRotationAngle(armourPlateLeft, 0.0F, 3.1416F, 0.0F);
		armourPlateLeft.texOffs(44, 0).addBox(0.25F, -4.5F, -3.75F, 3.0F, 8.0F, 7.0F, 0.0F, true);
		armourPlateLeft.texOffs(55, 24).addBox(-3.75F, -2.5F, 0.25F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		portki3 = new ModelRenderer(this);
		portki3.setPos(1.0F, 0.1612F, 4.2618F);
		legLeft.addChild(portki3);
		portki3.texOffs(32, 57).addBox(-2.0F, -0.1888F, -0.0777F, 6.0F, 7.0F, 0.0F, 0.0F, true);

		legRight = new ModelRenderer(this);
		legRight.setPos(-1.0F, 10.0F, 0.0F);
		setRotationAngle(legRight, 0.0436F, 0.0F, 0.0F);
		

		legRight_r1 = new ModelRenderer(this);
		legRight_r1.setPos(0.0F, 2.9981F, -0.0872F);
		legRight.addChild(legRight_r1);
		setRotationAngle(legRight_r1, -0.1309F, 0.0F, 0.0F);
		legRight_r1.texOffs(0, 14).addBox(-5.5F, -2.9924F, -3.1743F, 6.0F, 7.0F, 6.0F, 0.75F, false);

		legRight2 = new ModelRenderer(this);
		legRight2.setPos(0.0F, 1.9981F, -0.0872F);
		legRight.addChild(legRight2);
		legRight2.texOffs(0, 27).addBox(-5.0F, 4.0019F, -3.4128F, 5.0F, 8.0F, 5.0F, 0.75F, false);

		armourPlate = new ModelRenderer(this);
		armourPlate.setPos(-8.25F, 4.5F, -0.25F);
		legRight.addChild(armourPlate);
		armourPlate.texOffs(44, 0).addBox(0.25F, -4.5F, -3.75F, 3.0F, 8.0F, 7.0F, 0.0F, false);
		armourPlate.texOffs(55, 24).addBox(-3.75F, -2.5F, 0.25F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		portki = new ModelRenderer(this);
		portki.setPos(0.0F, 4.0742F, -4.3223F);
		legRight.addChild(portki);
		setRotationAngle(portki, -0.1309F, 0.0F, 0.0F);
		portki.texOffs(50, 57).addBox(-2.5F, -0.1888F, -0.0777F, 7.0F, 7.0F, 0.0F, 0.0F, false);

		portki2 = new ModelRenderer(this);
		portki2.setPos(-3.0F, 0.1612F, 4.2618F);
		legRight.addChild(portki2);
		portki2.texOffs(32, 57).addBox(-2.0F, -0.1888F, -0.0777F, 6.0F, 7.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		legLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}