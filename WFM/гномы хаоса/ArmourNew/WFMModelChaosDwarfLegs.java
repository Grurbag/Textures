// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfLegsDefault extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftLeg_r1;

	public WFMModelDwarfLegsDefault() {
		texWidth = 64;
		texHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-2.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.65F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, 0.0436F);
		RightLeg_r1.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.1F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(2.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.65F, false);

		LeftLeg_r1 = new ModelRenderer(this);
		LeftLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, 0.0F, 0.0F, -0.0436F);
		LeftLeg_r1.texOffs(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.1F, false);
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