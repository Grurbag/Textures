// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSkinkHelmet extends EntityModel<Entity> {
	private final ModelRenderer headArmour;
	private final ModelRenderer jawTop2;

	public WFMModelLizardmenSkinkHelmet() {
		texWidth = 128;
		texHeight = 64;

		headArmour = new ModelRenderer(this);
		headArmour.setPos(0.0F, 1.0F, -5.0F);
		headArmour.texOffs(83, 1).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 6.0F, 0.5F, false);
		headArmour.texOffs(57, 1).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 6.0F, 0.7F, false);

		jawTop2 = new ModelRenderer(this);
		jawTop2.setPos(0.0F, -3.0F, -4.0F);
		headArmour.addChild(jawTop2);
		jawTop2.texOffs(78, 26).addBox(-2.5F, -2.0F, -5.5F, 5.0F, 5.0F, 7.0F, 0.5F, false);
		jawTop2.texOffs(54, 26).addBox(-2.5F, -2.0F, -5.5F, 5.0F, 5.0F, 7.0F, 0.7F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		headArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}