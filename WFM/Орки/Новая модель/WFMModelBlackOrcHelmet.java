// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBlackOrcHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer nose_r1;
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
	private final ModelRenderer jawHelmet;
	private final ModelRenderer teeth_r1;
	private final ModelRenderer teeth_r2;
	private final ModelRenderer teeth_r3;
	private final ModelRenderer teeth_r4;
	private final ModelRenderer teeth_r5;
	private final ModelRenderer teeth_r6;
	private final ModelRenderer teeth_r7;
	private final ModelRenderer teeth_r8;

	public WFMModelBlackOrcHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(1.0F, -3.0F, -4.0F);
		head.texOffs(32, 0).addBox(-5.0F, -6.0F, -7.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(0, 0).addBox(-5.0F, -6.0F, -7.0F, 8.0F, 9.0F, 8.0F, 0.55F, false);
		head.texOffs(0, 36).addBox(-5.0F, -8.0F, -7.0F, 8.0F, 2.0F, 8.0F, 0.2F, false);

		nose_r1 = new ModelRenderer(this);
		nose_r1.setPos(-0.5F, -4.0F, -7.0F);
		head.addChild(nose_r1);
		setRotationAngle(nose_r1, 0.0F, 0.7854F, 0.0F);
		nose_r1.texOffs(26, 47).addBox(-3.5F, -2.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);
		nose_r1.texOffs(0, 47).addBox(-3.5F, -2.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.2F, false);

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

		jawHelmet = new ModelRenderer(this);
		jawHelmet.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(jawHelmet);
		setRotationAngle(jawHelmet, 0.1745F, 0.0F, 0.0F);
		jawHelmet.texOffs(28, 21).addBox(-6.5F, -1.0F, -11.0F, 11.0F, 7.0F, 7.0F, 0.0F, false);
		jawHelmet.texOffs(50, 0).addBox(-2.5F, -3.0F, -11.2F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		jawHelmet.texOffs(25, 0).addBox(-2.5F, 4.0F, -11.1F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r1 = new ModelRenderer(this);
		teeth_r1.setPos(4.5F, 6.0F, -7.6F);
		jawHelmet.addChild(teeth_r1);
		setRotationAngle(teeth_r1, 0.0F, 1.6144F, 0.0F);
		teeth_r1.texOffs(25, 0).addBox(-2.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r2 = new ModelRenderer(this);
		teeth_r2.setPos(-6.4564F, 6.0F, -6.601F);
		jawHelmet.addChild(teeth_r2);
		setRotationAngle(teeth_r2, 0.0F, 1.1345F, 0.0F);
		teeth_r2.texOffs(25, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r3 = new ModelRenderer(this);
		teeth_r3.setPos(-6.5F, -1.0F, -7.1F);
		jawHelmet.addChild(teeth_r3);
		setRotationAngle(teeth_r3, 0.0F, 1.2217F, 0.0F);
		teeth_r3.texOffs(0, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r4 = new ModelRenderer(this);
		teeth_r4.setPos(3.2929F, -1.0F, -9.4929F);
		jawHelmet.addChild(teeth_r4);
		setRotationAngle(teeth_r4, 0.0F, 0.7854F, 0.0F);
		teeth_r4.texOffs(50, 0).addBox(-7.1569F, 5.0F, -5.6569F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		teeth_r4.texOffs(50, 0).addBox(-7.1569F, -2.0F, -5.6569F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r5 = new ModelRenderer(this);
		teeth_r5.setPos(4.0F, 0.0F, -10.2F);
		jawHelmet.addChild(teeth_r5);
		setRotationAngle(teeth_r5, 0.0F, -0.7854F, 0.0F);
		teeth_r5.texOffs(50, 0).addBox(-1.5F, 4.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);
		teeth_r5.texOffs(50, 0).addBox(-1.5F, -3.0F, 1.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r6 = new ModelRenderer(this);
		teeth_r6.setPos(-3.5F, 0.0F, -11.1F);
		jawHelmet.addChild(teeth_r6);
		setRotationAngle(teeth_r6, 0.0F, 0.1745F, 0.0F);
		teeth_r6.texOffs(0, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r7 = new ModelRenderer(this);
		teeth_r7.setPos(3.1314F, -1.0F, -6.4243F);
		jawHelmet.addChild(teeth_r7);
		setRotationAngle(teeth_r7, 0.0F, -1.3963F, 0.0F);
		teeth_r7.texOffs(0, 0).addBox(-1.5617F, -2.0F, -1.4129F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		teeth_r8 = new ModelRenderer(this);
		teeth_r8.setPos(1.5F, 0.0F, -11.1F);
		jawHelmet.addChild(teeth_r8);
		setRotationAngle(teeth_r8, 0.0F, -0.1745F, 0.0F);
		teeth_r8.texOffs(0, 0).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);
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