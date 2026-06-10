// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkinWolfBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg1;
	private final ModelRenderer leg_left6;
	private final ModelRenderer leg_left7;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg1;
	private final ModelRenderer leg_right6;
	private final ModelRenderer leg_right7;

	public WFMModelSkinWolfBoots() {
		texWidth = 256;
		texHeight = 128;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(4.0F, -2.0F, -1.0F);
		

		leftLeg1 = new ModelRenderer(this);
		leftLeg1.setPos(0.0F, 2.4126F, -1.4452F);
		leftLeg.addChild(leftLeg1);
		setRotationAngle(leftLeg1, -0.4363F, 0.0F, 0.0F);
		leftLeg1.texOffs(105, 1).addBox(0.0F, -5.6252F, -4.0F, 6.0F, 16.0F, 8.0F, 0.5F, false);

		leg_left6 = new ModelRenderer(this);
		leg_left6.setPos(0.1F, 12.4F, -2.4F);
		leftLeg1.addChild(leg_left6);
		setRotationAngle(leg_left6, 1.639F, 0.0F, 0.0F);
		leg_left6.texOffs(106, 27).addBox(0.0F, 6.6874F, 1.8452F, 6.0F, 8.0F, 6.0F, 0.0F, false);

		leg_left7 = new ModelRenderer(this);
		leg_left7.setPos(5.6F, 6.0F, 3.0F);
		leg_left6.addChild(leg_left7);
		setRotationAngle(leg_left7, -1.639F, 0.0F, 0.0F);
		leg_left7.texOffs(107, 44).addBox(-5.2F, -2.3252F, 3.0F, 5.0F, 14.0F, 5.0F, 0.5F, false);
		leg_left7.texOffs(127, 44).addBox(-5.2F, -2.3252F, 3.0F, 5.0F, 14.0F, 5.0F, 0.7F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-4.0F, -2.0F, -1.0F);
		

		rightLeg1 = new ModelRenderer(this);
		rightLeg1.setPos(-1.0F, 0.6F, -0.6F);
		rightLeg.addChild(rightLeg1);
		setRotationAngle(rightLeg1, -0.4363F, 0.0F, 0.0F);
		rightLeg1.texOffs(105, 1).addBox(-4.0F, -3.8126F, -4.8452F, 6.0F, 16.0F, 8.0F, 0.5F, true);

		leg_right6 = new ModelRenderer(this);
		leg_right6.setPos(-3.9F, 12.4F, -2.4F);
		rightLeg1.addChild(leg_right6);
		setRotationAngle(leg_right6, 1.639F, 0.0F, 0.0F);
		leg_right6.texOffs(106, 27).addBox(0.0F, 5.5F, 0.0F, 6.0F, 8.0F, 6.0F, 0.0F, true);

		leg_right7 = new ModelRenderer(this);
		leg_right7.setPos(5.6F, 6.0F, 3.0F);
		leg_right6.addChild(leg_right7);
		setRotationAngle(leg_right7, -1.639F, 0.0F, 0.0F);
		leg_right7.texOffs(107, 44).addBox(-5.2F, -0.5126F, 2.1548F, 5.0F, 14.0F, 5.0F, 0.5F, true);
		leg_right7.texOffs(127, 44).addBox(-5.2F, -0.5126F, 2.1548F, 5.0F, 14.0F, 5.0F, 0.7F, true);
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