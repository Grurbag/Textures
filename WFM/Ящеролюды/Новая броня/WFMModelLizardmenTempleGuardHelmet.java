// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelLizardmenTempleGuardHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer shokaLeft;
	private final ModelRenderer shokaRight;
	private final ModelRenderer hornLeft;
	private final ModelRenderer hornLeft2;
	private final ModelRenderer hornLeft3;
	private final ModelRenderer hornLeft4;
	private final ModelRenderer hornLeft5;
	private final ModelRenderer hornRight;
	private final ModelRenderer hornRight2;
	private final ModelRenderer hornRight3;
	private final ModelRenderer hornRight4;
	private final ModelRenderer hornRight5;

	public WFMModelLizardmenTempleGuardHelmet() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -5.25F, -4.0F);
		head.texOffs(0, 14).addBox(-3.5F, -10.0F, -12.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);
		head.texOffs(0, 44).addBox(-3.5F, -10.0F, -12.0F, 7.0F, 5.0F, 6.0F, -0.3F, false);
		head.texOffs(26, 13).addBox(-3.0F, -6.0F, -11.5F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		head.texOffs(0, 0).addBox(-5.0F, -11.0F, -6.1F, 10.0F, 6.0F, 8.0F, 0.0F, false);
		head.texOffs(0, 55).addBox(-5.0F, -11.0F, -6.0F, 10.0F, 6.0F, 8.0F, -0.3F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -7.5F, 6.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.9553F, 0.5236F, 0.6155F);
		cube_r1.texOffs(0, 27).addBox(-6.0F, -4.5F, -8.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -7.5F, -13.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.texOffs(0, 25).addBox(-2.0F, -0.5F, -1.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		shokaLeft = new ModelRenderer(this);
		shokaLeft.setPos(4.0F, -3.0F, -1.0F);
		head.addChild(shokaLeft);
		shokaLeft.texOffs(62, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);
		shokaLeft.texOffs(55, -3).addBox(0.0F, -2.0F, -4.0F, 0.0F, 7.0F, 3.0F, 0.0F, true);

		shokaRight = new ModelRenderer(this);
		shokaRight.setPos(-4.0F, -3.0F, -1.0F);
		head.addChild(shokaRight);
		shokaRight.texOffs(62, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		shokaRight.texOffs(55, -3).addBox(0.0F, -2.0F, -4.0F, 0.0F, 7.0F, 3.0F, 0.0F, false);

		hornLeft = new ModelRenderer(this);
		hornLeft.setPos(2.7929F, -9.0F, 0.0F);
		head.addChild(hornLeft);
		setRotationAngle(hornLeft, 1.2036F, -0.7744F, -0.1988F);
		hornLeft.texOffs(116, 0).addBox(-1.5F, -6.5F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);

		hornLeft2 = new ModelRenderer(this);
		hornLeft2.setPos(0.0F, -5.0F, -0.5F);
		hornLeft.addChild(hornLeft2);
		hornLeft2.texOffs(118, 9).addBox(-1.25F, -4.5F, -1.5F, 2.5F, 4.0F, 3.0F, 0.0F, true);

		hornLeft3 = new ModelRenderer(this);
		hornLeft3.setPos(0.0F, -4.0F, 0.0F);
		hornLeft2.addChild(hornLeft3);
		hornLeft3.texOffs(119, 16).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.5F, 0.0F, true);

		hornLeft4 = new ModelRenderer(this);
		hornLeft4.setPos(0.0F, -3.25F, 1.125F);
		hornLeft3.addChild(hornLeft4);
		setRotationAngle(hornLeft4, -0.2618F, 0.0F, 0.0F);
		hornLeft4.texOffs(122, 22).addBox(-0.75F, -2.25F, -0.875F, 1.5F, 3.0F, 1.5F, 0.0F, true);

		hornLeft5 = new ModelRenderer(this);
		hornLeft5.setPos(0.0F, -3.25F, 0.125F);
		hornLeft4.addChild(hornLeft5);
		hornLeft5.texOffs(122, 26).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(-2.7929F, -9.0F, 0.0F);
		head.addChild(hornRight);
		setRotationAngle(hornRight, 1.2036F, 0.7744F, 0.1988F);
		hornRight.texOffs(116, 0).addBox(-1.5F, -6.5F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		hornRight2 = new ModelRenderer(this);
		hornRight2.setPos(0.0F, -5.0F, -0.5F);
		hornRight.addChild(hornRight2);
		hornRight2.texOffs(117, 9).addBox(-1.25F, -4.5F, -1.5F, 2.5F, 4.0F, 3.0F, 0.0F, false);

		hornRight3 = new ModelRenderer(this);
		hornRight3.setPos(0.0F, -4.0F, 0.0F);
		hornRight2.addChild(hornRight3);
		hornRight3.texOffs(119, 16).addBox(-1.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.5F, 0.0F, false);

		hornRight4 = new ModelRenderer(this);
		hornRight4.setPos(0.0F, -3.25F, 1.125F);
		hornRight3.addChild(hornRight4);
		setRotationAngle(hornRight4, -0.2618F, 0.0F, 0.0F);
		hornRight4.texOffs(122, 22).addBox(-0.75F, -2.25F, -0.875F, 1.5F, 3.0F, 1.5F, 0.0F, false);

		hornRight5 = new ModelRenderer(this);
		hornRight5.setPos(0.0F, -3.25F, 0.125F);
		hornRight4.addChild(hornRight5);
		hornRight5.texOffs(122, 26).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
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