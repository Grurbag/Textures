// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelIronbreakerBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulder_right;

	public WFMModelIronbreakerBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		LeftArm.texOffs(0, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setPos(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 0.0F, 0.1309F);
		shoulder_left.texOffs(38, 32).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.1F, false);
		shoulder_left.texOffs(38, 52).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, -0.15F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		RightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setPos(-1.0F, -0.5F, 0.0F);
		RightArm.addChild(shoulder_right);
		setRotationAngle(shoulder_right, 0.0F, 0.0F, -0.1309F);
		shoulder_right.texOffs(0, 33).addBox(-3.25F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, -0.15F, false);
		shoulder_right.texOffs(0, 52).addBox(-3.25F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.1F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}