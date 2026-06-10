// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelEmpireHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;

	public WFMModelEmpireHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(24, 0).addBox(-3.5F, -8.0F, -4.0F, 8.0F, 8.0F, 0.0F, 1.0F, false);
		Head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);
		Head.texOffs(24, 55).addBox(-6.0F, -2.0F, -1.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 22).addBox(-2.5F, -2.85F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);
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