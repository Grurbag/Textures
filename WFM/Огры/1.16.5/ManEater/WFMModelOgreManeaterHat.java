// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOgreManeaterHat extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;
	private final ModelRenderer hat4;
	private final ModelRenderer hat_r1;
	private final ModelRenderer hat6;
	private final ModelRenderer hat5;
	private final ModelRenderer hat_r2;
	private final ModelRenderer feather;
	private final ModelRenderer feather2;

	public WFMModelOgreManeaterHat() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -28.0F, 1.0F);
		head.texOffs(0, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 0.5F, false);
		head.texOffs(72, 105).addBox(-5.0F, -10.0F, -6.0F, 11.0F, 12.0F, 11.0F, 1.1F, false);
		head.texOffs(0, 93).addBox(-4.5F, -12.0F, -5.5F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		head.texOffs(2, 83).addBox(-4.0F, -13.0F, -5.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.4644F, -7.6753F, -0.5F);
		head.addChild(hat);
		setRotationAngle(hat, 0.0F, 0.0F, 0.2182F);
		hat.texOffs(0, 0).addBox(-10.5F, -1.0F, -10.5F, 21.0F, 2.0F, 21.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setPos(21.0F, 1.0F, 0.0F);
		hat.addChild(hat2);
		hat2.texOffs(65, 0).addBox(-10.5F, -1.0F, -8.5F, 3.0F, 2.0F, 17.0F, 0.0F, false);

		hat3 = new ModelRenderer(this);
		hat3.setPos(0.0F, 1.0F, 3.0F);
		hat.addChild(hat3);
		hat3.texOffs(88, 28).addBox(-8.5F, -1.0F, 7.5F, 17.0F, 2.0F, 3.0F, 0.0F, false);

		hat4 = new ModelRenderer(this);
		hat4.setPos(-3.0F, -1.0F, -2.0F);
		hat.addChild(hat4);
		

		hat_r1 = new ModelRenderer(this);
		hat_r1.setPos(-9.0F, 0.0F, 0.0F);
		hat4.addChild(hat_r1);
		setRotationAngle(hat_r1, 0.0F, 3.1416F, 0.0F);
		hat_r1.texOffs(65, 0).addBox(-1.5F, -1.0F, -8.5F, 3.0F, 2.0F, 17.0F, 0.0F, false);

		hat6 = new ModelRenderer(this);
		hat6.setPos(0.0F, -2.0F, 0.0F);
		hat4.addChild(hat6);
		hat6.texOffs(88, -20).addBox(-10.5F, -10.0F, -11.5F, 0.0F, 11.0F, 20.0F, 0.0F, false);

		hat5 = new ModelRenderer(this);
		hat5.setPos(-2.0F, -1.0F, -21.0F);
		hat.addChild(hat5);
		hat5.texOffs(88, 0).addBox(-11.5F, -12.0F, 7.5F, 20.0F, 11.0F, 0.0F, 0.0F, true);

		hat_r2 = new ModelRenderer(this);
		hat_r2.setPos(0.0F, 0.0F, 9.0F);
		hat5.addChild(hat_r2);
		setRotationAngle(hat_r2, 0.0F, 3.1416F, 0.0F);
		hat_r2.texOffs(88, 28).addBox(-8.5F, -1.0F, -1.5F, 17.0F, 2.0F, 3.0F, 0.0F, true);

		feather = new ModelRenderer(this);
		feather.setPos(-1.0F, -1.0F, -10.0F);
		hat.addChild(feather);
		setRotationAngle(feather, 0.0F, -0.4363F, 0.0F);
		feather.texOffs(96, 84).addBox(0.0F, -13.0F, 0.0F, 16.0F, 14.0F, 0.0F, 0.0F, false);

		feather2 = new ModelRenderer(this);
		feather2.setPos(-1.0F, -1.0F, -10.0F);
		hat.addChild(feather2);
		setRotationAngle(feather2, 0.0F, -0.829F, 0.0F);
		feather2.texOffs(96, 63).addBox(0.0F, -13.0F, 0.0F, 16.0F, 14.0F, 0.0F, 0.0F, false);
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