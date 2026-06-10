// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKroxigorHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jawTop2;

	public WFMModelKroxigorHelmet() {
		texWidth = 256;
		texHeight = 256;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -13.0F, -14.0F);
		head.texOffs(216, 0).addBox(-6.0F, -6.0F, -5.0F, 12.0F, 11.0F, 8.0F, 0.2F, false);
		head.texOffs(176, 0).addBox(-6.0F, -6.0F, -5.0F, 12.0F, 11.0F, 8.0F, 0.5F, false);

		jawTop2 = new ModelRenderer(this);
		jawTop2.setPos(0.0F, 2.0F, -3.0F);
		head.addChild(jawTop2);
		jawTop2.texOffs(208, 22).addBox(-4.5F, -7.0F, -14.0F, 9.0F, 8.0F, 15.0F, 0.0F, false);
		jawTop2.texOffs(160, 22).addBox(-4.5F, -7.0F, -14.0F, 9.0F, 8.0F, 15.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}