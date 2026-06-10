// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelPhoenixGuardHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer wing_r1;
	private final ModelRenderer wing_r2;
	private final ModelRenderer helmet4_r1;

	public WFMModelPhoenixGuardHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -2.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 10.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 18).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		Head.texOffs(56, 61).addBox(-1.5F, -12.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.1F, false);
		Head.texOffs(56, 57).addBox(-1.5F, -14.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.1F, false);
		Head.texOffs(56, 55).addBox(-1.5F, -15.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.1F, false);
		Head.texOffs(35, 28).addBox(-3.0F, -14.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Head.texOffs(39, 36).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Head.texOffs(41, 41).addBox(-1.0F, -16.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Head.texOffs(43, 45).addBox(-0.5F, -19.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		Head.texOffs(0, 51).addBox(-3.5F, -9.0F, -5.2F, 7.0F, 13.0F, 0.0F, 0.0F, false);

		wing_r1 = new ModelRenderer(this);
		wing_r1.setPos(-3.5F, -8.0F, -5.2F);
		Head.addChild(wing_r1);
		setRotationAngle(wing_r1, 0.0F, -2.5744F, 0.0F);
		wing_r1.texOffs(0, 26).addBox(0.0F, -14.0F, 0.0F, 12.0F, 22.0F, 0.0F, 0.0F, false);

		wing_r2 = new ModelRenderer(this);
		wing_r2.setPos(3.5F, -8.0F, -5.2F);
		Head.addChild(wing_r2);
		setRotationAngle(wing_r2, 0.0F, -0.5672F, 0.0F);
		wing_r2.texOffs(0, 26).addBox(0.0F, -14.0F, 0.0F, 12.0F, 22.0F, 0.0F, 0.0F, false);

		helmet4_r1 = new ModelRenderer(this);
		helmet4_r1.setPos(-1.0F, -18.0F, 1.0F);
		Head.addChild(helmet4_r1);
		setRotationAngle(helmet4_r1, -0.2618F, 0.0F, 0.0F);
		helmet4_r1.texOffs(43, 55).addBox(0.5F, -2.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		helmet4_r1.texOffs(42, 50).addBox(0.0F, -2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
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