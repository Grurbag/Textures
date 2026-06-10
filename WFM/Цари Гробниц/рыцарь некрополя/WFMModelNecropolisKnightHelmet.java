// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNecropolisKnightHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer podborodok;
	private final ModelRenderer cock;
	private final ModelRenderer cockcoshnik;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer body_cape_r1;
	private final ModelRenderer body_cape_r2;
	private final ModelRenderer body_cape_r3;
	private final ModelRenderer body_cape_r4;
	private final ModelRenderer body_cape_r5;

	public WFMModelNecropolisKnightHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 35).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.3F, false);
		head.texOffs(0, 47).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);

		podborodok = new ModelRenderer(this);
		podborodok.setPos(0.0F, -0.4419F, -3.0277F);
		head.addChild(podborodok);
		setRotationAngle(podborodok, 0.8861F, 0.6591F, -0.4636F);
		podborodok.texOffs(40, 29).addBox(-1.5F, -1.375F, -2.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		podborodok.texOffs(50, 22).addBox(-1.0F, -1.125F, -7.0F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		podborodok.texOffs(36, 22).addBox(-1.0F, -1.125F, -7.0F, 2.0F, 2.0F, 5.0F, -0.2F, false);
		podborodok.texOffs(54, 29).addBox(0.0F, -2.125F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		podborodok.texOffs(55, 32).addBox(1.5F, -2.625F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cock = new ModelRenderer(this);
		cock.setPos(0.0F, -7.0F, -5.0F);
		head.addChild(cock);
		setRotationAngle(cock, 0.0F, 0.0F, -0.7854F);
		cock.texOffs(49, 60).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		cock.texOffs(48, 54).addBox(0.1213F, -5.1213F, -1.25F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cockcoshnik = new ModelRenderer(this);
		cockcoshnik.setPos(3.5355F, -3.5355F, -0.75F);
		cock.addChild(cockcoshnik);
		setRotationAngle(cockcoshnik, 0.0F, 0.0F, 0.7854F);
		cockcoshnik.texOffs(60, 49).addBox(-6.5F, -3.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(60, 49).addBox(5.5F, -3.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(58, 45).addBox(3.5F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(58, 45).addBox(-5.5F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(58, 41).addBox(1.5F, -5.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(58, 41).addBox(-3.5F, -5.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(56, 38).addBox(-1.5F, -5.75F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(60, 49).addBox(-6.5F, -3.25F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(58, 45).addBox(-5.5F, -4.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(58, 41).addBox(-3.5F, -5.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(56, 38).addBox(-1.5F, -5.75F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(58, 41).addBox(1.5F, -5.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cockcoshnik.texOffs(60, 49).addBox(5.5F, -3.25F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		cockcoshnik.texOffs(58, 45).addBox(3.5F, -4.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(8.0F, 1.5F, 1.0F);
		cockcoshnik.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.texOffs(60, 60).addBox(-3.0F, -1.2F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		cube_r1.texOffs(60, 60).addBox(-3.0F, -1.2F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(7.0F, -1.25F, 1.0F);
		cockcoshnik.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
		cube_r2.texOffs(60, 53).addBox(-1.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(60, 53).addBox(-1.0F, -1.0F, -1.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-7.0F, -1.25F, 1.0F);
		cockcoshnik.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
		cube_r3.texOffs(60, 53).addBox(0.0F, -1.0F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r3.texOffs(60, 53).addBox(0.0F, -1.0F, -1.6F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-8.0F, 1.5F, 1.0F);
		cockcoshnik.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.texOffs(60, 60).addBox(2.0F, -1.25F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r4.texOffs(60, 60).addBox(2.0F, -1.25F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		body_cape_r1 = new ModelRenderer(this);
		body_cape_r1.setPos(0.0F, 0.0F, 0.25F);
		cockcoshnik.addChild(body_cape_r1);
		setRotationAngle(body_cape_r1, -1.5708F, 0.0F, -0.3927F);
		body_cape_r1.texOffs(0, 23).addBox(-5.0F, -0.75F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		body_cape_r1.texOffs(0, 23).addBox(-1.0F, -0.75F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		body_cape_r2 = new ModelRenderer(this);
		body_cape_r2.setPos(0.0F, 0.0F, 0.25F);
		cockcoshnik.addChild(body_cape_r2);
		setRotationAngle(body_cape_r2, -1.5708F, 0.0F, 0.3927F);
		body_cape_r2.texOffs(0, 23).addBox(3.0F, -0.75F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		body_cape_r2.texOffs(0, 23).addBox(-1.0F, -0.75F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		body_cape_r3 = new ModelRenderer(this);
		body_cape_r3.setPos(0.0F, 0.0F, 0.25F);
		cockcoshnik.addChild(body_cape_r3);
		setRotationAngle(body_cape_r3, -1.5708F, 0.0F, 0.3927F);
		body_cape_r3.texOffs(0, 29).addBox(1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		body_cape_r4 = new ModelRenderer(this);
		body_cape_r4.setPos(0.0F, 0.0F, 0.25F);
		cockcoshnik.addChild(body_cape_r4);
		setRotationAngle(body_cape_r4, -1.5708F, 0.0F, 0.0F);
		body_cape_r4.texOffs(0, 29).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);

		body_cape_r5 = new ModelRenderer(this);
		body_cape_r5.setPos(0.0F, 0.0F, 0.25F);
		cockcoshnik.addChild(body_cape_r5);
		setRotationAngle(body_cape_r5, -1.5708F, 0.0F, -0.3927F);
		body_cape_r5.texOffs(0, 29).addBox(-3.0F, -0.5F, -5.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
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