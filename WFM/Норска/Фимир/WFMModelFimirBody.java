// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelFimirBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck2;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer tail7;
	private final ModelRenderer bugor;
	private final ModelRenderer bugor2;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public WFMModelFimirBody() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 9.0F, 0.0F);
		body.texOffs(31, 0).addBox(-5.0F, -16.0F, -3.0F, 10.0F, 16.0F, 6.0F, 0.3F, false);
		body.texOffs(31, 22).addBox(-5.0F, -16.0F, -3.0F, 10.0F, 16.0F, 6.0F, 0.5F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -15.0F, -3.0F);
		body.addChild(neck2);
		neck2.texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 7.0F, 7.0F, 0.3F, false);

		tail5 = new ModelRenderer(this);
		tail5.setPos(0.0F, -2.0F, 3.0F);
		body.addChild(tail5);
		setRotationAngle(tail5, -0.3927F, 0.0F, 0.0F);
		tail5.texOffs(1, 52).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 5.0F, 7.0F, 0.5F, false);

		tail6 = new ModelRenderer(this);
		tail6.setPos(0.0F, 0.0F, 6.0F);
		tail5.addChild(tail6);
		setRotationAngle(tail6, 0.2182F, 0.0F, 0.0F);
		tail6.texOffs(0, 37).addBox(-1.0F, -2.0F, -4.0F, 3.0F, 4.0F, 9.0F, 0.5F, false);

		tail7 = new ModelRenderer(this);
		tail7.setPos(-1.0F, -1.0F, 4.0F);
		tail6.addChild(tail7);
		tail7.texOffs(0, 26).addBox(0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 8.0F, 0.5F, false);

		bugor = new ModelRenderer(this);
		bugor.setPos(0.0F, -18.0F, 0.0F);
		body.addChild(bugor);
		setRotationAngle(bugor, 0.0F, 0.0F, 0.7854F);
		bugor.texOffs(98, 49).addBox(-4.0F, -4.0F, -1.0F, 10.0F, 10.0F, 5.0F, 0.0F, false);

		bugor2 = new ModelRenderer(this);
		bugor2.setPos(2.1213F, 2.1213F, 1.0F);
		bugor.addChild(bugor2);
		bugor2.texOffs(67, 49).addBox(-4.7071F, -4.7071F, -1.0F, 10.0F, 10.0F, 5.0F, 0.0F, false);
		bugor2.texOffs(73, 43).addBox(-1.7071F, -1.7071F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -4.0F, 0.0F);
		leftArm.texOffs(74, 0).addBox(1.0F, -2.0F, -3.5F, 4.0F, 16.0F, 5.0F, 0.3F, true);
		leftArm.texOffs(100, 0).addBox(1.0F, -2.0F, -3.5F, 4.0F, 16.0F, 5.0F, 0.5F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, -4.0F, 0.0F);
		rightArm.texOffs(74, 0).addBox(-4.0F, -2.0F, -3.5F, 4.0F, 16.0F, 5.0F, 0.3F, false);
		rightArm.texOffs(100, 0).addBox(-4.0F, -2.0F, -3.5F, 4.0F, 16.0F, 5.0F, 0.5F, false);
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