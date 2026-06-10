// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfMinersBoots extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;

	public WFMModelDwarfMinersBoots() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(1.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.9F, true);
		leftLeg.texOffs(3, 40).addBox(-1.5F, 10.0F, -5.0F, 4.0F, 2.0F, 2.0F, 0.4F, true);
		leftLeg.texOffs(1, 33).addBox(-0.5F, 9.0F, -5.5F, 2.0F, 3.0F, 3.0F, 0.4F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.9F, false);
		rightLeg.texOffs(3, 40).addBox(-2.5F, 10.0F, -5.0F, 4.0F, 2.0F, 2.0F, 0.4F, false);
		rightLeg.texOffs(1, 33).addBox(-1.5F, 9.0F, -5.5F, 2.0F, 3.0F, 3.0F, 0.4F, false);
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