// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreIrongutBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer gut2;
	private final ModelRenderer spike;
	private final ModelRenderer spike2;
	private final ModelRenderer spike3;
	private final ModelRenderer spike4;
	private final ModelRenderer spike5;
	private final ModelRenderer neck2;
	private final ModelRenderer dickCape;
	private final ModelRenderer shield;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public WFMModelOgreIrongutBody() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(1.0F, 1.0F, 3.0F);
		body.texOffs(54, 0).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.5F, false);
		body.texOffs(54, 77).addBox(-12.0F, -25.0F, -7.0F, 23.0F, 27.0F, 14.0F, 0.7F, false);

		gut2 = new ModelRenderer(this);
		gut2.setPos(0.0F, 0.0F, -8.0F);
		body.addChild(gut2);
		gut2.texOffs(87, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.5F, false);
		gut2.texOffs(47, 41).addBox(-8.0F, -13.0F, -3.0F, 15.0F, 15.0F, 5.0F, 0.7F, false);

		spike = new ModelRenderer(this);
		spike.setPos(-0.5F, -5.5F, -4.0F);
		gut2.addChild(spike);
		setRotationAngle(spike, 0.0F, 0.0F, 0.7854F);
		spike.texOffs(39, 0).addBox(-2.5F, -2.5F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		spike2 = new ModelRenderer(this);
		spike2.setPos(-1.0F, 0.0F, -2.0F);
		spike.addChild(spike2);
		spike2.texOffs(39, 8).addBox(-1.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		spike3 = new ModelRenderer(this);
		spike3.setPos(0.0F, 0.0F, -2.0F);
		spike2.addChild(spike3);
		spike3.texOffs(40, 15).addBox(-0.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		spike4 = new ModelRenderer(this);
		spike4.setPos(-1.0F, 0.0F, -2.0F);
		spike3.addChild(spike4);
		spike4.texOffs(41, 21).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		spike5 = new ModelRenderer(this);
		spike5.setPos(0.0F, 0.0F, -2.0F);
		spike4.addChild(spike5);
		spike5.texOffs(42, 27).addBox(1.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -25.0F, 0.0F);
		body.addChild(neck2);
		neck2.texOffs(74, 62).addBox(-9.0F, -4.0F, -5.0F, 17.0F, 4.0F, 10.0F, 0.0F, false);

		dickCape = new ModelRenderer(this);
		dickCape.setPos(0.0F, 5.0F, -6.0F);
		body.addChild(dickCape);
		dickCape.texOffs(0, 0).addBox(-9.0F, -3.0F, -1.0F, 17.0F, 16.0F, 0.0F, 0.0F, false);

		shield = new ModelRenderer(this);
		shield.setPos(-9.5F, -18.5F, -8.5F);
		body.addChild(shield);
		setRotationAngle(shield, -0.124F, 0.1231F, -0.7931F);
		shield.texOffs(1, 37).addBox(-4.5F, -3.5F, -0.5F, 9.0F, 9.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(12.0F, -19.0F, 4.0F);
		leftArm.texOffs(1, 50).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.5F, false);
		leftArm.texOffs(0, 85).addBox(0.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.7F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-11.0F, -19.0F, 4.0F);
		rightArm.texOffs(1, 50).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.5F, true);
		rightArm.texOffs(0, 85).addBox(-8.0F, -4.0F, -5.0F, 8.0F, 25.0F, 9.0F, 0.7F, true);
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