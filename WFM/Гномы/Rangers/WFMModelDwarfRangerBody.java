// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfRangerBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cape;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder_right;

	public WFMModelDwarfRangerBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		body.texOffs(46, 14).addBox(-4.5F, 6.0F, -4.0F, 9.0F, 9.0F, 0.0F, -0.5F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 0.0F, 3.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.0436F, 0.0F, 0.0F);
		cape.texOffs(40, 42).addBox(-6.0F, -1.0F, 1.0F, 12.0F, 22.0F, 0.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setPos(1.0F, -0.5F, 0.0F);
		leftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 0.0F, 0.1309F);
		shoulder_left.texOffs(0, 52).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, 0.1F, true);
		shoulder_left.texOffs(0, 33).addBox(-2.75F, -2.5F, -3.5F, 6.0F, 5.0F, 7.0F, -0.15F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setPos(-1.0F, -0.5F, 0.0F);
		rightArm.addChild(shoulder_right);
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
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}