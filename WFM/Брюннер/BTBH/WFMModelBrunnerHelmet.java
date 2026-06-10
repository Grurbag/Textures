// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBrunnerHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer greben;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;

	public WFMModelBrunnerHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(0, 17).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 24).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, -3.0F, -2.0F);
		head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.1841F, 0.7769F, 0.1298F);
		Head_r1.texOffs(0, 34).addBox(-4.0F, -5.1F, -4.0F, 8.0F, 9.0F, 8.0F, -0.3F, false);
		Head_r1.texOffs(32, 16).addBox(-4.0F, -5.1F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 0.0F, -1.0F);
		head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.2182F, 0.0F, 0.0F);
		Head_r2.texOffs(0, 55).addBox(-7.0F, -1.0F, 0.0F, 14.0F, 1.0F, 8.0F, 0.0F, false);

		greben = new ModelRenderer(this);
		greben.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(greben);
		greben.texOffs(52, 56).addBox(-0.5F, -36.5F, -2.5F, 1.0F, 2.0F, 5.0F, -0.2F, false);
		greben.texOffs(56, 51).addBox(-0.5F, -35.8F, -5.0F, 1.0F, 2.0F, 3.0F, -0.2F, false);
		greben.texOffs(58, 45).addBox(-0.49F, -34.4F, -5.9F, 1.0F, 3.0F, 2.0F, -0.2F, false);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, -33.8F, 5.1F);
		greben.addChild(Head_r3);
		setRotationAngle(Head_r3, -3.1416F, 0.0F, 3.1416F);
		Head_r3.texOffs(58, 45).addBox(-0.49F, -0.5F, -0.1F, 1.0F, 2.0F, 2.0F, -0.2F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(0.0F, -34.8F, 3.5F);
		greben.addChild(Head_r4);
		setRotationAngle(Head_r4, -3.1416F, 0.0F, 3.1416F);
		Head_r4.texOffs(56, 51).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, -0.2F, false);
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