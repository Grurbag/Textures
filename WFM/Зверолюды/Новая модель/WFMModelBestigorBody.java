// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBestigorBody extends EntityModel<Entity> {
	private final ModelRenderer bodyArmour;
	private final ModelRenderer bodyArmour2;
	private final ModelRenderer puzo;
	private final ModelRenderer puzo_r1;
	private final ModelRenderer spike;
	private final ModelRenderer leftArmArmour;
	private final ModelRenderer leftArmArmour2;
	private final ModelRenderer shoulderLeft;
	private final ModelRenderer rightArmArmour;
	private final ModelRenderer rightArmArmour2;
	private final ModelRenderer shoulderRight;

	public WFMModelBestigorBody() {
		texWidth = 64;
		texHeight = 64;

		bodyArmour = new ModelRenderer(this);
		bodyArmour.setPos(0.0F, -3.1982F, 0.5F);
		bodyArmour.texOffs(30, 51).addBox(-5.0F, 0.1982F, -3.5F, 10.0F, 6.0F, 7.0F, 0.5F, false);

		bodyArmour2 = new ModelRenderer(this);
		bodyArmour2.setPos(0.0F, 9.1982F, 0.0F);
		bodyArmour.addChild(bodyArmour2);
		bodyArmour2.texOffs(12, 39).addBox(-4.0F, -3.0F, -2.5F, 8.0F, 6.0F, 5.0F, 0.5F, false);

		puzo = new ModelRenderer(this);
		puzo.setPos(0.0F, -2.0F, 0.0F);
		bodyArmour.addChild(puzo);
		

		puzo_r1 = new ModelRenderer(this);
		puzo_r1.setPos(0.0F, 11.9053F, -3.5F);
		puzo.addChild(puzo_r1);
		setRotationAngle(puzo_r1, 0.0F, 0.0F, 0.7854F);
		puzo_r1.texOffs(0, 0).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		spike = new ModelRenderer(this);
		spike.setPos(0.0F, 0.0F, 0.0F);
		puzo.addChild(spike);
		spike.texOffs(0, 4).addBox(0.0F, 8.1982F, -9.5F, 0.0F, 7.0F, 5.0F, 0.0F, false);

		leftArmArmour = new ModelRenderer(this);
		leftArmArmour.setPos(4.5F, -1.5F, 0.5F);
		leftArmArmour.texOffs(29, 16).addBox(0.5F, -1.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.5F, false);

		leftArmArmour2 = new ModelRenderer(this);
		leftArmArmour2.setPos(24.5F, 22.5F, -0.5F);
		leftArmArmour.addChild(leftArmArmour2);
		leftArmArmour2.texOffs(30, 26).addBox(-24.0F, -19.0F, -1.5F, 4.0F, 9.0F, 4.0F, 0.5F, false);
		leftArmArmour2.texOffs(46, 30).addBox(-20.0F, -19.0F, 0.5F, 4.0F, 9.0F, 0.0F, 0.0F, false);

		shoulderLeft = new ModelRenderer(this);
		shoulderLeft.setPos(3.0F, 0.0F, 0.0F);
		leftArmArmour.addChild(shoulderLeft);
		setRotationAngle(shoulderLeft, -3.1416F, 0.0F, -2.7053F);
		shoulderLeft.texOffs(40, 0).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.01F, false);
		shoulderLeft.texOffs(40, 10).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.21F, false);
		shoulderLeft.texOffs(22, 0).addBox(-3.0F, -8.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);

		rightArmArmour = new ModelRenderer(this);
		rightArmArmour.setPos(-4.5F, -1.5F, 0.5F);
		rightArmArmour.texOffs(29, 16).addBox(-3.5F, -1.5F, -2.5F, 3.0F, 5.0F, 5.0F, 0.5F, true);

		rightArmArmour2 = new ModelRenderer(this);
		rightArmArmour2.setPos(19.5F, 22.5F, -0.5F);
		rightArmArmour.addChild(rightArmArmour2);
		rightArmArmour2.texOffs(30, 26).addBox(-24.0F, -19.0F, -1.5F, 4.0F, 9.0F, 4.0F, 0.5F, true);
		rightArmArmour2.texOffs(46, 30).addBox(-28.0F, -19.0F, 0.5F, 4.0F, 9.0F, 0.0F, 0.0F, true);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(-3.0F, 0.0F, 0.0F);
		rightArmArmour.addChild(shoulderRight);
		setRotationAngle(shoulderRight, 0.0F, 0.0F, -0.4363F);
		shoulderRight.texOffs(40, 0).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.01F, false);
		shoulderRight.texOffs(40, 10).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.21F, false);
		shoulderRight.texOffs(22, 0).addBox(-3.0F, -8.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bodyArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArmArmour.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}