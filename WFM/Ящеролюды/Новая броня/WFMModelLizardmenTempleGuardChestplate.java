// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenTempleGuardChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer neck2;
	private final ModelRenderer tail4;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone5;
	private final ModelRenderer bodySpike10;
	private final ModelRenderer bodySpike11;
	private final ModelRenderer bodySpike12;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer bodySpike;
	private final ModelRenderer bodySpike2;
	private final ModelRenderer bodySpike3;
	private final ModelRenderer bodySpike4;
	private final ModelRenderer bodySpike5;
	private final ModelRenderer bodySpike6;
	private final ModelRenderer bodySpike7;
	private final ModelRenderer bodySpike8;
	private final ModelRenderer bodySpike9;
	private final ModelRenderer leftArm;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone3;
	private final ModelRenderer rightArm;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone7;

	public WFMModelLizardmenTempleGuardChestplate() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 9.0F, 0.0F);
		body.texOffs(0, 0).addBox(-5.0F, -16.0F, -3.0F, 10.0F, 16.0F, 6.0F, 0.5F, false);
		body.texOffs(0, 22).addBox(-5.0F, -16.0F, -3.0F, 10.0F, 16.0F, 6.0F, 0.7F, false);

		neck2 = new ModelRenderer(this);
		neck2.setPos(0.0F, -15.0F, -3.0F);
		body.addChild(neck2);
		neck2.texOffs(50, 14).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.5F, false);

		tail4 = new ModelRenderer(this);
		tail4.setPos(0.0F, -2.0F, 3.0F);
		body.addChild(tail4);
		setRotationAngle(tail4, -0.3927F, 0.0F, 0.0F);
		tail4.texOffs(32, 0).addBox(-2.0F, -2.0F, -3.0F, 5.0F, 5.0F, 9.0F, 0.5F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.5658F, -3.4576F, 9.6413F);
		tail4.addChild(bone4);
		setRotationAngle(bone4, 1.5392F, 0.3021F, -1.4793F);
		bone4.texOffs(0, 120).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		bone4.texOffs(4, 116).addBox(-1.75F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-0.5F, -1.0F, 0.5F);
		bone4.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.texOffs(8, 123).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.25F, 3.0F, 0.0F);
		bone4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0446F, -0.0175F, -0.2578F);
		cube_r2.texOffs(3, 120).addBox(-0.75F, -2.0F, -0.75F, 1.5F, 6.0F, 1.5F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(1.0F, 6.0F, 0.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.48F);
		bone5.texOffs(0, 116).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bodySpike10 = new ModelRenderer(this);
		bodySpike10.setPos(0.0F, 0.1123F, -1.164F);
		tail4.addChild(bodySpike10);
		setRotationAngle(bodySpike10, 0.8727F, 0.0F, 0.0F);
		bodySpike10.texOffs(114, 0).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		bodySpike11 = new ModelRenderer(this);
		bodySpike11.setPos(-0.5F, 0.0F, 3.5F);
		bodySpike10.addChild(bodySpike11);
		setRotationAngle(bodySpike11, -0.3491F, 0.0F, 0.0F);
		bodySpike11.texOffs(118, 7).addBox(-0.25F, -1.0F, 0.0F, 1.5F, 2.0F, 3.0F, 0.0F, false);

		bodySpike12 = new ModelRenderer(this);
		bodySpike12.setPos(0.25F, 0.2781F, 1.495F);
		bodySpike11.addChild(bodySpike12);
		setRotationAngle(bodySpike12, -0.3491F, 0.0F, 0.0F);
		bodySpike12.texOffs(120, 12).addBox(-0.25F, -1.25F, 0.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		tail5 = new ModelRenderer(this);
		tail5.setPos(0.0F, 0.0F, 6.0F);
		tail4.addChild(tail5);
		setRotationAngle(tail5, 0.2182F, 0.0F, 0.0F);
		tail5.texOffs(0, 44).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 4.0F, 9.0F, 0.5F, false);

		tail6 = new ModelRenderer(this);
		tail6.setPos(-1.0F, 0.0F, 7.0F);
		tail5.addChild(tail6);
		setRotationAngle(tail6, 0.2618F, 0.0F, 0.0F);
		tail6.texOffs(50, 25).addBox(0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 8.0F, 0.5F, false);

		bodySpike = new ModelRenderer(this);
		bodySpike.setPos(0.0F, -16.009F, 0.2835F);
		body.addChild(bodySpike);
		setRotationAngle(bodySpike, 0.5236F, 0.0F, 0.0F);
		bodySpike.texOffs(114, 0).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		bodySpike2 = new ModelRenderer(this);
		bodySpike2.setPos(-0.5F, 0.0F, 3.5F);
		bodySpike.addChild(bodySpike2);
		setRotationAngle(bodySpike2, -0.3491F, 0.0F, 0.0F);
		bodySpike2.texOffs(118, 7).addBox(-0.25F, -1.0F, 0.0F, 1.5F, 2.0F, 3.0F, 0.0F, false);

		bodySpike3 = new ModelRenderer(this);
		bodySpike3.setPos(0.25F, 0.2781F, 1.495F);
		bodySpike2.addChild(bodySpike3);
		setRotationAngle(bodySpike3, -0.3491F, 0.0F, 0.0F);
		bodySpike3.texOffs(120, 12).addBox(-0.25F, -1.25F, 0.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bodySpike4 = new ModelRenderer(this);
		bodySpike4.setPos(0.0F, -13.1903F, 0.6392F);
		body.addChild(bodySpike4);
		setRotationAngle(bodySpike4, 0.0873F, 0.0F, 0.0F);
		bodySpike4.texOffs(114, 0).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		bodySpike5 = new ModelRenderer(this);
		bodySpike5.setPos(-0.5F, 0.0F, 3.5F);
		bodySpike4.addChild(bodySpike5);
		setRotationAngle(bodySpike5, -0.3491F, 0.0F, 0.0F);
		bodySpike5.texOffs(118, 7).addBox(-0.25F, -1.0F, 0.0F, 1.5F, 2.0F, 3.0F, 0.0F, false);

		bodySpike6 = new ModelRenderer(this);
		bodySpike6.setPos(0.25F, 0.2781F, 1.495F);
		bodySpike5.addChild(bodySpike6);
		setRotationAngle(bodySpike6, -0.3491F, 0.0F, 0.0F);
		bodySpike6.texOffs(120, 12).addBox(-0.25F, -1.25F, 0.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		bodySpike7 = new ModelRenderer(this);
		bodySpike7.setPos(0.0F, -8.1222F, 0.0788F);
		body.addChild(bodySpike7);
		setRotationAngle(bodySpike7, 0.2182F, 0.0F, 0.0F);
		bodySpike7.texOffs(114, 0).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		bodySpike8 = new ModelRenderer(this);
		bodySpike8.setPos(-0.5F, 0.0F, 3.5F);
		bodySpike7.addChild(bodySpike8);
		setRotationAngle(bodySpike8, -0.3491F, 0.0F, 0.0F);
		bodySpike8.texOffs(118, 7).addBox(-0.25F, -1.0F, 0.0F, 1.5F, 2.0F, 3.0F, 0.0F, false);

		bodySpike9 = new ModelRenderer(this);
		bodySpike9.setPos(0.25F, 0.2781F, 1.495F);
		bodySpike8.addChild(bodySpike9);
		setRotationAngle(bodySpike9, -0.3491F, 0.0F, 0.0F);
		bodySpike9.texOffs(120, 12).addBox(-0.25F, -1.25F, 0.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -4.0F, 0.0F);
		leftArm.texOffs(32, 14).addBox(1.0F, -2.0F, -2.5F, 4.0F, 16.0F, 5.0F, 0.5F, true);
		leftArm.texOffs(32, 35).addBox(1.0F, -2.0F, -2.5F, 4.0F, 16.0F, 5.0F, 0.7F, true);

		bone2 = new ModelRenderer(this);
		bone2.setPos(7.0F, 1.0F, 0.0F);
		leftArm.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.2182F);
		bone2.texOffs(0, 120).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		bone2.texOffs(4, 116).addBox(-1.75F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-0.5F, -1.0F, 0.5F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3054F);
		cube_r3.texOffs(8, 123).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.25F, 3.0F, 0.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0446F, -0.0175F, -0.2578F);
		cube_r4.texOffs(3, 120).addBox(-0.75F, -2.0F, -0.75F, 1.5F, 6.0F, 1.5F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(1.0F, 6.0F, 0.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.48F);
		bone3.texOffs(0, 116).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, -4.0F, 0.0F);
		rightArm.texOffs(32, 14).addBox(-4.0F, -2.0F, -2.5F, 4.0F, 16.0F, 5.0F, 0.5F, false);
		rightArm.texOffs(32, 35).addBox(-4.0F, -2.0F, -2.5F, 4.0F, 16.0F, 5.0F, 0.7F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(-5.2431F, 8.5819F, -0.4971F);
		rightArm.addChild(bone6);
		setRotationAngle(bone6, 3.102F, 0.1248F, 3.0519F);
		bone6.texOffs(0, 120).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		bone6.texOffs(4, 116).addBox(-1.75F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-0.5F, -1.0F, 0.5F);
		bone6.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3054F);
		cube_r5.texOffs(8, 123).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.25F, 3.0F, 0.0F);
		bone6.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0446F, -0.0175F, -0.2578F);
		cube_r6.texOffs(3, 120).addBox(-0.75F, -2.0F, -0.75F, 1.5F, 6.0F, 1.5F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setPos(1.0F, 6.0F, 0.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.48F);
		bone7.texOffs(0, 116).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
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