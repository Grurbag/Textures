// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevIceWitchChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer gem;
	private final ModelRenderer cape;
	private final ModelRenderer tits;
	private final ModelRenderer titRight;
	private final ModelRenderer titLeft;
	private final ModelRenderer dress;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder;

	public WFMModelKislevIceWitchChestplate() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.251F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

		gem = new ModelRenderer(this);
		gem.setPos(0.0F, 9.0F, -2.0F);
		body.addChild(gem);
		setRotationAngle(gem, 0.0F, 0.0F, -0.7854F);
		gem.texOffs(40, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, -1.0F, 4.0F);
		body.addChild(cape);
		cape.texOffs(58, 54).addBox(-6.0F, 0.0F, 0.0F, 12.0F, 10.0F, 0.0F, 0.0F, false);

		tits = new ModelRenderer(this);
		tits.setPos(-3.0F, 3.0F, -2.0F);
		body.addChild(tits);
		

		titRight = new ModelRenderer(this);
		titRight.setPos(0.5F, 0.5F, -0.5F);
		tits.addChild(titRight);
		setRotationAngle(titRight, 0.0F, 0.7854F, 0.0F);
		titRight.texOffs(0, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titRight.texOffs(19, 52).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titRight.texOffs(13, 52).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titRight.texOffs(11, 55).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		titLeft = new ModelRenderer(this);
		titLeft.setPos(5.5F, 0.5F, -0.5F);
		tits.addChild(titLeft);
		setRotationAngle(titLeft, 0.0F, 0.7854F, 0.0F);
		titLeft.texOffs(0, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.1F, false);
		titLeft.texOffs(19, 58).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.3F, false);
		titLeft.texOffs(13, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		titLeft.texOffs(11, 61).addBox(-1.0F, 1.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		dress = new ModelRenderer(this);
		dress.setPos(0.0F, 10.0F, -2.0F);
		body.addChild(dress);
		dress.texOffs(86, 1).addBox(-5.5F, 0.0F, -2.5F, 11.0F, 13.0F, 9.0F, 0.0F, false);
		dress.texOffs(87, 40).addBox(-5.5F, 4.0F, -2.5F, 11.0F, 9.0F, 9.0F, 0.3F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.249F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(-1.75F, -3.0F, -4.0F);
		rightArm.addChild(shoulder2);
		shoulder2.texOffs(55, 0).addBox(-3.0F, 0.0F, 0.0F, 7.0F, 9.0F, 8.0F, 0.0F, true);
		shoulder2.texOffs(56, 17).addBox(-3.0F, 0.0F, 0.0F, 7.0F, 9.0F, 8.0F, 0.3F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.249F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(0.75F, -3.0F, -4.0F);
		leftArm.addChild(shoulder);
		shoulder.texOffs(55, 0).addBox(-3.0F, 0.0F, 0.0F, 7.0F, 9.0F, 8.0F, 0.0F, false);
		shoulder.texOffs(56, 17).addBox(-3.0F, 0.0F, 0.0F, 7.0F, 9.0F, 8.0F, 0.3F, false);
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