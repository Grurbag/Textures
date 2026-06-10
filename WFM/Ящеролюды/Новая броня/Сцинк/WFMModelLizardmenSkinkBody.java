// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenSkinkBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck2;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public WFMModelLizardmenSkinkBody() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 11.0F, 0.0F);
		body.texOffs(30, 3).addBox(-3.5F, -10.0F, -2.0F, 7.0F, 10.0F, 4.0F, 0.3F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -11.0F, -3.0F);
		body.addChild(neck2);
		neck2.texOffs(0, 0).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 5.0F, 7.0F, 0.3F, false);

		tail4 = new ModelRenderer(this);
		tail4.setPos(0.0F, -2.0F, 3.0F);
		body.addChild(tail4);
		setRotationAngle(tail4, -0.3927F, 0.0F, 0.0F);
		tail4.texOffs(23, 47).addBox(-1.5F, -1.0F, -3.0F, 4.0F, 4.0F, 9.0F, 0.3F, false);

		tail5 = new ModelRenderer(this);
		tail5.setPos(-1.0F, 0.0F, 6.0F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, 0.2182F, 0.0F, 0.0F);
		tail5.texOffs(24, 34).addBox(0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 9.0F, 0.3F, false);

		tail6 = new ModelRenderer(this);
		tail6.setPos(-1.0F, 0.0F, 7.0F);
		tail5.addChild(tail6);
		setRotationAngle(tail6, 0.2618F, 0.0F, 0.0F);
		tail6.texOffs(24, 23).addBox(2.0F, 1.0F, -1.0F, 1.0F, 2.0F, 8.0F, 0.3F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(3.0F, 2.0F, -2.0F);
		leftArm.texOffs(57, 1).addBox(1.0F, -2.0F, -2.5F, 3.0F, 14.0F, 4.0F, 0.3F, true);
		leftArm.texOffs(71, 1).addBox(1.0F, -2.0F, -2.5F, 3.0F, 14.0F, 4.0F, 0.5F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, -2.0F, -2.0F);
		rightArm.texOffs(57, 1).addBox(-3.0F, 2.0F, -2.5F, 3.0F, 14.0F, 4.0F, 0.3F, false);
		rightArm.texOffs(71, 1).addBox(-3.0F, 2.0F, -2.5F, 3.0F, 14.0F, 4.0F, 0.5F, false);
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