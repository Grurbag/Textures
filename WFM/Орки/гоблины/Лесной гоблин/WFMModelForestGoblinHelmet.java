// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelForestGoblinHelmet extends EntityModel<Entity> {
	private final ModelRenderer helmet;
	private final ModelRenderer head_r1;

	public WFMModelForestGoblinHelmet() {
		texWidth = 64;
		texHeight = 64;

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 4.0F, -2.0F);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -3.25F, -1.0F);
		helmet.addChild(head_r1);
		setRotationAngle(head_r1, -0.3054F, 0.0F, 0.0F);
		head_r1.texOffs(32, 0).addBox(-4.0F, -1.75F, -4.0F, 8.0F, 9.0F, 8.0F, 0.4F, false);
		head_r1.texOffs(0, 0).addBox(-4.0F, -8.75F, -4.0F, 8.0F, 16.0F, 8.0F, 0.6F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		helmet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}