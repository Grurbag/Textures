// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelVampirePirateChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer vorotnik;
	private final ModelRenderer cape;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder;
	private final ModelRenderer RightArm_r2;

	public WFMModelVampirePirateChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);

		vorotnik = new ModelRenderer(this);
		vorotnik.setPos(-1.0F, 3.0F, 2.0F);
		body.addChild(vorotnik);
		setRotationAngle(vorotnik, 0.9599F, 0.0F, 0.0F);
		vorotnik.texOffs(25, 55).addBox(-6.5F, 0.2562F, -0.4604F, 15.0F, 0.0F, 9.0F, 0.0F, false);
		vorotnik.texOffs(25, 46).addBox(-6.5F, 0.0F, -0.4604F, 15.0F, 0.0F, 9.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 9.0F, 2.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.texOffs(0, 50).addBox(-6.5F, 0.0F, 0.0F, 13.0F, 14.0F, 0.0F, 0.0F, false);
		cape.texOffs(0, 36).addBox(-6.5F, 0.0F, -0.2F, 13.0F, 14.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(-2.0768F, -0.7379F, 0.4142F);
		rightArm.addChild(shoulder2);
		setRotationAngle(shoulder2, -1.5708F, 0.7854F, -1.6581F);
		shoulder2.texOffs(40, 15).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 6.0F, 6.0F, 0.3F, false);
		shoulder2.texOffs(40, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 6.0F, 6.0F, 0.1F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(0.0F, 0.0F, 0.0F);
		shoulder2.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.1555F, 0.1536F, 0.012F);
		RightArm_r1.texOffs(46, 29).addBox(0.0F, -2.5F, -3.0F, 3.0F, 3.0F, 6.0F, 0.1F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(0, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(1.9848F, -1.0335F, -0.2929F);
		leftArm.addChild(shoulder);
		setRotationAngle(shoulder, 1.5708F, -0.7854F, -1.3963F);
		shoulder.texOffs(40, 15).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 6.0F, 6.0F, 0.3F, false);
		shoulder.texOffs(40, 0).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 6.0F, 6.0F, 0.1F, false);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(0.0F, 0.0F, 0.0F);
		shoulder.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.124F, 0.1231F, 0.0077F);
		RightArm_r2.texOffs(46, 29).addBox(-0.3036F, -2.1964F, -2.8264F, 3.0F, 3.0F, 6.0F, 0.1F, false);
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