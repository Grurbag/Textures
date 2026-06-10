// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public WFMModelKhorneHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 16).addBox(-4.5F, -9.0F, -5.5F, 9.0F, 10.0F, 0.0F, 0.0F, false);
		Head.texOffs(0, 55).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Head.texOffs(0, 42).addBox(-1.0F, -11.0F, -4.0F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Head.texOffs(0, 54).addBox(-1.0F, -10.0F, -6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Head.texOffs(44, 16).addBox(5.0F, -18.0F, -2.5F, 5.0F, 6.0F, 5.0F, -0.5F, false);
		Head.texOffs(44, 16).addBox(-10.0F, -18.0F, -2.5F, 5.0F, 6.0F, 5.0F, -0.5F, false);
		Head.texOffs(22, 31).addBox(-10.5F, -23.0F, 0.0F, 21.0F, 20.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}