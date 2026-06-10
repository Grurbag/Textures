// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayLeggings extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer tryapka;
	private final ModelRenderer tryapka_r1;
	private final ModelRenderer tryapka_r2;
	private final ModelRenderer tryapka_r3;

	public WFMModelCathayLeggings() {
		texWidth = 64;
		texHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, 0.0436F);
		RightLeg_r1.texOffs(16, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		RightLeg_r1.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, -0.0436F);
		RightLeg_r2.texOffs(16, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, false);
		RightLeg_r2.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);

		tryapka = new ModelRenderer(this);
		tryapka.setPos(-3.1745F, -2.271F, -2.9128F);
		LeftLeg.addChild(tryapka);
		setRotationAngle(tryapka, -0.0436F, 0.0F, -0.1745F);
		tryapka.texOffs(54, 3).addBox(0.0F, 3.0F, 0.1128F, 5.0F, 7.0F, 0.0F, 0.0F, false);

		tryapka_r1 = new ModelRenderer(this);
		tryapka_r1.setPos(1.0F, 10.0F, 0.0F);
		tryapka.addChild(tryapka_r1);
		setRotationAngle(tryapka_r1, -0.3054F, 0.0F, 0.0F);
		tryapka_r1.texOffs(54, 10).addBox(-1.0F, 0.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		tryapka_r2 = new ModelRenderer(this);
		tryapka_r2.setPos(1.0F, 1.0304F, 0.3473F);
		tryapka.addChild(tryapka_r2);
		setRotationAngle(tryapka_r2, -0.8727F, 0.0F, 0.0F);
		tryapka_r2.texOffs(54, 3).addBox(-1.0F, -2.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);

		tryapka_r3 = new ModelRenderer(this);
		tryapka_r3.setPos(1.0F, 3.0F, 0.0F);
		tryapka.addChild(tryapka_r3);
		setRotationAngle(tryapka_r3, -0.1745F, 0.0F, 0.0F);
		tryapka_r3.texOffs(54, 4).addBox(-1.0F, -2.0F, 0.1128F, 5.0F, 2.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}