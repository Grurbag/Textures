// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevLeggings extends EntityModel<Entity> {
	private final ModelRenderer Body2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r2;

	public WFMModelKislevLeggings() {
		texWidth = 64;
		texHeight = 64;

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, -0.0436F);
		RightLeg_r1.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, 0.0436F);
		RightLeg_r2.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.7F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}