// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelMinotaurLegs extends EntityModel<Entity> {
	private final ModelRenderer legLeftArmour;
	private final ModelRenderer legRightArmour;

	public WFMModelMinotaurLegs() {
		texWidth = 128;
		texHeight = 128;

		legLeftArmour = new ModelRenderer(this);
		legLeftArmour.setPos(3.0F, 5.0F, 0.0F);
		setRotationAngle(legLeftArmour, -0.3491F, 0.0F, 0.0F);
		legLeftArmour.texOffs(97, -1).addBox(-2.5F, -4.9397F, -4.342F, 8.0F, 13.0F, 8.0F, 0.5F, false);

		legRightArmour = new ModelRenderer(this);
		legRightArmour.setPos(-6.0F, 5.0F, 0.0F);
		setRotationAngle(legRightArmour, -0.3491F, 0.0F, 0.0F);
		legRightArmour.texOffs(97, -1).addBox(-2.5F, -4.9397F, -4.342F, 8.0F, 13.0F, 8.0F, 0.5F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		legLeftArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		legRightArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}