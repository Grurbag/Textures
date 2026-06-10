// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreLeadbelcherHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer flint;
	private final ModelRenderer fire;

	public WFMModelOgreLeadbelcherHelmet() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 22.0F, 1.0F);
		head.texOffs(0, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 0.5F, false);
		head.texOffs(72, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 1.1F, false);
		head.texOffs(0, 93).addBox(-4.5F, -12.0F, -5.5F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		head.texOffs(2, 83).addBox(-4.0F, -13.0F, -5.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

		flint = new ModelRenderer(this);
		flint.setPos(0.5F, 1.375F, -6.375F);
		head.addChild(flint);
		setRotationAngle(flint, 0.0154F, -0.1739F, -0.0886F);
		flint.texOffs(0, 0).addBox(-10.5F, -0.625F, -0.625F, 12.0F, 1.25F, 1.25F, 0.0F, false);
		flint.texOffs(7, 0).addBox(1.5F, -0.625F, -0.625F, 5.0F, 1.25F, 1.25F, 0.0F, false);

		fire = new ModelRenderer(this);
		fire.setPos(-11.0F, 1.0F, 0.0F);
		flint.addChild(fire);
		fire.texOffs(0, 2).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
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