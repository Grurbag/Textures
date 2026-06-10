// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelFimirLegs extends EntityModel<Entity> {
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg8;
	private final ModelRenderer leftLeg9;

	public WFMModelFimirLegs() {
		texWidth = 128;
		texHeight = 64;

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg3);
		setRotationAngle(rightLeg3, -0.7418F, 0.0F, 0.0F);
		rightLeg3.texOffs(0, 18).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.3F, true);
		rightLeg3.texOffs(20, 18).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, true);

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setPos(-2.0F, 3.0F, 0.0F);
		rightLeg3.addChild(rightLeg4);
		setRotationAngle(rightLeg4, 1.4835F, 0.0F, 0.0F);
		rightLeg4.texOffs(1, 32).addBox(-1.9F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg8 = new ModelRenderer(this);
		leftLeg8.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg8);
		setRotationAngle(leftLeg8, -0.7418F, 0.0F, 0.0F);
		leftLeg8.texOffs(0, 18).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.3F, false);
		leftLeg8.texOffs(20, 18).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, false);

		leftLeg9 = new ModelRenderer(this);
		leftLeg9.setPos(2.0F, 3.0F, 0.0F);
		leftLeg8.addChild(leftLeg9);
		setRotationAngle(leftLeg9, 1.4835F, 0.0F, 0.0F);
		leftLeg9.texOffs(1, 32).addBox(-2.1F, -1.0F, -2.5F, 4.0F, 9.0F, 4.0F, 0.0F, false);
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