// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelEmpireGreatswordChestplate extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer pantalon_r1;
	private final ModelRenderer pantalon;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer pantalon_r2;
	private final ModelRenderer RightArm_r1;

	public WFMModelEmpireGreatswordChestplate() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		Body.texOffs(0, 59).addBox(-1.5F, 12.0F, -3.0F, 3.0F, 3.0F, 2.0F, 0.1F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		RightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		pantalon_r1 = new ModelRenderer(this);
		pantalon_r1.setPos(-1.9F, 7.5F, 0.0F);
		RightArm.addChild(pantalon_r1);
		setRotationAngle(pantalon_r1, 0.0131F, 0.0416F, 0.3057F);
		pantalon_r1.texOffs(40, 0).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		pantalon = new ModelRenderer(this);
		pantalon.setPos(0.0F, 0.0F, 0.0F);
		RightArm.addChild(pantalon);
		

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-1.2479F, -0.4674F, 0.0F);
		pantalon.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.1309F);
		LeftArm_r1.texOffs(16, 33).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);
		LeftArm_r1.texOffs(16, 44).addBox(-3.0F, -2.7326F, -3.0F, 6.0F, 5.0F, 6.0F, 0.5F, true);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		LeftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		pantalon_r2 = new ModelRenderer(this);
		pantalon_r2.setPos(2.1F, 7.5F, 0.0F);
		LeftArm.addChild(pantalon_r2);
		setRotationAngle(pantalon_r2, -0.0149F, 0.041F, -0.3494F);
		pantalon_r2.texOffs(40, 0).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.1309F);
		RightArm_r1.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		RightArm_r1.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}