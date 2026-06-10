// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOrcLegs extends EntityModel<Entity> {
	private final ModelRenderer legLeft;
	private final ModelRenderer legLeft_r1;
	private final ModelRenderer legLeft2;
	private final ModelRenderer legRight;
	private final ModelRenderer legRight_r1;
	private final ModelRenderer legRight2;

	public WFMModelOrcLegs() {
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