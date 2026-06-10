// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDemigryphKnightHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer nose;
	private final ModelRenderer nose2;
	private final ModelRenderer wing3;
	private final ModelRenderer wing2;
	private final ModelRenderer wing;

	public WFMModelDemigryphKnightHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 24).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);
		head.texOffs(44, 54).addBox(-2.5F, -14.5F, -5.0F, 5.0F, 5.0F, 5.0F, -0.5F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.3279F, 0.9924F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 17).addBox(-2.5F, -2.6721F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, -3.0F, -2.0F);
		head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.7854F, 0.0F);
		Head_r2.texOffs(0, 34).addBox(-4.0F, -4.1F, -4.0F, 8.0F, 9.0F, 8.0F, -0.3F, false);
		Head_r2.texOffs(32, 16).addBox(-4.0F, -4.1F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, -2.0F, -5.0F);
		head.addChild(nose);
		setRotationAngle(nose, 0.0873F, 0.0F, 0.0F);
		nose.texOffs(0, 51).addBox(-2.5F, -1.0F, -4.0F, 5.0F, 3.0F, 4.0F, 0.0F, false);

		nose2 = new ModelRenderer(this);
		nose2.setPos(0.0F, 0.0F, -3.0F);
		nose.addChild(nose2);
		setRotationAngle(nose2, 0.4363F, 0.0F, 0.0F);
		nose2.texOffs(2, 58).addBox(-1.5F, -1.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		nose2.texOffs(14, 61).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		nose2.texOffs(14, 59).addBox(-0.5F, 1.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wing3 = new ModelRenderer(this);
		wing3.setPos(0.0F, -10.0F, -7.0F);
		head.addChild(wing3);
		setRotationAngle(wing3, -1.5708F, -1.1345F, 1.5708F);
		wing3.texOffs(40, 33).addBox(0.0F, -19.0F, 0.0F, 12.0F, 21.0F, 0.0F, 0.0F, false);

		wing2 = new ModelRenderer(this);
		wing2.setPos(-1.0F, -10.0F, -3.0F);
		head.addChild(wing2);
		setRotationAngle(wing2, 0.0F, 0.6981F, 0.0F);
		wing2.texOffs(40, 33).addBox(-12.0F, -19.0F, 0.0F, 12.0F, 21.0F, 0.0F, 0.0F, true);

		wing = new ModelRenderer(this);
		wing.setPos(1.0F, -10.0F, -3.0F);
		head.addChild(wing);
		setRotationAngle(wing, 0.0F, -0.6981F, 0.0F);
		wing.texOffs(40, 33).addBox(0.0F, -19.0F, 0.0F, 12.0F, 21.0F, 0.0F, 0.0F, false);
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