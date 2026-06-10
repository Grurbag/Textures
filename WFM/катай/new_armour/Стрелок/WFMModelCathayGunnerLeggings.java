// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelCathayGunnerLeggings extends EntityModel<Entity> {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer gunpowder;
	private final ModelRenderer pounch;
	private final ModelRenderer pounch2;
	private final ModelRenderer pounch3;
	private final ModelRenderer pounch4;

	public WFMModelCathayGunnerLeggings() {
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

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(16, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.6F, true);
		RightLeg_r2.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);

		gunpowder = new ModelRenderer(this);
		gunpowder.setPos(0.5F, 0.5F, 0.0F);
		RightLeg.addChild(gunpowder);
		setRotationAngle(gunpowder, 0.0F, 0.0F, -0.2182F);
		gunpowder.texOffs(36, 57).addBox(-3.5F, -0.5F, -3.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);

		pounch = new ModelRenderer(this);
		pounch.setPos(-4.0F, 1.0F, 2.0F);
		gunpowder.addChild(pounch);
		setRotationAngle(pounch, 0.0F, 0.0F, 0.2618F);
		pounch.texOffs(28, 60).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		pounch2 = new ModelRenderer(this);
		pounch2.setPos(-1.0F, 1.0F, -3.0F);
		gunpowder.addChild(pounch2);
		setRotationAngle(pounch2, 0.0F, 0.0F, 0.2618F);
		pounch2.texOffs(28, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		pounch3 = new ModelRenderer(this);
		pounch3.setPos(-1.0F, 1.0F, 3.0F);
		gunpowder.addChild(pounch3);
		setRotationAngle(pounch3, 0.0F, 0.0F, 0.2618F);
		pounch3.texOffs(28, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		pounch4 = new ModelRenderer(this);
		pounch4.setPos(-4.0F, 1.0F, -2.0F);
		gunpowder.addChild(pounch4);
		setRotationAngle(pounch4, 0.0F, 0.0F, 0.2618F);
		pounch4.texOffs(28, 60).addBox(-1.0F, -1.0F, -1.1F, 2.0F, 2.0F, 2.0F, 0.0F, false);
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