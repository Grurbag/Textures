// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSaurusLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg2;

	public WFMModelLizardmenSaurusLegs() {
		texWidth = 128;
		texHeight = 128;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.0F, 10.0F, -0.5F);
		

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(0.0F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg2);
		setRotationAngle(leftLeg2, -0.7418F, 0.0F, 0.0F);
		leftLeg2.texOffs(0, 12).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, false);
		leftLeg2.texOffs(20, 12).addBox(0.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.7F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 10.0F, -0.5F);
		

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(0.0F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg2);
		setRotationAngle(rightLeg2, -0.7418F, 0.0F, 0.0F);
		rightLeg2.texOffs(0, 12).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.5F, true);
		rightLeg2.texOffs(20, 12).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 9.0F, 5.0F, 0.7F, true);
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