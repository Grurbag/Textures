// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class wolf_skull extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mouthBot;
	private final ModelRenderer mouth;

	public wolf_skull() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(-0.5F, 18.0F, 5.5F);
		head.texOffs(0, 0).addBox(-5.5F, -3.5F, -8.5F, 10.0F, 9.0F, 8.0F, 0.0F, false);
		head.texOffs(28, 47).addBox(-5.5F, -3.5F, -8.5F, 10.0F, 9.0F, 8.0F, -0.3F, false);

		mouthBot = new ModelRenderer(this);
		mouthBot.setPos(-0.5F, 3.75F, -8.5F);
		head.addChild(mouthBot);
		setRotationAngle(mouthBot, 0.1745F, 0.0F, 0.0F);
		mouthBot.texOffs(0, 27).addBox(-3.0F, 0.0F, -6.0F, 6.0F, 2.0F, 7.0F, 0.0F, false);
		mouthBot.texOffs(0, 33).addBox(2.4F, -2.0F, -5.5F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		mouthBot.texOffs(1, 39).addBox(-2.5F, -2.0F, -5.4F, 5.0F, 2.0F, 0.0F, 0.0F, false);
		mouthBot.texOffs(0, 33).addBox(-2.4F, -2.0F, -5.5F, 0.0F, 2.0F, 6.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setPos(-0.5F, 1.5F, -8.5F);
		head.addChild(mouth);
		mouth.texOffs(0, 17).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 7.0F, 0.0F, false);
		mouth.texOffs(0, 42).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 7.0F, -0.2F, false);
		mouth.texOffs(26, 18).addBox(-1.0F, -3.5F, -5.75F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		mouth.texOffs(12, 36).addBox(-2.5F, 0.0F, -6.0F, 5.0F, 2.0F, 0.0F, 0.0F, false);
		mouth.texOffs(0, 31).addBox(-2.5F, 0.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
		mouth.texOffs(0, 31).addBox(2.5F, 0.0F, -6.0F, 0.0F, 2.0F, 6.0F, 0.0F, false);
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