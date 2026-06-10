// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelMorrKnightHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer feather_r1;
	private final ModelRenderer feather_r2;
	private final ModelRenderer feather_r3;
	private final ModelRenderer feather_r4;
	private final ModelRenderer head_r1;
	private final ModelRenderer Head_r2;

	public WFMModelMorrKnightHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(0, 24).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);
		Head.texOffs(44, 54).addBox(-2.5F, -13.5F, -6.0F, 5.0F, 5.0F, 5.0F, -0.8F, false);
		Head.texOffs(36, 20).addBox(0.0F, -22.0F, -3.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r1 = new ModelRenderer(this);
		feather_r1.setPos(0.0F, -7.0F, -3.0F);
		Head.addChild(feather_r1);
		setRotationAngle(feather_r1, 0.0F, 0.5672F, 0.0F);
		feather_r1.texOffs(0, 39).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r2 = new ModelRenderer(this);
		feather_r2.setPos(0.0F, -10.0F, -3.0F);
		Head.addChild(feather_r2);
		setRotationAngle(feather_r2, 0.0F, 0.3054F, 0.0F);
		feather_r2.texOffs(0, 39).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r3 = new ModelRenderer(this);
		feather_r3.setPos(0.0F, -10.0F, -3.0F);
		Head.addChild(feather_r3);
		setRotationAngle(feather_r3, 0.0F, -0.3491F, 0.0F);
		feather_r3.texOffs(0, 39).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		feather_r4 = new ModelRenderer(this);
		feather_r4.setPos(0.0F, -8.0F, -3.0F);
		Head.addChild(feather_r4);
		setRotationAngle(feather_r4, 0.0F, -0.6109F, 0.0F);
		feather_r4.texOffs(36, 20).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 14.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.texOffs(0, 17).addBox(-2.5F, -2.6721F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, -3.0F, -2.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.7854F, 0.0F);
		Head_r2.texOffs(0, 34).addBox(-4.0F, -4.1F, -4.0F, 8.0F, 9.0F, 8.0F, -0.3F, false);
		Head_r2.texOffs(32, 16).addBox(-4.0F, -4.1F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}