// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBullCentaur extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer brov_r1;
	private final ModelRenderer brov_r2;
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
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer handRight;
	private final ModelRenderer handRight2;
	private final ModelRenderer handLeft;
	private final ModelRenderer handLeft2;
	private final ModelRenderer leftLegFront;
	private final ModelRenderer leftLegBack;
	private final ModelRenderer rightLegFront;
	private final ModelRenderer rightLegFront2;

	public WFMModelBullCentaur() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, -16.0F, -7.0F);
		head.texOffs(88, 35).addBox(-5.0F, -9.0F, -6.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		head.texOffs(88, 55).addBox(-5.0F, -9.0F, -6.0F, 10.0F, 23.0F, 10.0F, 0.3F, false);

		brov_r1 = new ModelRenderer(this);
		brov_r1.setPos(-1.0F, -4.0F, -7.0F);
		head.addChild(brov_r1);
		setRotationAngle(brov_r1, 0.0F, 0.0F, 0.1309F);
		brov_r1.texOffs(82, 53).addBox(-3.0F, -1.5F, 0.69F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		brov_r2 = new ModelRenderer(this);
		brov_r2.setPos(1.0F, -4.0F, -7.0F);
		head.addChild(brov_r2);
		setRotationAngle(brov_r2, 0.0F, 0.0F, -0.1309F);
		brov_r2.texOffs(82, 54).addBox(0.0F, -1.5F, 0.69F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		hornLeft = new ModelRenderer(this);
		hornLeft.setPos(5.0F, -6.5F, -1.5F);
		head.addChild(hornLeft);
		setRotationAngle(hornLeft, 1.0472F, 0.0F, 0.0F);
		hornLeft.texOffs(0, 49).addBox(0.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		hornLeft2 = new ModelRenderer(this);
		hornLeft2.setPos(2.0F, 0.0F, 0.0F);
		hornLeft.addChild(hornLeft2);
		setRotationAngle(hornLeft2, 0.0F, 0.0F, -0.5672F);
		hornLeft2.texOffs(0, 58).addBox(0.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		hornLeft3 = new ModelRenderer(this);
		hornLeft3.setPos(3.0F, 0.0F, 0.0F);
		hornLeft2.addChild(hornLeft3);
		setRotationAngle(hornLeft3, 0.0F, 0.0F, -0.6981F);
		hornLeft3.texOffs(0, 63).addBox(0.0F, -0.5F, -1.0F, 4.0F, 2.0F, 2.0F, -0.1F, false);

		hornLeft4 = new ModelRenderer(this);
		hornLeft4.setPos(3.0F, 0.0F, 0.0F);
		hornLeft3.addChild(hornLeft4);
		setRotationAngle(hornLeft4, 0.0F, 0.0F, -0.4363F);
		hornLeft4.texOffs(0, 70).addBox(0.0F, -0.5F, -1.0F, 4.0F, 2.0F, 2.0F, -0.3F, false);

		hornLeft5 = new ModelRenderer(this);
		hornLeft5.setPos(1.0F, 0.0F, -1.0F);
		hornLeft4.addChild(hornLeft5);
		hornLeft5.texOffs(0, 74).addBox(2.0F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, -0.2F, false);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(-5.0F, -6.5F, -1.5F);
		head.addChild(hornRight);
		setRotationAngle(hornRight, 2.0944F, 0.0F, 3.1416F);
		hornRight.texOffs(0, 49).addBox(0.0F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		hornRight2 = new ModelRenderer(this);
		hornRight2.setPos(2.0F, 0.0F, 0.0F);
		hornRight.addChild(hornRight2);
		setRotationAngle(hornRight2, 0.0F, 0.0F, -0.5672F);
		hornRight2.texOffs(0, 58).addBox(0.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		hornRight3 = new ModelRenderer(this);
		hornRight3.setPos(3.0F, 0.0F, 0.0F);
		hornRight2.addChild(hornRight3);
		setRotationAngle(hornRight3, 0.0F, 0.0F, -0.6981F);
		hornRight3.texOffs(0, 63).addBox(0.0F, -0.5F, -1.0F, 4.0F, 2.0F, 2.0F, -0.1F, false);

		hornRight4 = new ModelRenderer(this);
		hornRight4.setPos(3.0F, 0.0F, 0.0F);
		hornRight3.addChild(hornRight4);
		setRotationAngle(hornRight4, 0.0F, 0.0F, -0.4363F);
		hornRight4.texOffs(0, 70).addBox(0.0F, -0.5F, -1.0F, 4.0F, 2.0F, 2.0F, -0.3F, false);

		hornRight5 = new ModelRenderer(this);
		hornRight5.setPos(1.0F, 0.0F, -1.0F);
		hornRight4.addChild(hornRight5);
		hornRight5.texOffs(0, 74).addBox(2.0F, 0.0F, 0.5F, 2.0F, 1.0F, 1.0F, -0.2F, false);

		body = new ModelRenderer(this);
		body.setPos(-0.5F, 2.5F, 7.5F);
		body.texOffs(0, 0).addBox(-8.0F, -5.5F, -15.5F, 17.0F, 13.0F, 31.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, -11.0F, -2.0F);
		body.addChild(body2);
		body2.texOffs(0, 99).addBox(-7.0F, -7.5F, -15.5F, 15.0F, 21.0F, 8.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.5F, -1.0F, 16.0F);
		body.addChild(tail);
		tail.texOffs(120, 115).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setPos(2.5F, 3.0F, -1.0F);
		tail.addChild(tail2);
		tail2.texOffs(116, 105).addBox(-4.0F, 7.0F, -0.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		handRight = new ModelRenderer(this);
		handRight.setPos(-8.0F, -13.0F, -6.0F);
		handRight.texOffs(51, 103).addBox(-5.0F, -2.0F, -3.0F, 6.0F, 19.0F, 6.0F, 0.0F, true);

		handRight2 = new ModelRenderer(this);
		handRight2.setPos(-1.0F, 7.0F, 1.0F);
		handRight.addChild(handRight2);
		handRight2.texOffs(4, 2).addBox(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		handLeft = new ModelRenderer(this);
		handLeft.setPos(8.0F, -13.0F, -5.0F);
		handLeft.texOffs(51, 103).addBox(-1.0F, -2.0F, -4.0F, 6.0F, 19.0F, 6.0F, 0.0F, false);

		handLeft2 = new ModelRenderer(this);
		handLeft2.setPos(2.0F, 7.0F, 0.0F);
		handLeft.addChild(handLeft2);
		handLeft2.texOffs(4, 2).addBox(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		leftLegFront = new ModelRenderer(this);
		leftLegFront.setPos(7.0F, 8.0F, -3.5F);
		leftLegFront.texOffs(102, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, false);

		leftLegBack = new ModelRenderer(this);
		leftLegBack.setPos(7.0F, 8.0F, 18.5F);
		leftLegBack.texOffs(72, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, false);

		rightLegFront = new ModelRenderer(this);
		rightLegFront.setPos(-5.0F, 8.0F, -3.5F);
		rightLegFront.texOffs(102, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, true);

		rightLegFront2 = new ModelRenderer(this);
		rightLegFront2.setPos(-5.0F, 8.0F, 18.5F);
		rightLegFront2.texOffs(72, 0).addBox(-4.0F, -2.0F, -3.5F, 6.0F, 18.0F, 7.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		handRight.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		handLeft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegFront.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegBack.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegFront.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegFront2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}