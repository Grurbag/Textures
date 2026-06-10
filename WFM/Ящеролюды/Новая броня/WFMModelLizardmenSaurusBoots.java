// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSaurusBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer leftLeg4;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer rightLeg4;

	public WFMModelLizardmenSaurusBoots() {
		texWidth = 128;
		texHeight = 128;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg2);
		setRotationAngle(leftLeg2, -0.7418F, 0.0F, 0.0F);
		leftLeg2.texOffs(0, 12).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(2.0F, 3.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		setRotationAngle(leftLeg3, 1.4835F, 0.0F, 0.0F);
		leftLeg3.texOffs(1, 26).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.5F, false);

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setPos(0.0F, 7.0F, 0.0F);
		leftLeg3.addChild(leftLeg4);
		setRotationAngle(leftLeg4, -0.6981F, 0.0F, 0.0F);
		leftLeg4.texOffs(0, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.5F, false);
		leftLeg4.texOffs(12, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.7F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg2);
		setRotationAngle(rightLeg2, -0.7418F, 0.0F, 0.0F);
		rightLeg2.texOffs(0, 12).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, true);

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg2.addChild(rightLeg3);
		setRotationAngle(rightLeg3, 1.4835F, 0.0F, 0.0F);
		rightLeg3.texOffs(1, 26).addBox(-1.9F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.5F, true);

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setPos(0.0F, 7.0F, 0.0F);
		rightLeg3.addChild(rightLeg4);
		setRotationAngle(rightLeg4, -0.6981F, 0.0F, 0.0F);
		rightLeg4.texOffs(0, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.5F, true);
		rightLeg4.texOffs(12, 39).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F, 0.7F, true);
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