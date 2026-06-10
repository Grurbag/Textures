// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelFimirHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;

	public WFMModelFimirHelmet() {
		texWidth = 128;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -5.0F, -6.0F);
		head.texOffs(100, 0).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 7.0F, 0.51F, false);
		head.texOffs(104, 19).addBox(-2.5F, -7.0F, -4.0F, 5.0F, 1.0F, 5.0F, 0.51F, false);
		head.texOffs(106, 29).addBox(-1.5F, -8.0F, -3.0F, 3.0F, 1.0F, 3.0F, 0.51F, false);
		head.texOffs(72, 0).addBox(-3.5F, -6.0F, -5.0F, 7.0F, 7.0F, 7.0F, 0.7F, false);
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