// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayCelestialGuardLeggings extends EntityModel<Entity> {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer tryapka;
	private final ModelRenderer tryapka_r1;
	private final ModelRenderer tryapka_r2;
	private final ModelRenderer tryapka_r3;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer tryapka2;
	private final ModelRenderer tryapka_r4;
	private final ModelRenderer tryapka_r5;
	private final ModelRenderer tryapka_r6;

	public WFMModelCathayCelestialGuardLeggings() {
		texWidth = 64;
		texHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.0436F);
		RightLeg_r1.texOffs(16, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		RightLeg_r1.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);

		tryapka = new ModelRenderer(this);
		tryapka.setPos(0.3004F, 0.1597F, -3.0437F);
		LeftLeg.addChild(tryapka);
		setRotationAngle(tryapka, -0.0438F, -0.0872F, -0.1707F);
		tryapka.texOffs(54, 3).addBox(-1.0F, 0.0F, 0.1128F, 5.0F, 7.0F, 0.0F, 0.0F, false);

		tryapka_r1 = new ModelRenderer(this);
		tryapka_r1.setPos(0.0F, 7.0F, 0.0F);
		tryapka.addChild(tryapka_r1);
		setRotationAngle(tryapka_r1, -0.3054F, 0.0F, 0.0F);
		tryapka_r1.texOffs(54, 10).addBox(-1.0F, 0.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		tryapka_r2 = new ModelRenderer(this);
		tryapka_r2.setPos(0.0F, -1.9696F, 0.3473F);
		tryapka.addChild(tryapka_r2);
		setRotationAngle(tryapka_r2, -0.8727F, 0.0F, 0.0F);
		tryapka_r2.texOffs(54, 3).addBox(-1.0F, -2.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		tryapka_r3 = new ModelRenderer(this);
		tryapka_r3.setPos(0.0F, 0.0F, 0.0F);
		tryapka.addChild(tryapka_r3);
		setRotationAngle(tryapka_r3, -0.1745F, 0.0F, 0.0F);
		tryapka_r3.texOffs(54, 4).addBox(-1.0F, -2.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(16, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		RightLeg_r2.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);

		tryapka2 = new ModelRenderer(this);
		tryapka2.setPos(-0.7749F, 0.0788F, -2.9596F);
		RightLeg.addChild(tryapka2);
		setRotationAngle(tryapka2, -0.0418F, 0.1003F, 0.127F);
		tryapka2.texOffs(54, 3).addBox(-4.0F, 0.0F, 0.1128F, 5.0F, 7.0F, 0.0F, 0.0F, false);

		tryapka_r4 = new ModelRenderer(this);
		tryapka_r4.setPos(-3.0F, 7.0F, 0.0F);
		tryapka2.addChild(tryapka_r4);
		setRotationAngle(tryapka_r4, -0.3054F, 0.0F, 0.0F);
		tryapka_r4.texOffs(54, 10).addBox(-1.0F, 0.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		tryapka_r5 = new ModelRenderer(this);
		tryapka_r5.setPos(-3.0F, -1.9696F, 0.3473F);
		tryapka2.addChild(tryapka_r5);
		setRotationAngle(tryapka_r5, -0.8727F, 0.0F, 0.0F);
		tryapka_r5.texOffs(54, 3).addBox(-1.0F, -2.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		tryapka_r6 = new ModelRenderer(this);
		tryapka_r6.setPos(-3.0F, 0.0F, 0.0F);
		tryapka2.addChild(tryapka_r6);
		setRotationAngle(tryapka_r6, -0.1745F, 0.0F, 0.0F);
		tryapka_r6.texOffs(54, 4).addBox(-1.0F, -2.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}