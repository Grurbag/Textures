// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelNorscaBoots extends EntityModel<Entity> {
	private final ModelRenderer RightBoot;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer spike;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer spike2;

	public WFMModelNorscaBoots() {
		texWidth = 64;
		texHeight = 64;

		RightBoot = new ModelRenderer(this);
		RightBoot.setPos(-1.9F, 12.0F, 0.0F);
		RightBoot.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, 11.5F, -3.0F);
		RightBoot.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0873F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(0, 32).addBox(-2.5F, -1.0F, -0.35F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		spike = new ModelRenderer(this);
		spike.setPos(0.0F, 7.0F, -2.0F);
		RightBoot.addChild(spike);
		setRotationAngle(spike, 0.0F, 0.2618F, 0.0F);
		spike.texOffs(0, -3).addBox(0.0F, -3.0F, -3.0F, 0.0F, 7.0F, 3.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setPos(1.9F, 12.0F, 0.0F);
		LeftBoot.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, 11.5F, -3.0F);
		LeftBoot.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0873F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(0, 32).addBox(-2.5F, -1.0F, -0.35F, 5.0F, 2.0F, 1.0F, 0.0F, true);

		spike2 = new ModelRenderer(this);
		spike2.setPos(-0.237F, 7.0F, -2.0816F);
		LeftBoot.addChild(spike2);
		setRotationAngle(spike2, 0.0F, -0.3054F, 0.0F);
		spike2.texOffs(0, -3).addBox(0.0F, -3.0F, -3.0F, 0.0F, 7.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}