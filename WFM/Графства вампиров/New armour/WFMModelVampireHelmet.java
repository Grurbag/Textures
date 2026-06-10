// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelVampireHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer horn;
	private final ModelRenderer horn_r1;
	private final ModelRenderer horn_r2;
	private final ModelRenderer hornLeft;
	private final ModelRenderer hornLeft2;

	public WFMModelVampireHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 22).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		horn = new ModelRenderer(this);
		horn.setPos(0.0F, -6.0F, -5.0F);
		head.addChild(horn);
		

		horn_r1 = new ModelRenderer(this);
		horn_r1.setPos(0.0F, 1.0F, -1.0F);
		horn.addChild(horn_r1);
		setRotationAngle(horn_r1, 0.0F, 0.1745F, 0.0F);
		horn_r1.texOffs(0, 44).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 9.0F, 0.0F, false);

		horn_r2 = new ModelRenderer(this);
		horn_r2.setPos(0.0F, 1.0F, -1.0F);
		horn.addChild(horn_r2);
		setRotationAngle(horn_r2, 0.0F, -0.1745F, 0.0F);
		horn_r2.texOffs(0, 44).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 9.0F, 0.0F, false);

		hornLeft = new ModelRenderer(this);
		hornLeft.setPos(4.0F, -5.0F, -3.0F);
		head.addChild(hornLeft);
		setRotationAngle(hornLeft, 0.0F, 0.2182F, 0.0F);
		hornLeft.texOffs(19, 44).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 9.0F, 0.0F, true);

		hornLeft2 = new ModelRenderer(this);
		hornLeft2.setPos(-4.0F, -5.0F, -3.0F);
		head.addChild(hornLeft2);
		setRotationAngle(hornLeft2, 0.0F, -0.2182F, 0.0F);
		hornLeft2.texOffs(19, 44).addBox(0.0F, -11.0F, 0.0F, 0.0F, 11.0F, 9.0F, 0.0F, true);
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