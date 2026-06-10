// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCentigorBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLegBack;
	private final ModelRenderer leftLeg6;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer rightLegBack;
	private final ModelRenderer rightLeg6;

	public WFMModelCentigorBoots() {
		texWidth = 128;
		texHeight = 64;

		leftLegBack = new ModelRenderer(this);
		leftLegBack.setPos(1.0F, 9.0F, 0.0F);
		

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setPos(28.0F, 15.0F, -1.0F);
		leftLegBack.addChild(leftLeg6);
		leftLeg6.texOffs(48, 39).addBox(-28.0F, -5.5649F, 17.3087F, 4.0F, 6.0F, 4.0F, 0.5F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 9.0F, 0.0F);
		

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(28.0F, 15.0F, -1.0F);
		leftLeg.addChild(leftLeg3);
		leftLeg3.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.5F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 9.0F, 0.0F);
		

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(24.0F, 15.0F, -1.0F);
		rightLeg.addChild(rightLeg3);
		rightLeg3.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.5F, true);

		rightLegBack = new ModelRenderer(this);
		rightLegBack.setPos(-1.0F, 9.0F, 17.0F);
		

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setPos(24.0F, 15.0F, -1.0F);
		rightLegBack.addChild(rightLeg6);
		rightLeg6.texOffs(48, 39).addBox(-28.0F, -5.5649F, 0.3087F, 4.0F, 6.0F, 4.0F, 0.5F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		leftLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}