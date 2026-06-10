// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelPlagueBearer extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer bubongovna;
	private final ModelRenderer head;
	private final ModelRenderer jaw;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer horn3;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer clawLeft;
	private final ModelRenderer clawLeft2;
	private final ModelRenderer clawLeft3;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer clawLeft4;
	private final ModelRenderer clawLeft5;
	private final ModelRenderer clawLeft6;

	public WFMModelPlagueBearer() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(1.0F, 13.0F, -2.0F);
		body.texOffs(1, 0).addBox(-6.0F, -10.0F, -3.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, -4.0F, 0.0F);
		body.addChild(body2);
		body2.texOffs(1, 23).addBox(-6.0F, -13.0F, 0.0F, 10.0F, 7.0F, 7.0F, 0.0F, false);

		bubongovna = new ModelRenderer(this);
		bubongovna.setPos(0.0F, -4.0F, -3.0F);
		body.addChild(bubongovna);
		bubongovna.texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bubongovna.texOffs(0, 0).addBox(-4.0F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bubongovna.texOffs(0, 0).addBox(-4.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bubongovna.texOffs(0, 0).addBox(-3.0F, -2.0F, 9.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -4.0F, 0.0F);
		head.texOffs(96, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(77, 17).addBox(-4.0F, -8.5F, -5.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
		head.texOffs(0, 0).addBox(1.0F, -9.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.texOffs(0, 0).addBox(-5.0F, -6.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		jaw = new ModelRenderer(this);
		jaw.setPos(-1.0F, 1.0F, -5.0F);
		head.addChild(jaw);
		jaw.texOffs(65, 0).addBox(-2.5F, -3.0F, -1.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		jaw.texOffs(47, 0).addBox(-2.5F, -1.0F, -1.0F, 7.0F, 0.0F, 4.0F, 0.0F, false);

		horn = new ModelRenderer(this);
		horn.setPos(-1.5F, -8.0F, -2.5F);
		head.addChild(horn);
		setRotationAngle(horn, 0.0F, 0.0F, -0.3491F);
		horn.texOffs(56, 7).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		horn2 = new ModelRenderer(this);
		horn2.setPos(0.0F, -2.0F, 0.0F);
		horn.addChild(horn2);
		horn2.texOffs(65, 14).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		horn3 = new ModelRenderer(this);
		horn3.setPos(0.0F, -2.0F, -1.0F);
		horn2.addChild(horn3);
		horn3.texOffs(65, 24).addBox(-1.0F, -1.0F, 0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, -1.0F, 1.0F);
		leftArm.texOffs(0, 38).addBox(0.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, 0.0F, false);
		leftArm.texOffs(0, 0).addBox(1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, -1.0F, 1.0F);
		rightArm.texOffs(0, 38).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 15.0F, 4.0F, 0.0F, true);
		rightArm.texOffs(0, 0).addBox(-3.0F, 1.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, 6.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(2.0F, 13.0F, 1.0F);
		leftLeg.texOffs(104, 42).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);
		leftLeg.texOffs(0, 0).addBox(3.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(-1.0F, 5.0F, -1.0F);
		leftLeg.addChild(leftLeg2);
		leftLeg2.texOffs(111, 28).addBox(0.0F, -1.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		leftLeg2.texOffs(0, 0).addBox(3.0F, 1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 1.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		leftLeg3.texOffs(106, 18).addBox(0.0F, 3.0F, -2.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		clawLeft = new ModelRenderer(this);
		clawLeft.setPos(4.0F, 5.0F, 1.0F);
		leftLeg3.addChild(clawLeft);
		setRotationAngle(clawLeft, 0.0F, -1.0036F, 0.0F);
		clawLeft.texOffs(89, 50).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawLeft.texOffs(89, 45).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		clawLeft2 = new ModelRenderer(this);
		clawLeft2.setPos(4.0F, 5.0F, -2.0F);
		leftLeg3.addChild(clawLeft2);
		setRotationAngle(clawLeft2, 0.0F, -0.2618F, 0.0F);
		clawLeft2.texOffs(89, 50).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawLeft2.texOffs(89, 45).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		clawLeft3 = new ModelRenderer(this);
		clawLeft3.setPos(1.0F, 5.0F, -2.0F);
		leftLeg3.addChild(clawLeft3);
		clawLeft3.texOffs(89, 50).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		clawLeft3.texOffs(89, 45).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-4.0F, 13.0F, 1.0F);
		rightLeg.texOffs(104, 42).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, true);
		rightLeg.texOffs(0, 0).addBox(1.0F, 1.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(-1.0F, 5.0F, -1.0F);
		rightLeg.addChild(rightLeg2);
		rightLeg2.texOffs(111, 28).addBox(0.0F, -1.0F, -1.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
		rightLeg2.texOffs(0, 0).addBox(-1.0F, 1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(-1.0F, 1.0F, 0.0F);
		rightLeg2.addChild(rightLeg3);
		rightLeg3.texOffs(106, 18).addBox(0.0F, 3.0F, -2.0F, 5.0F, 2.0F, 5.0F, 0.0F, true);

		clawLeft4 = new ModelRenderer(this);
		clawLeft4.setPos(0.0F, 5.0F, 2.0F);
		rightLeg3.addChild(clawLeft4);
		setRotationAngle(clawLeft4, 0.0F, 0.9599F, 0.0F);
		clawLeft4.texOffs(89, 50).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawLeft4.texOffs(89, 45).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		clawLeft5 = new ModelRenderer(this);
		clawLeft5.setPos(3.0F, 5.0F, -2.0F);
		rightLeg3.addChild(clawLeft5);
		clawLeft5.texOffs(89, 50).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawLeft5.texOffs(89, 45).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		clawLeft6 = new ModelRenderer(this);
		clawLeft6.setPos(0.0F, 5.0F, -1.0F);
		rightLeg3.addChild(clawLeft6);
		setRotationAngle(clawLeft6, 0.0F, 0.2618F, 0.0F);
		clawLeft6.texOffs(89, 50).addBox(0.0F, -2.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		clawLeft6.texOffs(89, 45).addBox(0.0F, -1.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}