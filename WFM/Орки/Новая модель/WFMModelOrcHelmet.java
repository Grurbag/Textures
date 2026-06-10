// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOrcHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer hornRight;
	private final ModelRenderer hornLeft_r1;
	private final ModelRenderer hornLeft_r2;
	private final ModelRenderer hornLeft_r3;
	private final ModelRenderer hornLeft_r4;
	private final ModelRenderer hornLeft_r5;
	private final ModelRenderer hornLeft;
	private final ModelRenderer hornLeft_r6;
	private final ModelRenderer hornLeft_r7;
	private final ModelRenderer hornLeft_r8;
	private final ModelRenderer hornLeft_r9;
	private final ModelRenderer hornLeft_r10;

	public WFMModelOrcHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(1.0F, -3.0F, -4.0F);
		head.texOffs(32, 0).addBox(-5.0F, -6.0F, -7.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(0, 0).addBox(-5.0F, -6.0F, -7.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);
		head.texOffs(0, 36).addBox(-5.0F, -8.0F, -7.0F, 8.0F, 2.0F, 8.0F, 0.2F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(-1.0F, -6.3279F, 4.9924F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 22).addBox(-2.5F, -2.85F, -10.5F, 5.0F, 2.0F, 5.0F, 0.2F, false);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(-7.0F, -3.0F, -4.0F);
		head.addChild(hornRight);
		setRotationAngle(hornRight, 0.0F, 3.1416F, 0.0F);
		hornRight.texOffs(53, 58).addBox(-2.0F, -2.0F, -2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		hornRight.texOffs(22, 53).addBox(0.0F, -10.0F, -1.0F, 11.0F, 11.0F, 0.0F, 0.0F, false);

		hornLeft_r1 = new ModelRenderer(this);
		hornLeft_r1.setPos(0.0F, -7.0F, 0.0F);
		hornRight.addChild(hornLeft_r1);
		setRotationAngle(hornLeft_r1, 0.0F, 0.0F, -1.8762F);
		hornLeft_r1.texOffs(57, 37).addBox(-1.0F, 5.0F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		hornLeft_r2 = new ModelRenderer(this);
		hornLeft_r2.setPos(0.0F, -7.0F, 0.0F);
		hornRight.addChild(hornLeft_r2);
		setRotationAngle(hornLeft_r2, 0.0F, 0.0F, -1.5708F);
		hornLeft_r2.texOffs(54, 41).addBox(-2.0F, 5.0F, -2.01F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		hornLeft_r3 = new ModelRenderer(this);
		hornLeft_r3.setPos(0.0F, -7.0F, 0.0F);
		hornRight.addChild(hornLeft_r3);
		setRotationAngle(hornLeft_r3, 0.0F, 0.0F, -1.1345F);
		hornLeft_r3.texOffs(54, 45).addBox(-2.0F, 5.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		hornLeft_r4 = new ModelRenderer(this);
		hornLeft_r4.setPos(0.0F, -7.0F, 0.0F);
		hornRight.addChild(hornLeft_r4);
		setRotationAngle(hornLeft_r4, 0.0F, 0.0F, -0.6981F);
		hornLeft_r4.texOffs(54, 49).addBox(-2.0F, 5.0F, -2.01F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		hornLeft_r5 = new ModelRenderer(this);
		hornLeft_r5.setPos(0.0F, -7.0F, 0.0F);
		hornRight.addChild(hornLeft_r5);
		setRotationAngle(hornLeft_r5, 0.0F, 0.0F, -0.3491F);
		hornLeft_r5.texOffs(54, 53).addBox(-2.0F, 5.0F, -2.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		hornLeft = new ModelRenderer(this);
		hornLeft.setPos(5.0F, -3.0F, -3.0F);
		head.addChild(hornLeft);
		hornLeft.texOffs(53, 58).addBox(-2.0F, -2.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		hornLeft.texOffs(22, 53).addBox(0.0F, -10.0F, 0.0F, 11.0F, 11.0F, 0.0F, 0.0F, false);

		hornLeft_r6 = new ModelRenderer(this);
		hornLeft_r6.setPos(0.0F, -7.0F, 1.0F);
		hornLeft.addChild(hornLeft_r6);
		setRotationAngle(hornLeft_r6, 0.0F, 0.0F, -1.8762F);
		hornLeft_r6.texOffs(57, 37).addBox(-1.0F, 5.0F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		hornLeft_r7 = new ModelRenderer(this);
		hornLeft_r7.setPos(0.0F, -7.0F, 1.0F);
		hornLeft.addChild(hornLeft_r7);
		setRotationAngle(hornLeft_r7, 0.0F, 0.0F, -1.5708F);
		hornLeft_r7.texOffs(54, 41).addBox(-2.0F, 5.0F, -2.01F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		hornLeft_r8 = new ModelRenderer(this);
		hornLeft_r8.setPos(0.0F, -7.0F, 1.0F);
		hornLeft.addChild(hornLeft_r8);
		setRotationAngle(hornLeft_r8, 0.0F, 0.0F, -1.1345F);
		hornLeft_r8.texOffs(54, 45).addBox(-2.0F, 5.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		hornLeft_r9 = new ModelRenderer(this);
		hornLeft_r9.setPos(0.0F, -7.0F, 1.0F);
		hornLeft.addChild(hornLeft_r9);
		setRotationAngle(hornLeft_r9, 0.0F, 0.0F, -0.6981F);
		hornLeft_r9.texOffs(54, 49).addBox(-2.0F, 5.0F, -2.01F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		hornLeft_r10 = new ModelRenderer(this);
		hornLeft_r10.setPos(0.0F, -7.0F, 1.0F);
		hornLeft.addChild(hornLeft_r10);
		setRotationAngle(hornLeft_r10, 0.0F, 0.0F, -0.3491F);
		hornLeft_r10.texOffs(54, 53).addBox(-2.0F, 5.0F, -2.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
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