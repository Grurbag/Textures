// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfMinerHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer candle;
	private final ModelRenderer string2_r1;
	private final ModelRenderer string1_r1;

	public WFMModelDwarfMinerHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 23.0F, 0.0F);
		setRotationAngle(head, 0.0F, 3.1416F, 0.0F);
		head.texOffs(3, 25).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 5.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.1F, false);
		head.texOffs(0, 50).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		head.texOffs(0, 41).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.texOffs(49, 33).addBox(-1.0F, -11.0F, -5.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);
		head.texOffs(48, 32).addBox(-1.0F, -11.0F, -0.5F, 2.0F, 5.0F, 6.0F, 0.0F, false);
		head.texOffs(53, 43).addBox(-1.0F, -4.0F, 5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		candle = new ModelRenderer(this);
		candle.setPos(0.0F, -10.125F, 1.5F);
		head.addChild(candle);
		candle.texOffs(48, 58).addBox(-2.0F, -1.375F, -2.0F, 4.0F, 2.0F, 4.0F, 0.05F, false);
		candle.texOffs(48, 52).addBox(-2.0F, -1.375F, -2.0F, 4.0F, 2.0F, 4.0F, 0.3F, false);
		candle.texOffs(0, 8).addBox(-1.5F, -7.875F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		candle.texOffs(3, 0).addBox(-2.0F, -8.375F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		string2_r1 = new ModelRenderer(this);
		string2_r1.setPos(0.0F, -7.875F, 0.0F);
		candle.addChild(string2_r1);
		setRotationAngle(string2_r1, 0.0F, 0.7854F, 0.0F);
		string2_r1.texOffs(0, -1).addBox(0.0F, -2.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);

		string1_r1 = new ModelRenderer(this);
		string1_r1.setPos(0.0F, -7.875F, 0.0F);
		candle.addChild(string1_r1);
		setRotationAngle(string1_r1, 0.0F, -0.7854F, 0.0F);
		string1_r1.texOffs(0, -1).addBox(0.0F, -2.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}