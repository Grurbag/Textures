// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelTobKIngsLichePriest extends EntityModel<Entity> {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer snake;
	private final ModelRenderer helmetLeft;
	private final ModelRenderer helmetRight;
	private final ModelRenderer podborodok;
	private final ModelRenderer podborodok2;

	public WFMModelTobKIngsLichePriest() {
		texWidth = 64;
		texHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setPos(0.0F, 0.0F, 0.0F);
		helmet.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setPos(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		snake = new ModelRenderer(this);
		snake.setPos(0.0F, -8.0F, -4.0F);
		helmetOverlay.addChild(snake);
		snake.texOffs(0, 23).addBox(-4.5F, -9.5F, -0.5F, 9.0F, 9.0F, 0.0F, 0.0F, false);

		helmetLeft = new ModelRenderer(this);
		helmetLeft.setPos(-8.0F, 1.0F, 4.0F);
		helmetOverlay.addChild(helmetLeft);
		helmetLeft.texOffs(19, 20).addBox(-0.5F, -9.0F, -0.5F, 5.0F, 12.0F, 0.0F, 0.0F, false);

		helmetRight = new ModelRenderer(this);
		helmetRight.setPos(4.0F, 1.0F, 4.0F);
		helmetOverlay.addChild(helmetRight);
		helmetRight.texOffs(30, 20).addBox(-0.5F, -9.0F, -0.5F, 5.0F, 12.0F, 0.0F, 0.0F, false);

		podborodok = new ModelRenderer(this);
		podborodok.setPos(0.0F, 0.0F, -4.0F);
		helmetOverlay.addChild(podborodok);
		setRotationAngle(podborodok, -0.2618F, 0.0F, 0.0F);
		podborodok.texOffs(46, 23).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 4.0F, 0.0F, 0.0F, false);

		podborodok2 = new ModelRenderer(this);
		podborodok2.setPos(0.0F, 4.0F, 0.0F);
		podborodok.addChild(podborodok2);
		setRotationAngle(podborodok2, -0.6981F, 0.0F, 0.0F);
		podborodok2.texOffs(46, 27).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		helmet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}