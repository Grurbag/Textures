// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDarkElfCorsairHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer face_r1;
	private final ModelRenderer face_r2;
	private final ModelRenderer face_r3;

	public WFMModelDarkElfCorsairHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -1.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 20).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Head.texOffs(20, 20).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Head.texOffs(24, 25).addBox(-1.0F, -16.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.texOffs(0, 40).addBox(-8.5F, -19.0F, -5.2F, 17.0F, 21.0F, 0.0F, 0.0F, false);
		Head.texOffs(32, 18).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);

		face_r1 = new ModelRenderer(this);
		face_r1.setPos(4.5F, 2.5F, 4.8F);
		Head.addChild(face_r1);
		setRotationAngle(face_r1, -2.6496F, -0.9909F, 2.7202F);
		face_r1.texOffs(46, 52).addBox(-9.0F, -12.5F, 0.0F, 9.0F, 12.0F, 0.0F, 0.0F, false);

		face_r2 = new ModelRenderer(this);
		face_r2.setPos(-4.5F, 2.5F, 4.8F);
		Head.addChild(face_r2);
		setRotationAngle(face_r2, -0.5258F, -1.029F, 0.4614F);
		face_r2.texOffs(46, 52).addBox(-9.0F, -12.5F, 0.0F, 9.0F, 12.0F, 0.0F, 0.0F, false);

		face_r3 = new ModelRenderer(this);
		face_r3.setPos(0.0F, 2.5F, 4.8F);
		Head.addChild(face_r3);
		setRotationAngle(face_r3, -0.2618F, 0.0F, 0.0F);
		face_r3.texOffs(46, 28).addBox(-4.5F, -17.5F, 0.0F, 9.0F, 17.0F, 0.0F, 0.0F, false);
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