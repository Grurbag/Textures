// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;

	public WFMModelDwarfLegs() {
		texWidth = 64;
		texHeight = 64;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.9F, 12.0F, 0.0F);
		leftLeg.texOffs(0, 17).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.65F, false);
		leftLeg.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 1.1F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-2.9F, 12.0F, 0.0F);
		rightLeg.texOffs(0, 17).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 0.65F, true);
		rightLeg.texOffs(0, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 12.0F, 5.0F, 1.1F, true);
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