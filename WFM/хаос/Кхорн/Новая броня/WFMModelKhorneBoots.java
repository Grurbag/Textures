// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneBoots extends EntityModel<Entity> {
	private final ModelRenderer RightBoot;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightLeg_r2;

	public WFMModelKhorneBoots() {
		texWidth = 64;
		texHeight = 64;

		RightBoot = new ModelRenderer(this);
		RightBoot.setPos(-1.9F, 12.0F, 0.0F);
		RightBoot.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(-0.2F, 11.5F, -2.0F);
		RightBoot.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0873F, 0.0F, 0.0F);
		RightLeg_r1.texOffs(0, 37).addBox(-1.5F, -2.0F, -2.35F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		RightLeg_r1.texOffs(0, 32).addBox(-2.3F, -1.0F, -1.35F, 5.0F, 2.0F, 2.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setPos(1.9F, 12.0F, 0.0F);
		LeftBoot.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, true);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, 11.5F, -2.0F);
		LeftBoot.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0873F, 0.0F, 0.0F);
		RightLeg_r2.texOffs(0, 37).addBox(-1.5F, -2.0F, -2.35F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		RightLeg_r2.texOffs(0, 32).addBox(-2.5F, -1.0F, -1.35F, 5.0F, 2.0F, 2.0F, 0.0F, true);
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