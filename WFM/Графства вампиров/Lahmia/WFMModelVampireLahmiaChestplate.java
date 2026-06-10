// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelVampireLahmiaChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer tits;
	private final ModelRenderer titRight;
	private final ModelRenderer titLeft;
	private final ModelRenderer vorotnik;
	private final ModelRenderer dress;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public WFMModelVampireLahmiaChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.251F, true);
		body.texOffs(40, 39).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, true);

		tits = new ModelRenderer(this);
		tits.setPos(-3.0F, 3.0F, -2.0F);
		body.addChild(tits);
		

		titRight = new ModelRenderer(this);
		titRight.setPos(0.5F, 0.5F, -0.5F);
		tits.addChild(titRight);
		setRotationAngle(titRight, 0.0F, 0.7854F, 0.0F);
		titRight.texOffs(0, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titRight.texOffs(19, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titRight.texOffs(13, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titRight.texOffs(11, 61).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		titLeft = new ModelRenderer(this);
		titLeft.setPos(5.5F, 0.5F, -0.5F);
		tits.addChild(titLeft);
		setRotationAngle(titLeft, 0.0F, 0.7854F, 0.0F);
		titLeft.texOffs(0, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titLeft.texOffs(19, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titLeft.texOffs(13, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titLeft.texOffs(11, 61).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		vorotnik = new ModelRenderer(this);
		vorotnik.setPos(-1.0F, 3.0F, 2.0F);
		body.addChild(vorotnik);
		setRotationAngle(vorotnik, 0.9599F, 0.0F, 0.0F);
		vorotnik.texOffs(25, 55).addBox(-6.5F, 0.2562F, -0.4604F, 15.0F, 0.0F, 9.0F, 0.0F, false);

		dress = new ModelRenderer(this);
		dress.setPos(0.0F, 10.0F, -1.0F);
		body.addChild(dress);
		setRotationAngle(dress, 0.0436F, 0.0F, 0.0F);
		dress.texOffs(0, 34).addBox(-5.5F, 0.0F, -1.0F, 11.0F, 14.0F, 7.0F, 0.5F, false);
		dress.texOffs(28, 13).addBox(-5.5F, 0.0F, -1.0F, 11.0F, 14.0F, 7.0F, 0.8F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(16, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(16, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);
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