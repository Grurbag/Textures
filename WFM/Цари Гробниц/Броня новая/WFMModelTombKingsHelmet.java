// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelTombKingsHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer cockcoshnik;
	private final ModelRenderer body_cape_r1;

	public WFMModelTombKingsHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 22).addBox(-2.5F, -2.6721F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		cockcoshnik = new ModelRenderer(this);
		cockcoshnik.setPos(0.0F, -7.0F, 0.0F);
		Head.addChild(cockcoshnik);
		cockcoshnik.texOffs(60, 60).addBox(-8.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(60, 60).addBox(7.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(60, 53).addBox(6.5F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(60, 53).addBox(-7.5F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(60, 49).addBox(-6.5F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(60, 49).addBox(5.5F, -6.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(58, 45).addBox(3.5F, -7.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(58, 45).addBox(-5.5F, -7.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(58, 41).addBox(1.5F, -8.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(58, 41).addBox(-3.5F, -8.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(56, 38).addBox(-1.5F, -9.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		body_cape_r1 = new ModelRenderer(this);
		body_cape_r1.setPos(0.0F, 0.0F, 0.0F);
		cockcoshnik.addChild(body_cape_r1);
		setRotationAngle(body_cape_r1, -1.5708F, 0.0F, 0.0F);
		body_cape_r1.texOffs(-10, 54).addBox(-8.5F, 0.0F, -10.0F, 17.0F, 0.0F, 10.0F, 0.0F, false);
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