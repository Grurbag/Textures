// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWitchHunterBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer rightArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer RightArm_r1;

	public WFMModelWitchHunterBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		body.texOffs(40, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.9F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setPos(0.0F, 0.0F, 3.0F);
		body.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.2618F, 0.0F, 0.0F);
		Body_r1.texOffs(0, 52).addBox(-6.0F, -2.0F, -5.0F, 12.0F, 4.0F, 8.0F, 0.9F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);
		rightArm.texOffs(0, 0).addBox(0.0F, -1.0F, -3.5F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, 1.0F, -3.5F, 1.0F, 6.0F, 0.0F, 0.0F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-1.2479F, -0.4674F, 0.0F);
		rightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.texOffs(40, 32).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);
		LeftArm_r1.texOffs(40, 43).addBox(-3.0F, -2.7326F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(1.0F, -0.5F, 0.0F);
		leftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r1.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}