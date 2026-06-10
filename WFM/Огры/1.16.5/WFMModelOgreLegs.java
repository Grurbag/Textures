// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreLegs extends EntityModel<Entity> {
	private final ModelRenderer leftLeg;
	private final ModelRenderer rightLeg;

	public WFMModelOgreLegs() {
		texWidth = 128;
		texHeight = 128;

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 2.0F, 3.0F);
		leftLeg.texOffs(0, 0).addBox(0.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.3F, false);
		leftLeg.texOffs(42, 0).addBox(0.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.5F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-1.0F, 2.0F, 3.0F);
		rightLeg.texOffs(0, 0).addBox(-11.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.3F, true);
		rightLeg.texOffs(42, 0).addBox(-11.0F, -4.0F, -5.0F, 11.0F, 26.0F, 10.0F, 0.5F, true);
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