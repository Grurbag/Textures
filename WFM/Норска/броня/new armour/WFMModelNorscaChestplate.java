// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNorscaChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer RightArm_r2;

	public WFMModelNorscaChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(-2.0F, -0.5F, 0.0F);
		rightArm.addChild(shoulder);
		

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(0.0F, 0.0F, 0.0F);
		shoulder.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -0.1309F);
		RightArm_r1.texOffs(40, 0).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, -0.15F, true);
		RightArm_r1.texOffs(46, 49).addBox(0.75F, -4.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.1F, true);
		RightArm_r1.texOffs(40, 11).addBox(-3.25F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(0, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(2.0F, -0.5F, -4.0F);
		leftArm.addChild(shoulder2);
		

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(0.0F, 0.0F, 0.0F);
		shoulder2.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.1309F);
		RightArm_r2.texOffs(46, 49).addBox(-1.75F, -4.5F, 0.0F, 1.0F, 7.0F, 8.0F, 0.1F, false);
		RightArm_r2.texOffs(40, 11).addBox(-2.75F, -2.5F, 1.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r2.texOffs(40, 0).addBox(-2.75F, -2.5F, 1.0F, 6.0F, 5.0F, 6.0F, -0.15F, false);
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