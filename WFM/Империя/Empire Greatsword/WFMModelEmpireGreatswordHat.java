// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelEmpireGreatswordHat extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer hat;
	private final ModelRenderer hat3;
	private final ModelRenderer hat2;
	private final ModelRenderer hat4;
	private final ModelRenderer hat6;
	private final ModelRenderer hat8;
	private final ModelRenderer hat5;
	private final ModelRenderer hat7;
	private final ModelRenderer feathers;
	private final ModelRenderer feather_r1;
	private final ModelRenderer feather_r2;
	private final ModelRenderer feather_r3;
	private final ModelRenderer feather_r4;

	public WFMModelEmpireGreatswordHat() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, -8.0F, 0.0F);
		Head.addChild(hat);
		setRotationAngle(hat, 0.0F, 0.0F, 0.2182F);
		hat.texOffs(0, 46).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 2.0F, 16.0F, 0.0F, false);

		hat3 = new ModelRenderer(this);
		hat3.setPos(0.0F, 1.0F, 2.0F);
		hat.addChild(hat3);
		hat3.texOffs(36, 42).addBox(-4.0F, -1.0F, 6.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setPos(2.0F, 1.0F, 0.0F);
		hat.addChild(hat2);
		setRotationAngle(hat2, 0.0F, 1.5708F, 0.0F);
		hat2.texOffs(36, 42).addBox(-8.0F, -1.0F, 6.0F, 12.0F, 2.0F, 2.0F, 0.0F, true);

		hat4 = new ModelRenderer(this);
		hat4.setPos(0.0F, -1.0F, -2.0F);
		hat.addChild(hat4);
		setRotationAngle(hat4, 0.0F, 3.1416F, 0.0F);
		hat4.texOffs(36, 42).addBox(-4.0F, -1.0F, 6.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);

		hat6 = new ModelRenderer(this);
		hat6.setPos(0.0F, -2.0F, 0.0F);
		hat4.addChild(hat6);
		hat6.texOffs(0, 18).addBox(-4.0F, -10.0F, 8.0F, 14.0F, 11.0F, 0.0F, 0.0F, false);

		hat8 = new ModelRenderer(this);
		hat8.setPos(0.0F, -2.0F, 0.0F);
		hat4.addChild(hat8);
		hat8.texOffs(10, 16).addBox(8.0F, 1.0F, 6.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		hat5 = new ModelRenderer(this);
		hat5.setPos(-16.0F, -1.0F, -2.0F);
		hat.addChild(hat5);
		setRotationAngle(hat5, 0.0F, 1.5708F, 0.0F);
		hat5.texOffs(36, 42).addBox(-6.0F, -1.0F, 6.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);

		hat7 = new ModelRenderer(this);
		hat7.setPos(0.0F, -2.0F, 0.0F);
		hat5.addChild(hat7);
		hat7.texOffs(0, 18).addBox(-6.0F, -10.0F, 6.0F, 14.0F, 11.0F, 0.0F, 0.0F, false);

		feathers = new ModelRenderer(this);
		feathers.setPos(2.0F, 1.0F, 2.0F);
		Head.addChild(feathers);
		setRotationAngle(feathers, 0.0F, 0.6981F, 0.0F);
		feathers.texOffs(36, 3).addBox(0.0F, -22.0F, -2.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r1 = new ModelRenderer(this);
		feather_r1.setPos(0.0F, -5.0F, -2.0F);
		feathers.addChild(feather_r1);
		setRotationAngle(feather_r1, 0.0F, 1.0908F, 0.0F);
		feather_r1.texOffs(0, 20).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r2 = new ModelRenderer(this);
		feather_r2.setPos(0.0F, -9.0F, -3.0F);
		feathers.addChild(feather_r2);
		setRotationAngle(feather_r2, 0.0F, 0.6109F, 0.0F);
		feather_r2.texOffs(0, 20).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r3 = new ModelRenderer(this);
		feather_r3.setPos(0.0F, -10.0F, -3.0F);
		feathers.addChild(feather_r3);
		setRotationAngle(feather_r3, 0.0F, -0.3491F, 0.0F);
		feather_r3.texOffs(0, 20).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r4 = new ModelRenderer(this);
		feather_r4.setPos(0.0F, -6.0F, -3.0F);
		feathers.addChild(feather_r4);
		setRotationAngle(feather_r4, 0.0F, -0.8727F, 0.0F);
		feather_r4.texOffs(36, 3).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}